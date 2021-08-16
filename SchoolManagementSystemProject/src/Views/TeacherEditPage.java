package Views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;

public class TeacherEditPage extends JFrame {

	private JPanel contentPane;
	public JTextField textField_surname;
	public JTextField textField_name;
	public JTextField textField_bracnh;
	public JTextField textField_salary;
	public JButton btn_updateTeacher;

	/**
	 * Create the frame.
	 */
	public TeacherEditPage() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setContentPane(contentPane);
		
		JPanel contentPane_edit = new JPanel();
		contentPane_edit.setForeground(Color.WHITE);
		contentPane_edit.setBackground(new Color(95, 158, 160));
		contentPane_edit.setBorder(new BevelBorder(BevelBorder.RAISED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		
		JLabel stchtEditTopics_lbl = new JLabel("TEACHER INFORMATION");
		stchtEditTopics_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		stchtEditTopics_lbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btn_updateTeacher = new JButton("UPDATE TEACHER");
		btn_updateTeacher.setBackground(Color.WHITE);
		btn_updateTeacher.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel gradeLabel = new JLabel("SALARY:");	
		gradeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		gradeLabel.setForeground(new Color(255, 255, 255));
		JLabel NameLabel = new JLabel("NAME:");
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		NameLabel.setForeground(new Color(255, 255, 255));
		JLabel surnameLabel = new JLabel("SURNAME:");
		surnameLabel.setForeground(new Color(255, 255, 255));
		surnameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		JLabel bracnhLabel = new JLabel("BRACNH:");
		bracnhLabel.setForeground(new Color(255, 255, 255));
		bracnhLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_surname = new JTextField();
		textField_surname.setColumns(10);
		
		textField_name = new JTextField();
		textField_name.setColumns(10);
		
		textField_bracnh = new JTextField();
		textField_bracnh.setEditable(false);
		textField_bracnh.setColumns(10);
		
		textField_salary = new JTextField();
		textField_salary.setColumns(10);
		GroupLayout gl_contentPane_edit = new GroupLayout(contentPane_edit);
		gl_contentPane_edit.setHorizontalGroup(
			gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane_edit.createSequentialGroup()
					.addContainerGap()
					.addComponent(stchtEditTopics_lbl, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_contentPane_edit.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
						.addComponent(btn_updateTeacher, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
						.addGroup(gl_contentPane_edit.createSequentialGroup()
							.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
								.addComponent(gradeLabel, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
								.addComponent(NameLabel, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
								.addComponent(surnameLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
								.addComponent(bracnhLabel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_surname, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
								.addComponent(textField_name, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
								.addComponent(textField_salary, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
								.addComponent(textField_bracnh, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))))
					.addGap(35))
		);
		gl_contentPane_edit.setVerticalGroup(
			gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane_edit.createSequentialGroup()
					.addGap(13)
					.addComponent(stchtEditTopics_lbl, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE)
						.addComponent(bracnhLabel)
						.addComponent(textField_bracnh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE)
						.addComponent(surnameLabel)
						.addComponent(textField_surname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(16)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE)
						.addComponent(NameLabel)
						.addComponent(textField_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE)
						.addComponent(gradeLabel)
						.addComponent(textField_salary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addComponent(btn_updateTeacher, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
					.addGap(24))
		);
		contentPane_edit.setLayout(gl_contentPane_edit);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(contentPane_edit, GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
					.addGap(2))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(contentPane_edit, GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
					.addGap(1))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
