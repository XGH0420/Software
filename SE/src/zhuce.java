import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.se.contral.VipinformationContral;


public class zhuce extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zhuce frame = new zhuce();
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
	public zhuce() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JLabel label = new JLabel("\u4F1A\u5458\u53F7");
		label.setBounds(30, 53, 54, 15);
		layeredPane.add(label);
		
		JLabel label_1 = new JLabel("\u624B\u673A\u53F7");
		label_1.setBounds(30, 85, 54, 15);
		layeredPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u8EAB\u4EFD\u8BC1\u53F7");
		label_2.setBounds(30, 173, 54, 15);
		layeredPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u6027\u522B");
		label_3.setBounds(30, 148, 54, 15);
		layeredPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u59D3\u540D");
		label_4.setBounds(30, 111, 54, 15);
		layeredPane.add(label_4);
		
		textField = new JTextField();
		textField.setBounds(97, 50, 66, 21);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 82, 66, 21);
		layeredPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 108, 66, 21);
		layeredPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 145, 66, 21);
		layeredPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(97, 170, 66, 21);
		layeredPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton button = new JButton("\u6CE8\u518C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a,b,c,d,f;
				a=textField.getText();
				b=textField_1.getText();				
				c=textField_2.getText();				
				d=textField_3.getText();				
				f=textField_4.getText();
				VipinformationContral.getVipinformationContral().createVipinformation(a,b,c,d,f);
				
			}
		});
		button.setBounds(165, 224, 93, 23);
		layeredPane.add(button);
		
		JButton button_1 = new JButton("\u8FD4\u56DE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SEmain frame = new SEmain();
				frame.setVisible(true);
			}
		});
		button_1.setBounds(268, 224, 93, 23);
		layeredPane.add(button_1);
		
		JButton button_2 = new JButton("\u4FEE\u6539");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a,b,c,d,f;
				a=textField.getText();
				b=textField_1.getText();				
				c=textField_2.getText();				
				d=textField_3.getText();				
				f=textField_4.getText();
				VipinformationContral.getVipinformationContral().mergeVipinformation(a,b,c,d,f);
				
			}
		});
		button_2.setBounds(70, 224, 93, 23);
		layeredPane.add(button_2);
	}
}
