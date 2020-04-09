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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 830, 630);
		endScreen = new EndScreen("Bob", 1);
		setupScreen = new SetupPanel(new PanelSwitcher() {
			public void switchPanel() {
				// int numberOfTracks = setupScreen.numberOfTracks;
				// int numberOfHobos = setupScreen.getNumberOfHobos();
				// int interTrainDistance = setupScreen.getInterTrainDistance();
				// boolean lyingHobos = setupScreen.getLyingHobos();
				// int distributionType = setupScreen.getDistributionType();
				// JPanel animationScreen = new AnimationPanel(numberOfTracks, numberOfHobos, interTrainDistance, lyingHobos, distributionType);
				setupScreen.setVisible(false);
				// add(animationScreen);
			}
		});
		add(setupScreen);
	}
}