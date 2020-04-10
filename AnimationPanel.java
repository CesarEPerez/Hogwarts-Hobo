import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AnimationPanel extends JPanel {

    Timer t = new Timer(50,null);// updates graphics
    
    private int numberOfTracks;
    private int numberOfHobos;
    private int interTrainDistance;
    private boolean lyingHobos;
    private int distributionType;

    private Track[] tracks;
    private Character[] hobos;

    public AnimationPanel(int numberOfTracks, int numberOfHobos, int interTrainDistance, boolean lyingHobos, int distributionType) {
        setBackground(Color.BLACK);
        setLayout();
        DrawArea canvas = new DrawArea(830, 420);
        setFocusable(true);
        setVisible(true);
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
        
        //c.gridx = 0;
        //c.gridy = 0;
        add(canvas);
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
    }//end of drawarea
    
    public void paintComponent (Graphics g)  // g can be passed to a class method
    {//start of paintComponent
        g.setColor(Color.WHITE);
        g.drawLine(100, 100, 300, 100);
    }//end of paintComponent

    public void drawtracks(Graphics g)
    {

    } 
    
    
    }//end of drawarea



    class TimerListener implements ActionListener //reacts to timer
  {//start
    TimerListener()
    {//start
      t.start();//starts timer
    }//end
    public void actionPerformed (ActionEvent e)
    {//start of void
      update();//updates graphics
      decide();//decides what to do 
    } //end of void
  }//end of class 
  
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

} 
