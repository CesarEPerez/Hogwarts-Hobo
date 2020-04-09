import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;


public class SetupPanel extends JPanel {
    
    public SetupPanel(PanelSwitcher panelSwitcher) {
        setBackground(Color.WHITE);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
        
        JLabel numTrackVal = new JLabel("1 track(s)	");
		numTrackVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numTrackVal.setBounds(328, 107, 70, 26);
		add(numTrackVal);
		
		JSlider numTrackSlider = new JSlider();
		numTrackSlider.setBounds(55, 113, 252, 26);
		numTrackSlider.setBackground(Color.WHITE);
		numTrackSlider.setSnapToTicks(true);
		numTrackSlider.setPaintLabels(true);
		numTrackSlider.setMinorTickSpacing(1);
		numTrackSlider.setMaximum(6);
		numTrackSlider.setMinimum(1);
		numTrackSlider.setValue(1);
		numTrackSlider.setPaintTicks(true);
		numTrackSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int numTrack = numTrackSlider.getValue();
				numTrackVal.setText("" + numTrack + " track(s)");
			}
		});
		add(numTrackSlider);
		
		JLabel lblHogwartsHoboTrain = new JLabel("Hogwarts Hobo Train Simulation");
		lblHogwartsHoboTrain.setBounds(241, 16, 311, 46);
		lblHogwartsHoboTrain.setHorizontalAlignment(SwingConstants.CENTER);
		lblHogwartsHoboTrain.setFont(new Font("Tahoma", Font.PLAIN, 21));
		add(lblHogwartsHoboTrain);
		
		JLabel lblNumberOfTracks = new JLabel("Number of Tracks");
		lblNumberOfTracks.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumberOfTracks.setBounds(55, 81, 120, 26);
		add(lblNumberOfTracks);
		
		JLabel lblNumberOfHobos = new JLabel("Number of Hobos");
		lblNumberOfHobos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumberOfHobos.setBounds(55, 169, 120, 14);
		add(lblNumberOfHobos);
		
		JLabel numHobosVal = new JLabel("1 hobo(s)");
		numHobosVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numHobosVal.setBounds(328, 194, 70, 14);
		add(numHobosVal);
		
		JSlider numHobosSlider = new JSlider();
		numHobosSlider.setBounds(55, 194, 252, 26);
		numHobosSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int numHobos = numHobosSlider.getValue();
				numHobosVal.setText("" + numHobos + " hobo(s)");
			}
		});
		numHobosSlider.setMinorTickSpacing(1);
		numHobosSlider.setBackground(Color.WHITE);
		numHobosSlider.setValue(1);
		numHobosSlider.setSnapToTicks(true);
		numHobosSlider.setPaintTicks(true);
		numHobosSlider.setPaintLabels(true);
		numHobosSlider.setMinimum(1);
		numHobosSlider.setMaximum(10);
		add(numHobosSlider);
		
		JLabel lblIntertrainDistance = new JLabel("Inter-train distance");
		lblIntertrainDistance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIntertrainDistance.setBounds(56, 253, 120, 14);
		add(lblIntertrainDistance);
		
		JLabel inter_trainDistanceVal = new JLabel("0");
		inter_trainDistanceVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		inter_trainDistanceVal.setBounds(329, 278, 69, 14);
		add(inter_trainDistanceVal);
		
		JSlider inter_trainDistanceSlider = new JSlider();
		inter_trainDistanceSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int inter_trainDistance = inter_trainDistanceSlider.getValue();
				inter_trainDistanceVal.setText("" + inter_trainDistance + "m");
			}
		});
		inter_trainDistanceSlider.setMinorTickSpacing(50);
		inter_trainDistanceSlider.setMajorTickSpacing(250);
		inter_trainDistanceSlider.setValue(0);
		inter_trainDistanceSlider.setPaintTicks(true);
		inter_trainDistanceSlider.setPaintLabels(true);
		inter_trainDistanceSlider.setMaximum(1000);
		inter_trainDistanceSlider.setBackground(Color.WHITE);
		inter_trainDistanceSlider.setBounds(49, 278, 259, 36);
		add(inter_trainDistanceSlider);
		
		
		
		JLabel lblNumberOfHobos_2 = new JLabel("Number of Hobos");
		lblNumberOfHobos_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumberOfHobos_2.setBounds(449, 86, 120, 14);
		add(lblNumberOfHobos_2);
		
		JSlider numHobosSlider_2 = new JSlider();
		numHobosSlider_2.setValue(1);
		numHobosSlider_2.setSnapToTicks(true);
		numHobosSlider_2.setPaintTicks(true);
		numHobosSlider_2.setPaintLabels(true);
		numHobosSlider_2.setMinorTickSpacing(1);
		numHobosSlider_2.setMinimum(1);
		numHobosSlider_2.setMaximum(10);
		numHobosSlider_2.setBackground(Color.WHITE);
		numHobosSlider_2.setBounds(449, 111, 252, 26);
		add(numHobosSlider_2);
		
		JLabel numHobosVal_2 = new JLabel("1");
		numHobosVal_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numHobosVal_2.setBounds(722, 111, 70, 14);
		add(numHobosVal_2);
		
		JLabel lblNumberOfHobos_3 = new JLabel("Number of Hobos");
		lblNumberOfHobos_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumberOfHobos_3.setBounds(452, 168, 120, 14);
		add(lblNumberOfHobos_3);
		
		JSlider numHobosSlider_3 = new JSlider();
		numHobosSlider_3.setValue(1);
		numHobosSlider_3.setSnapToTicks(true);
		numHobosSlider_3.setPaintTicks(true);
		numHobosSlider_3.setPaintLabels(true);
		numHobosSlider_3.setMinorTickSpacing(1);
		numHobosSlider_3.setMinimum(1);
		numHobosSlider_3.setMaximum(10);
		numHobosSlider_3.setBackground(Color.WHITE);
		numHobosSlider_3.setBounds(452, 193, 252, 26);
		add(numHobosSlider_3);
		
		JLabel numHobosVal_3 = new JLabel("1");
		numHobosVal_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numHobosVal_3.setBounds(725, 193, 67, 14);
		add(numHobosVal_3);
		
		JLabel lblNumberOfHobos_4 = new JLabel("Number of Hobos");
		lblNumberOfHobos_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumberOfHobos_4.setBounds(452, 252, 120, 14);
		add(lblNumberOfHobos_4);
		
		JSlider numHobosSlider_4 = new JSlider();
		numHobosSlider_4.setValue(1);
		numHobosSlider_4.setSnapToTicks(true);
		numHobosSlider_4.setPaintTicks(true);
		numHobosSlider_4.setPaintLabels(true);
		numHobosSlider_4.setMinorTickSpacing(1);
		numHobosSlider_4.setMinimum(1);
		numHobosSlider_4.setMaximum(10);
		numHobosSlider_4.setBackground(Color.WHITE);
		numHobosSlider_4.setBounds(452, 277, 252, 26);
		add(numHobosSlider_4);
		
		JLabel numHobosVal_4 = new JLabel("1");
		numHobosVal_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numHobosVal_4.setBounds(725, 277, 67, 14);
        add(numHobosVal_4);
        
        JButton btn = new JButton("OK");
        btn.setBounds(56, 353, 70, 30);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panelSwitcher.switchPanel();
            }
        });
        add(btn);
    }

}