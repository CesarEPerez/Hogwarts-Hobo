import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.SwingUtilities;

public class AnimationPanel extends JPanel {

    Timer t = new Timer(100,null);// updates graphics
    int secondsCounter = 0;
    
    private int numberOfTracks;
    private int numberOfHobos;
    private int interTrainDistance;
    private boolean lyingHobos;
    private int distributionType;

    private Track[] tracks;
    private Character[] hobos;

    public AnimationPanel(int numberOfTracks, int numberOfHobos, int interTrainDistance, 
    boolean lyingHobos, int distributionType, PanelSwitcher panelSwitcher) {
      
        setLayout(null);
        setBackground(Color.BLACK);
        DrawArea canvas = new DrawArea(830, 420);
        t.addActionListener(new TimerListener(panelSwitcher));
       
        
        this.numberOfTracks = numberOfTracks;
        this.numberOfHobos = numberOfHobos;
        this.interTrainDistance = interTrainDistance;
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

    }//end of panel

    private void createTracks() {
        Track track;
        this.tracks = new Track[numberOfTracks];
        for (int i = 0; i < tracks.length; i++) {
            track = new Track(i);
        }
    }

    private void createHobos() {
        this.hobos = new Character[numberOfHobos];
        for (Character hobo : this.hobos) {
            hobo = new Character(this.numberOfTracks);
        }
    }

    private void changeHoboTracksRandom() {
        for (Character hobo : this.hobos) {
            hobo.changeTrackRandom();
        }
    }

    public void update()
    {
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
            g.setColor(Color.WHITE);
            for(int y = 1; y <= numberOfTracks; y++ )
            {
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
            System.out.println("Hi");
            secondsCounter++;
            update();//updates graphics
            decide();//decides what to do 

            System.out.println(secondsCounter); //Print the counter

            if(secondsCounter%100==0) {
                System.out.println("10 second has passed");
            }

            if(secondsCounter==300){ //After 30s stop simulation
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
