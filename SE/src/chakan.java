import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.se.contral.VipinformationContral;
import com.se.model.Vipinformation;
import javax.swing.JLabel;


public class chakan extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel model;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chakan frame = new chakan();
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
	public chakan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setBounds(10, 32, 381, 187);
		layeredPane.add(table);
		
		JButton btnNewButton = new JButton("刷新");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				Object[][] object=new Object[10][5];
				List<Vipinformation> list=VipinformationContral.getVipinformationContral().findAllVipinformation();
				for(int i=0;i<list.size();i++){
					
					object[i][0]=list.get(i).getVipNum();
					object[i][1]=list.get(i).getPhone();
					object[i][2]=list.get(i).getVipName();
					object[i][3]=list.get(i).getSex();
					object[i][4]=list.get(i).getVipId();
					
					
					
				}
				DefaultTableModel model=new DefaultTableModel(
						object,
						new String[] {
							"会员号", "手机号码","会员名","性别","会员号"
						});
				table.setModel(model);
			}
		});
		btnNewButton.setBounds(216, 229, 93, 23);
		layeredPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("返回");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SEmain frame = new SEmain();
				frame.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(308, 229, 93, 23);
		layeredPane.add(btnNewButton_1);
		
		JLabel label = new JLabel("\u4F1A\u5458\u53F7");
		label.setBounds(10, 7, 54, 15);
		layeredPane.add(label);
		
		JLabel label_1 = new JLabel("\u624B\u673A\u53F7");
		label_1.setBounds(73, 7, 54, 15);
		layeredPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u59D3\u540D");
		label_2.setBounds(146, 7, 54, 15);
		layeredPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u6027\u522B");
		label_3.setBounds(238, 7, 54, 15);
		layeredPane.add(label_3);
		
		JLabel lblNewLabel = new JLabel("身份证号");
		lblNewLabel.setBounds(322, 7, 54, 15);
		layeredPane.add(lblNewLabel);
	}
}
