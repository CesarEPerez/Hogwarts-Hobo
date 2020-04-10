import javax.swing.*;
import java.awt.*;
public class AnimationPanel extends JPanel {
    
    private int numberOfTracks;
    private int numberOfHobos;
    private int interTrainDistance;
    private boolean lyingHobos;
    private int distributionType;

    private Track[] tracks;
    private Hobo[] hobos;

    public AnimationPanel(int numberOfTracks, int numberOfHobos, int interTrainDistance, boolean lyingHobos, int distributionType) {
        setBackground(Color.BLACK);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

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
        
        // c.gridx = 0;
        // c.gridy = 0;
        // add(label1, c);
        // c.gridy = 1;
        // add(label2, c);
        // c.gridy = 2;
        // add(label3, c);
        // c.gridy = 3;
        // add(label4, c);
        // c.gridy = 4;
        // add(label5, c);

    }

    private void createTracks() {
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