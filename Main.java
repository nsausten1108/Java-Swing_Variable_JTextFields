/* Name: Nick Austen
 * Date: 30 Mar 2024
 * Purpose: This program creates a GUI that takes in user inputs, and generates text fields based on those user inputs. This is the main class, 
 * which is the first GUI that the user encounters.
 * 
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {
	//Sets nouns, verbs, adjectives, and and names to 1 as default, if no other value is entered.
	private int nounCount = 1;
	private int verbCount = 1;
	private int adverbCount = 1;
	private int adjectiveCount = 1;
	private int nameCount = 1;
	
	private static final long serialVersionUID = 1L;
	//Text fields for user inputs
	private JPanel contentPane;
	private JTextField nounsField;
	private JTextField verbsField;
	private JTextField adverbsField;
	private JTextField adjectivesField;	
	private JTextField namesField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		//Content pane for text fields and buttons
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nounsField = new JTextField();
		nounsField.setBounds(10, 47, 86, 20);
		contentPane.add(nounsField);
		nounsField.setColumns(10);
		
		verbsField = new JTextField();
		verbsField.setColumns(10);
		verbsField.setBounds(106, 47, 86, 20);
		contentPane.add(verbsField);
		
		adverbsField = new JTextField();
		adverbsField.setColumns(10);
		adverbsField.setBounds(202, 47, 86, 20);
		contentPane.add(adverbsField);
		
		adjectivesField = new JTextField();
		adjectivesField.setColumns(10);
		adjectivesField.setBounds(298, 47, 86, 20);
		contentPane.add(adjectivesField);
		
		namesField = new JTextField();
		namesField.setColumns(10);
		namesField.setBounds(394, 47, 86, 20);
		contentPane.add(namesField);
		
		JLabel nounLabel = new JLabel("Nouns");
		nounLabel.setHorizontalAlignment(SwingConstants.CENTER);
		nounLabel.setBounds(10, 22, 86, 20);
		contentPane.add(nounLabel);
		
		JLabel verbsLabel = new JLabel("Verbs");
		verbsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		verbsLabel.setBounds(106, 22, 86, 20);
		contentPane.add(verbsLabel);
		
		JLabel adverbsLabel = new JLabel("Adverbs");
		adverbsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		adverbsLabel.setBounds(202, 22, 86, 20);
		contentPane.add(adverbsLabel);
		
		JLabel adjectivesLabel = new JLabel("Adjectives");
		adjectivesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		adjectivesLabel.setBounds(298, 22, 86, 20);
		contentPane.add(adjectivesLabel);
		
		JLabel namesLabel = new JLabel("Names");
		namesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		namesLabel.setBounds(394, 22, 86, 20);
		contentPane.add(namesLabel);
		//Buttons to set values. Prints values to console as confirmation
		JButton nounsButton = new JButton("Set Nouns");
		nounsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nounCount = Integer.parseInt(nounsField.getText());
				System.out.println("Current number of nouns is: " + nounCount);
			}
		});
		nounsButton.setBounds(10, 78, 86, 23);
		contentPane.add(nounsButton);
		
		JButton verbsButton = new JButton("Set Verbs");
		verbsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				verbCount = Integer.parseInt(verbsField.getText());
				System.out.println("Current number of verbs is: " + verbCount);
			}
		});
		verbsButton.setBounds(106, 78, 86, 23);
		contentPane.add(verbsButton);
		
		JButton adverbsButton = new JButton("Set Adverbs");
		adverbsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adverbCount = Integer.parseInt(adverbsField.getText());
				System.out.println("Current number of adverbs is: " + adverbCount);
			}
		});
		adverbsButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		adverbsButton.setBounds(202, 78, 86, 23);
		contentPane.add(adverbsButton);
		
		JButton adjectivesButton = new JButton("Set Adjectives");
		adjectivesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adjectiveCount = Integer.parseInt(adjectivesField.getText());
				System.out.println("Current number of adjectives is: " + adjectiveCount);
			}
		});
		adjectivesButton.setFont(new Font("Tahoma", Font.PLAIN, 8));
		adjectivesButton.setBounds(298, 78, 86, 23);
		contentPane.add(adjectivesButton);
		
		JButton namesButton = new JButton("Set Names");
		namesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameCount = Integer.parseInt(namesField.getText());
				System.out.println("Current number of names is: " + nameCount);
			}
		});
		namesButton.setBounds(394, 78, 86, 23);
		contentPane.add(namesButton);
		//Create inputs button. Opens new window based on WordInputs class.
		JButton createInputsButton = new JButton("CreateInputs");
		createInputsButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				WordInputs wi = new WordInputs(Main.this);
				wi.setVisible(true);
			}
		});
		createInputsButton.setBounds(177, 127, 142, 23);
		contentPane.add(createInputsButton);
	}
	//Getters for WordInputs class. No setters required, since fields aren't going to be set outside of this class.
	public int getNouns () {
		return nounCount;
	}
	public int getVerbs() {
		return verbCount;
	}
	public int getAdverbs() {
		return adverbCount;
	}
	public int getAdjectives() {
		return adjectiveCount;
	}
	public int getNames() {
		return nameCount;
	}
}
