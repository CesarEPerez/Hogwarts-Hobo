import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.SwingUtilities;

public class AnimationPanel extends JPanel {

    Timer t = new Timer(100,null);// updates graphics
    int secondsCounter = 0;
    
    private int numberOfTracks;
    private int numberOfHobos;
    private int interTrainTime;
    private boolean lyingHobos;
    private int distributionType;

    private Track[] tracks;
    private Character[] hobos;

    public AnimationPanel(int numberOfTracks, int numberOfHobos, int interTrainTime, 
    boolean lyingHobos, int distributionType, PanelSwitcher panelSwitcher) {
      
        setLayout(null);
        setBackground(Color.BLACK);
        DrawArea canvas = new DrawArea(830, 420);
        t.addActionListener(new TimerListener(panelSwitcher));
       
        
        this.numberOfTracks = numberOfTracks;
        this.numberOfHobos = numberOfHobos;
        this.interTrainTime = interTrainTime;
        this.lyingHobos = lyingHobos;
        this.distributionType = distributionType;

        // String dist;
        // if (distributionType == 0) dist = "Random"; else dist = "Poisson";
        // JLabel label1 = new JLabel("Number or tracks: "+numberOfTracks);
        // JLabel label2 = new JLabel("Number or hobos: "+numberOfHobos);
        // JLabel label3 = new JLabel("Inter-train distance: "+interTrainDistance);
        // JLabel label4 = new JLabel("Lying hobos: "+lyingHobos);
        // JLabel label5 = new JLabel("Distribution type: " + dist);
        
        // label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        // label1.setForeground(Color.WHITE);
        // label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        // label2.setForeground(Color.WHITE);
        // label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        // label3.setForeground(Color.WHITE);
        // label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        // label4.setForeground(Color.WHITE);
        // label5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        // label5.setForeground(Color.WHITE);
        
       
        add(canvas);
        setFocusable(true);
        setVisible(true);
        // add(label1, c);
        // c.gridy = 1;
        // add(label2, c);
        // c.gridy = 2;
        // add(label3, c);
        // c.gridy = 3;
        // add(label4, c);
        // c.gridy = 4;
        // add(label5, c);

        createTracks();
        createHobos();

    }//end of panel

    private void createTracks() {
        this.tracks = new Track[this.numberOfTracks];
        for (int i = 0; i < this.tracks.length; i++) {
            this.tracks[i] = new Track(i, interTrainTime);
        }
    }

    private void createHobos() {
        this.hobos = new Character[this.numberOfHobos];
        for (int i = 0; i < this.hobos.length; i++) {
            this.hobos[i] = new Character(this.numberOfTracks, i);
        }
    }

    private int isHoboOnTrack(int trackID) {
        for (int i = 0; i < this.hobos.length; i++) {
            if (hobos[i].getTrack() == trackID) return i;
        }
        return -1;
    }

    public Character getWinner() {
        Character winner = null;
        for (int i = 0; i < this.hobos.length; i++) {
            if (hobos[i].isAlive()) 
                if (winner == null) winner = hobos[i];
                else return null;
        }
        return winner;
    }

    public void update()
    {
        for (Character hobo : hobos) hobo.changeTrackRandom();
        for (int i = 0; i < this.tracks.length; i++) {
            boolean hasTrain = tracks[i].spawnNextTrain(secondsCounter);
            if (hasTrain) {
                int hobo = isHoboOnTrack(i);
                if (hobo >= 0) this.hobos[hobo].loseLife(); 
            }
        }
        repaint();
    }

    public void decide()
    {

    }

    //========================================<Draw class>======================================= 
    class DrawArea extends JPanel
    {//start of drawarea
        
        public DrawArea (int width, int height)// Create panel of given size
        {//start of drawarea
            this.setBounds( 0, 0, width, height);//(new Dimension (width, height));
            this.setBackground(Color.BLACK);
        }//end of drawarea
        @Override
        public void paintComponent (Graphics g)  // g can be passed to a class method
        {//start of paintComponent
            super.paintComponent(g);
            for(int y = 1; y <= numberOfTracks; y++ )
            {
                int isHobo = isHoboOnTrack(y-1);
                if (tracks[y-1].getTrainOn()) {
                    if (isHobo >= 0) g.setColor(Color.RED);
                    else g.setColor(Color.YELLOW);
                } else if (isHobo >= 0) g.setColor(Color.BLUE);
                else g.setColor(Color.WHITE);
                g.fillRect(65, (y*25) + ((y-1)*20) , 700, 20);
            }
            

            for(int y = 0; y < numberOfHobos; y++)
            {
                //g.fillOval(405, ((hobos[y].getTrack()*25)+(y*20)) , 20, 20);
            }

        }//end of paintComponent

        public void drawtracks(Graphics g)
        {

        } 
        

    }//end of drawarea



    class TimerListener implements ActionListener //reacts to timer
    {//start

        PanelSwitcher panelSwitcher;
        TimerListener(PanelSwitcher panelSwitcher)
        {//start
            this.panelSwitcher = panelSwitcher;
            t.start();//starts timer
        }//end
        public void actionPerformed (ActionEvent e)
        {//start of void
            // System.out.println("Hi");
            secondsCounter++;
            update();//updates graphics
            // decide();//decides what to do 

            // System.out.println(secondsCounter); //Print the counter

            // if(secondsCounter%50==0) {
            //     System.out.println("5 seconds have passed");
            // }

            Character winner = getWinner();
            if (winner != null) {
                t.stop();
                panelSwitcher.switchPanel();
            }

        }
            //if(secondsCounter){ //After 30s stop simulation
                //t.stop();
            //}

        //   if (numberOfHobos==1){ //If only 1 Hobo left, stop the game
        //       t.stop();
        //   }
    }//end of void

}
