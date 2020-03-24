import java.awt.*; //abstract windows toolkit used for gui objects
import java.io.File; //for files
import java.util.Collections; //Allows use of Collections
import java.awt.event.*; //Allows use of events
import javax.swing.*; //also used for gui objects
import javax.swing.Timer; // Allow use of timer
import javax.swing.event.*; // Allows use of events
import javax.imageio.*; // for images
import java.io.*; // for file reading/loading
import java.io.FileNotFoundException; //exception error
import java.util.ArrayList; //allows use of Arraylist  
import java.awt.Color; //for color
import java.awt.Graphics; //for drawing graphics



public class Hobo_Game extends JFrame
{// start

  Timer animation = new Timer(80,null);//manages transitions  

//==================================<Image Method>====================================
  public static Image loadImage (String name)  //Loads image from file
  {//start
    Image img = null;
    try
    {
      img = ImageIO.read (new File (name));
    }
    catch (IOException e)
    {
    }
    return img;
  }//end 
//==================================<Sound Method>====================================  
 

//=================================<Panel constructor>============================== 
  public Hobo_Game() 
  {// start of panel setup
    // Creating JPanel for the background and JPanel for interations (options)
    setLayout (new BorderLayout ());// Use BorderLayout for main panel
    JPanel background = new JPanel (); // Create a content panel to hold the backgournd images
    background.setLayout(null);// sets layout to null so that set bounds can be used 
    // timer setup   
  
    // Colouring panels  
    setBackground(Color.BLACK);
    //timer setup   
  
    // Creating Drawing Area and Panel Setup
    DrawArea playfield = new DrawArea (1080, 740);
    background.add(playfield); // Output area
    setContentPane(background);
    background.setFocusable(true);
//--------------------------------------------------------------------        
 
//--------------------------------------------------------------------
    pack();
    // Game window Setup  
    setTitle("Hobo Game");
    background.setPreferredSize (new Dimension (1080,740));
    setSize(1080,740); //Sets the JFrame size
    setVisible(true); //Reveals JFrame
    setResizable(false); 
    setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);//centers window on launch    
  }//end of panel setup
//========================================<Draw class>======================================= 
  class DrawArea extends JPanel
  {//start of drawarea
    // load images for use
  
    
    public DrawArea (int width, int height)// Create panel of given size
    {//start of drawarea
      this.setBounds( 0, 0, width, height);//(new Dimension (width, height));
    }//end of drawarea
    public void paintComponent (Graphics g)  // g can be passed to a class method
    {//start of paintComponent
      Font f1 = new Font ("Impact", Font.PLAIN, 30);
      g.setFont(f1);
      g.drawString("test string", 540, 320);
    }//end
   }///end of class
//----------------------------------------------------------------------------------------
 
//================================================================================== 
  public static void main(String[] args)
  {///start of main 
    Hobo_Game game = new  Hobo_Game();
    game.setVisible (true);
  }//end of main
}///end of class
