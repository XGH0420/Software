import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import java.awt.Font;
import java.awt.Color;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;

import com.se.contral.VipinformationContral;
import com.se.model.Vipinformation;


public class SEmain extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SEmain frame = new SEmain();
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
	public SEmain() {
		setTitle("\u4F1A\u5458\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JButton button = new JButton("\u6CE8\u518C\u4F1A\u5458");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				zhuce frame = new zhuce();
				frame.setVisible(true);
			}
		});
		button.setBounds(371, 109, 93, 23);
		layeredPane.add(button);
		
		JButton button_1 = new JButton("\u5220\u9664\u4F1A\u5458");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s;
				s=textField.getText();
				 VipinformationContral.getVipinformationContral().deleteVipinformation(s);
			}
		});
		button_1.setBounds(371, 142, 93, 23);
		layeredPane.add(button_1);
		
		JButton button_2 = new JButton("\u4FEE\u6539\u4FE1\u606F");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zhuce frame = new zhuce();
				frame.setVisible(true);
			}
		});
		button_2.setBounds(371, 175, 93, 23);
		layeredPane.add(button_2);
		
		JButton button_5 = new JButton("\u9000\u51FA");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_5.setBounds(371, 208, 93, 23);
		layeredPane.add(button_5);
		
		JLabel label = new JLabel("\u4F1A\u5458\u4FE1\u606F");
		label.setBounds(10, 95, 54, 15);
		layeredPane.add(label);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2\u4F1A\u5458");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s;
				s=textField.getText();
				
				Vipinformation vip=VipinformationContral.getVipinformationContral().findVipinformation(s);
                String vipNum=vip.getVipNum();
                String phone=vip.getPhone();
                String vipName=vip.getVipName();
    			String sex=vip.getSex();
    			String vipId=vip.getVipId();
    			table.setModel(new DefaultTableModel(
    					new Object[][] {
    						{"\u4F1A\u5458\u53F7", vipNum},
    						{"\u624B\u673A\u53F7", phone},
    						{"\u59D3\u540D", vipName},
    						{"\u6027\u522B", sex},
    						{"\u8EAB\u4EFD\u8BC1\u53F7", vipId},
    					},
    					new String[] {
    						"New column", "New column"
    					}
    				));
			}
		});
		btnNewButton.setBounds(371, 51, 93, 23);
		layeredPane.add(btnNewButton);
		
		table = new JTable();
		table.setFont(new Font("ºÚÌå", Font.BOLD, 12));
		table.setRowHeight(20);
		table.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u4F1A\u5458\u53F7", null},
				{"\u624B\u673A\u53F7", null},
				{"\u59D3\u540D", null},
				{"\u6027\u522B", null},
				{"\u8EAB\u4EFD\u8BC1\u53F7", null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(63);
		table.getColumnModel().getColumn(0).setMinWidth(27);
		table.getColumnModel().getColumn(1).setPreferredWidth(110);
		table.getColumnModel().getColumn(1).setMinWidth(27);
		table.setBounds(48, 127, 307, 104);
		layeredPane.add(table);
		
		JLabel label_1 = new JLabel("\u8F93\u5165\u8981\u67E5\u8BE2\u7684\u4F1A\u5458\u53F7\uFF1A");
		label_1.setBounds(10, 55, 131, 15);
		layeredPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(162, 52, 105, 21);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u4F1A\u5458\u7BA1\u7406");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("¿¬Ìå", Font.BOLD, 15));
		label_2.setBounds(186, 10, 100, 32);
		layeredPane.add(label_2);
		
		JButton button_3 = new JButton("\u5F53\u524D\u4F1A\u5458");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chakan ck=new chakan();
				ck.setVisible(true);
				
			}
		});
		button_3.setBounds(371, 84, 93, 23);
		layeredPane.add(button_3);
	}
}
