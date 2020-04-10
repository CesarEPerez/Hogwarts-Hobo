import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Hobo_Game extends JFrame {

  private JPanel setupScreen;
  private JPanel endScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hobo_Game frame = new Hobo_Game();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Hobo_Game() {
		setTitle("Hogwarts Hobo Game");
		setBackground(Color.WHITE);
		pack();  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(830,420);
		//setBounds(100, 100, 830, 420);
		setResizable(false); 
		setLocationRelativeTo(null);//centers window on launch  
		endScreen = new EndScreen("Bob", 1);
		setupScreen = new SetupPanel(new PanelSwitcher() {
			public void switchPanel() {
				int numberOfTracks = ((SetupPanel) setupScreen).getNumberOfTracks();
				int numberOfHobos = ((SetupPanel) setupScreen).getNumberOfHobos();
				int interTrainDistance = ((SetupPanel) setupScreen).getInterTrainDistance();
				boolean lyingHobos = ((SetupPanel) setupScreen).getLyingHobos();
				int distributionType = ((SetupPanel) setupScreen).getDistributionType();
				JPanel animationScreen = new AnimationPanel(numberOfTracks, numberOfHobos, interTrainDistance, lyingHobos, distributionType);
				setupScreen.setVisible(false);
				add(animationScreen);
			}
		});
		add(setupScreen);
	}
}