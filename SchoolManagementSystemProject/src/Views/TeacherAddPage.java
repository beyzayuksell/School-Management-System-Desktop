package Views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;

public class TeacherAddPage extends JFrame {
	
	private JPanel contentPane;
	public JTextField textField_sname;
	public JTextField textField_name;
	public JTextField textField_salary;
	public JTextField textField_bracnh;
	public JButton btn_addTeacher; 
	
	public TeacherAddPage() {
		getContentPane().setForeground(Color.WHITE);
		setForeground(new Color(95, 158, 160));
		getContentPane().setBackground(new Color(95, 158, 160));
		setTitle("ADD TEACHER PAGE");
		setResizable(false);
		
		JLabel tchAddTopics_lbl = new JLabel("Please enter teacher information. ");
		tchAddTopics_lbl.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel surnameLabel = new JLabel("SURNAME:");
		surnameLabel.setForeground(new Color(255, 255, 255));
		surnameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_sname = new JTextField();
		textField_sname.setColumns(10);
		
		JLabel NameLabel = new JLabel("NAME:");
		NameLabel.setForeground(new Color(255, 255, 255));
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_name = new JTextField();
		textField_name.setColumns(10);
		
		JLabel lblSalary = new JLabel("SALARY:");
		lblSalary.setForeground(new Color(255, 255, 255));
		lblSalary.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_salary = new JTextField();
		textField_salary.setColumns(10);
		
		JLabel lblBracnh = new JLabel("BRACNH:");
		lblBracnh.setForeground(new Color(255, 255, 255));
		lblBracnh.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_bracnh = new JTextField();
		textField_bracnh.setColumns(10);
		
		btn_addTeacher = new JButton("ADD TEACHER");
		btn_addTeacher.setBackground(Color.WHITE);
		btn_addTeacher.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btn_addTeacher, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
						.addComponent(tchAddTopics_lbl, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(surnameLabel, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textField_sname, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(NameLabel, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textField_name, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblSalary, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textField_salary, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblBracnh, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(textField_bracnh, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
					.addGap(30))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addComponent(tchAddTopics_lbl, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(surnameLabel))
						.addComponent(textField_sname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(NameLabel))
						.addComponent(textField_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(lblSalary))
						.addComponent(textField_salary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addComponent(lblBracnh))
						.addComponent(textField_bracnh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addComponent(btn_addTeacher, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(28))
		);
		getContentPane().setLayout(groupLayout);
	}
}
