import javax.swing.*;
import java.awt.*;


public class EndScreen extends JPanel {

    public EndScreen(int id, int lives) {

        setBackground(Color.BLACK);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JLabel winnerLabel;
        JLabel healthLabel;
        
        if (id >= 0) {
            winnerLabel = new JLabel("Winner ID: " + id);
            healthLabel = new JLabel("Final health: " + lives);
            
        } else {
            winnerLabel = new JLabel("All hobos are dead!");
            healthLabel = new JLabel();
        }

        winnerLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
        healthLabel.setFont(new Font("Tahoma", Font.PLAIN, 50));
        winnerLabel.setForeground(Color.WHITE);
        healthLabel.setForeground(Color.WHITE);


        c.gridx = 0;
        c.gridy = 0;
        add(winnerLabel, c);
        c.gridy = 1;
        add(healthLabel, c);

    }

}