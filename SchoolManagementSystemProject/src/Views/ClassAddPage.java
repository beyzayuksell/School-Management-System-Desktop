package Views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;

import Controllers.ReadWriteJson;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;

public class ClassAddPage extends JFrame {

	private JPanel contentPane;
	public JTextField textField_gradeID;
	public JButton btn_addClass;
	public JComboBox comboBox_mday;
	public JComboBox comboBox_tuesday;
	public JComboBox comboBox_wday;
	public JComboBox comboBox_thursday;
	public JComboBox comboBox_fday;
	public ReadWriteJson rj;

	
	// Create the frame.
	public ClassAddPage() {
		setBackground(new Color(95, 158, 160));
		setForeground(new Color(255, 255, 255));
		rj = new ReadWriteJson();
		setResizable(false);
		setTitle("ADD CLASS PAGE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 362);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		
		JPanel contentPane_edit = new JPanel();
		contentPane_edit.setBackground(new Color(95, 158, 160));
		contentPane_edit.setForeground(new Color(255, 255, 255));
		contentPane_edit.setBorder(new BevelBorder(BevelBorder.RAISED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		
		JLabel classEditTopics_lbl = new JLabel("Please enter class information. ");
		classEditTopics_lbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		btn_addClass = new JButton("ADD CLASS");
		btn_addClass.setBackground(Color.WHITE);
		btn_addClass.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel fridayLabel = new JLabel("FRIDAY:");	
		fridayLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		fridayLabel.setForeground(new Color(255, 255, 255));
		JLabel ThursdayLabel = new JLabel("THURSDAY:");		
		ThursdayLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		ThursdayLabel.setForeground(new Color(255, 255, 255));
		JLabel wednesdyLabel = new JLabel("WEDNESDAY:");
		wednesdyLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		wednesdyLabel.setForeground(new Color(255, 255, 255));
		JLabel TuesdayLabel = new JLabel("TUESDAY:");
		TuesdayLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		TuesdayLabel.setForeground(new Color(255, 255, 255));
		JLabel mondayLabel = new JLabel("MONDAY:");
		mondayLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		mondayLabel.setForeground(new Color(255, 255, 255));
		JLabel gradeLabel = new JLabel("GRADE:");
		gradeLabel.setForeground(new Color(255, 255, 255));
		gradeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_gradeID = new JTextField();
		textField_gradeID.setEditable(false);
		textField_gradeID.setColumns(10);
		
		// Add all bracnh types to comboboxs
		comboBox_mday = new JComboBox(rj.bracnhArr.toArray());	
		comboBox_tuesday = new JComboBox(rj.bracnhArr.toArray());	
		comboBox_wday = new JComboBox(rj.bracnhArr.toArray());
		comboBox_thursday = new JComboBox(rj.bracnhArr.toArray());
		comboBox_fday = new JComboBox(rj.bracnhArr.toArray());
		GroupLayout gl_contentPane_edit = new GroupLayout(contentPane_edit);
		gl_contentPane_edit.setHorizontalGroup(
			gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane_edit.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_addClass, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addComponent(classEditTopics_lbl, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addGroup(gl_contentPane_edit.createSequentialGroup()
							.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
								.addComponent(mondayLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
								.addComponent(TuesdayLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
								.addComponent(wednesdyLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
								.addComponent(ThursdayLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
								.addComponent(fridayLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
								.addGroup(gl_contentPane_edit.createSequentialGroup()
									.addComponent(gradeLabel, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
									.addGap(4)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_mday, 0, 135, Short.MAX_VALUE)
								.addComponent(comboBox_tuesday, 0, 135, Short.MAX_VALUE)
								.addComponent(comboBox_wday, 0, 135, Short.MAX_VALUE)
								.addComponent(comboBox_thursday, 0, 135, Short.MAX_VALUE)
								.addComponent(comboBox_fday, 0, 135, Short.MAX_VALUE)
								.addComponent(textField_gradeID, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
					.addGap(35))
		);
		gl_contentPane_edit.setVerticalGroup(
			gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane_edit.createSequentialGroup()
					.addGap(20)
					.addComponent(classEditTopics_lbl, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_gradeID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(gradeLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
						.addComponent(mondayLabel, Alignment.TRAILING)
						.addComponent(comboBox_mday, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBox_tuesday, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(TuesdayLabel))
					.addGap(13)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBox_wday, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(wednesdyLabel))
					.addGap(13)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBox_thursday, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ThursdayLabel))
					.addGap(13)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBox_fday, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(fridayLabel))
					.addGap(18)
					.addComponent(btn_addClass, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		contentPane_edit.setLayout(gl_contentPane_edit);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(contentPane_edit, GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addComponent(contentPane_edit, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
}
