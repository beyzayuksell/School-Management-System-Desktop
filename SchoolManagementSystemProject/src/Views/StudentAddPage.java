package Views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import Controllers.ReadWriteJson;

import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JComboBox;

public class StudentAddPage extends JFrame {

	private static final long serialVersionUID = -8583458927385526959L;
	private JPanel contentPane;
	public JTextField textField_age;
	public JTextField textField_name;
	public JTextField textField_surname;
	public JTextField textField_fee;
	public JButton btn_addStudent;
	public JComboBox comboBox_grade;
	public ReadWriteJson rj;
	/**
	 * Create the frame.
	 */
	public StudentAddPage() {
		setBackground(Color.WHITE);
		setForeground(new Color(255, 255, 255));
		rj= new ReadWriteJson();
		setResizable(false);
		setTitle("ADD STUDENT PAGE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 351, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(95, 158, 160), null, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel contentPane_edit = new JPanel();
		contentPane_edit.setBackground(new Color(95, 158, 160));
		contentPane_edit.setForeground(Color.WHITE);
		contentPane_edit.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		contentPane.add(contentPane_edit, BorderLayout.CENTER);
		
		JLabel feeLabel = new JLabel("FEE:");
		feeLabel.setForeground(new Color(255, 255, 255));
		feeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel ageLabel = new JLabel("AGE:");
		ageLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		ageLabel.setForeground(new Color(255, 255, 255));
		
		JLabel gradeLabel = new JLabel("GRADE:");
		gradeLabel.setForeground(new Color(255, 255, 255));
		gradeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel NameLabel = new JLabel("NAME:");
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		NameLabel.setForeground(new Color(255, 255, 255));
		
		JLabel surnameLabel = new JLabel("SURNAME:");
		surnameLabel.setForeground(new Color(255, 255, 255));
		surnameLabel.setBackground(new Color(255, 255, 255));
		surnameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_age = new JTextField();
		textField_age.setColumns(10);
		
		textField_name = new JTextField();
		textField_name.setColumns(10);
		
		textField_surname = new JTextField();
		textField_surname.setColumns(10);
		
		textField_fee = new JTextField();
		textField_fee.setColumns(10);
		
		btn_addStudent = new JButton("ADD STUDENT");
		btn_addStudent.setBackground(Color.WHITE);
		btn_addStudent.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel stdtAddTopics_lbl_1 = new JLabel("Please enter student information. ");
		stdtAddTopics_lbl_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		comboBox_grade = new JComboBox();
		int totalgradeNum = rj.grade_cnt;
		for(int i=1; i<totalgradeNum; i++) {
			comboBox_grade.addItem(i);
		}
		
		GroupLayout gl_contentPane_edit = new GroupLayout(contentPane_edit);
		gl_contentPane_edit.setHorizontalGroup(
			gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane_edit.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane_edit.createSequentialGroup()
							.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane_edit.createSequentialGroup()
									.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
										.addComponent(surnameLabel, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
										.addComponent(gradeLabel, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
										.addComponent(NameLabel, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
										.addComponent(feeLabel, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
										.addComponent(ageLabel, GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_name, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
										.addComponent(textField_surname, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
										.addComponent(textField_fee, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
										.addComponent(comboBox_grade, 0, 148, Short.MAX_VALUE)
										.addComponent(textField_age, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
								.addComponent(btn_addStudent, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
							.addGap(32))
						.addGroup(gl_contentPane_edit.createSequentialGroup()
							.addComponent(stdtAddTopics_lbl_1, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
							.addContainerGap())))
		);
		gl_contentPane_edit.setVerticalGroup(
			gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane_edit.createSequentialGroup()
					.addGap(26)
					.addComponent(stdtAddTopics_lbl_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_surname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(surnameLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(NameLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox_grade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(gradeLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_age, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ageLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_fee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(feeLabel, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addComponent(btn_addStudent, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		contentPane_edit.setLayout(gl_contentPane_edit);
	}
}
