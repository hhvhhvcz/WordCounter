package code;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Main {

	private JFrame frame;
	private JTextField pathField;
	private JTextField resLine;
	private JTextField resNWhite;
	private JTextField resAll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 642, 523);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFilepath = new JLabel("Filepath:");
		lblFilepath.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFilepath.setBounds(34, 23, 66, 25);
		frame.getContentPane().add(lblFilepath);
		
		pathField = new JTextField();
		pathField.setBounds(117, 25, 116, 22);
		frame.getContentPane().add(pathField);
		pathField.setColumns(10);
		
		JButton btnShowData = new JButton("Show data");
		btnShowData.setBounds(276, 24, 97, 25);
		frame.getContentPane().add(btnShowData);
		
		JLabel lblNewLabel = new JLabel("Line count:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(34, 112, 87, 31);
		frame.getContentPane().add(lblNewLabel);
		
		resLine = new JTextField();
		resLine.setEditable(false);
		resLine.setBounds(139, 117, 116, 22);
		frame.getContentPane().add(resLine);
		resLine.setColumns(10);
		
		JLabel lblNonwhiteCharacters = new JLabel("Non-white characters:");
		lblNonwhiteCharacters.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNonwhiteCharacters.setBounds(34, 171, 167, 31);
		frame.getContentPane().add(lblNonwhiteCharacters);
		
		resNWhite = new JTextField();
		resNWhite.setEditable(false);
		resNWhite.setColumns(10);
		resNWhite.setBounds(213, 176, 116, 22);
		frame.getContentPane().add(resNWhite);
		
		resAll = new JTextField();
		resAll.setEditable(false);
		resAll.setColumns(10);
		resAll.setBounds(154, 234, 116, 22);
		frame.getContentPane().add(resAll);
		
		JLabel lblAllCharacters = new JLabel("All characters:");
		lblAllCharacters.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAllCharacters.setBounds(33, 229, 109, 31);
		frame.getContentPane().add(lblAllCharacters);
		
		JButton btnClearAll = new JButton("Clear all");
		btnClearAll.setBounds(407, 24, 97, 25);
		frame.getContentPane().add(btnClearAll);
	}
}
