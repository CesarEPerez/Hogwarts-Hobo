import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.*;


public class SetupPanel extends JPanel {

	private int numberOfTracks;
	private int numberOfHobos;
	private int interTrainDistance;
	private int lyingHobos;
	private int distributionType;

    public SetupPanel(PanelSwitcher panelSwitcher) {
        setBackground(Color.WHITE);
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		setBounds(100, 100, 830, 630);
        
        JLabel numTrackVal = new JLabel("2 tracks");
		numTrackVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numTrackVal.setBounds(328, 107, 70, 26);
		add(numTrackVal);
		
		JSlider numTrackSlider = new JSlider();
		numTrackSlider.setMajorTickSpacing(1);
		numTrackSlider.setBounds(55, 113, 252, 45);
		numTrackSlider.setBackground(Color.WHITE);
		numTrackSlider.setSnapToTicks(true);
		numTrackSlider.setPaintLabels(true);
		numTrackSlider.setMaximum(6);
		numTrackSlider.setMinimum(2);
		numTrackSlider.setValue(2);
		numTrackSlider.setPaintTicks(true);
		numTrackSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int numTrack = numTrackSlider.getValue();
				numTrackVal.setText("" + numTrack + " tracks");
			}
		});
		add(numTrackSlider);
		
		JLabel lblHogwartsHoboTrain = new JLabel("Hogwarts Hobo Train Simulation");
		lblHogwartsHoboTrain.setBounds(258, 11, 311, 46);
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
		
		JLabel numHobosVal = new JLabel("1 hobo");
		numHobosVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		numHobosVal.setBounds(328, 194, 70, 14);
		add(numHobosVal);
		
		JSlider numHobosSlider = new JSlider();
		numHobosSlider.setMajorTickSpacing(1);
		numHobosSlider.setBounds(55, 194, 252, 45);
		numHobosSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int numHobos = numHobosSlider.getValue();
				numHobosVal.setText("" + numHobos + " hobo(s)");
			}
		});
		numHobosSlider.setBackground(Color.WHITE);
		numHobosSlider.setValue(1);
		numHobosSlider.setSnapToTicks(true);
		numHobosSlider.setPaintTicks(true);
		numHobosSlider.setPaintLabels(true);
		numHobosSlider.setMinimum(1);
		numHobosSlider.setMaximum(3);
		add(numHobosSlider);
		
		JLabel lblIntertrainTime = new JLabel("Inter-train Time");
		lblIntertrainTime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIntertrainTime.setBounds(56, 253, 120, 14);
		add(lblIntertrainTime);
		
		JLabel inter_trainTimeVal = new JLabel("0");
		inter_trainTimeVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		inter_trainTimeVal.setBounds(329, 278, 69, 14);
		add(inter_trainTimeVal);
		
		JSlider inter_trainTimeSlider = new JSlider();
		inter_trainTimeSlider.setMinimum(2);
		inter_trainTimeSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int inter_trainTime = inter_trainTimeSlider.getValue();
				inter_trainTimeVal.setText("" + inter_trainTime + "s");
			}
		});
		inter_trainTimeSlider.setMajorTickSpacing(1);
		inter_trainTimeSlider.setValue(2);
		inter_trainTimeSlider.setPaintTicks(true);
		inter_trainTimeSlider.setPaintLabels(true);
		inter_trainTimeSlider.setSnapToTicks(true);
		inter_trainTimeSlider.setMaximum(5);
		inter_trainTimeSlider.setBackground(Color.WHITE);
		inter_trainTimeSlider.setBounds(49, 278, 259, 45);
		add(inter_trainTimeSlider);
		
		
		
		JLabel lbLie = new JLabel("Hobos Sometimes Lie");
		lbLie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbLie.setBounds(449, 86, 256, 14);
		add(lbLie);
		
		JLabel lieVal = new JLabel("False");
		lieVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lieVal.setBounds(722, 111, 70, 14);
		add(lieVal);
		
		JSlider lieSlider = new JSlider();
		lieSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int lieBool = lieSlider.getValue();
				if(lieBool==1) lieVal.setText("True");
				else lieVal.setText("False");
				
			}
		});
		lieSlider.setValue(0);
		lieSlider.setSnapToTicks(true);
		lieSlider.setPaintTicks(true);
		lieSlider.setPaintLabels(true);
		lieSlider.setMaximum(1);
		lieSlider.setBackground(Color.WHITE);
		lieSlider.setBounds(449, 111, 252, 26);
		add(lieSlider);
		
		
		
		JLabel lbDistType = new JLabel("Distribution type");
		lbDistType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbDistType.setBounds(452, 168, 120, 14);
		add(lbDistType);
		
		JLabel distTypeVal = new JLabel("Random");
		distTypeVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		distTypeVal.setBounds(725, 193, 67, 14);
		add(distTypeVal);
		
		JSlider distTypeSlider = new JSlider();
		distTypeSlider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int distTypeBool = distTypeSlider.getValue();
				if(distTypeBool==1) distTypeVal.setText("Poisson");
				else distTypeVal.setText("Random");
			}
		});
		distTypeSlider.setValue(0);
		distTypeSlider.setSnapToTicks(true);
		distTypeSlider.setPaintTicks(true);
		distTypeSlider.setPaintLabels(true);
		distTypeSlider.setMaximum(1);
		distTypeSlider.setBackground(Color.WHITE);
		distTypeSlider.setBounds(452, 193, 252, 26);
		add(distTypeSlider);
		
		JButton btnBeginSimulation = new JButton("OK");
        btnBeginSimulation.setBounds(56, 353, 70, 30);
        btnBeginSimulation.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
				numberOfTracks = numTrackSlider.getValue();
				numberOfHobos = numHobosSlider.getValue();
				interTrainDistance = inter_trainTimeSlider.getValue();
				lyingHobos = lieSlider.getValue();
				distributionType = distTypeSlider.getValue();
                panelSwitcher.switchPanel();
            }
        });
		btnBeginSimulation.setBounds(484, 253, 197, 45);
		add(btnBeginSimulation);
	}

	public int getNumberOfTracks() { return this.numberOfTracks; }
	
	public int getNumberOfHobos() { return this.numberOfHobos; }

	public int getInterTrainDistance() { return this.interTrainDistance; }

	public boolean getLyingHobos() { return this.lyingHobos == 1; }

	public int getDistributionType() { return this.distributionType; }

}