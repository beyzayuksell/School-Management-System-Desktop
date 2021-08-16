package Views;
import Models.Class;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controllers.ReadWriteJson;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.border.BevelBorder;
public class StudentEditPage extends JFrame {

	private static final long serialVersionUID = -4741709252161908157L;
	private JPanel contentPane_edit;
	public JTextField textField_surname;
	public JTextField textField_name;
	public JTextField textField_age;
	private JLabel idLabel;
	private JLabel surnameLabel;
	private JLabel NameLabel;
	private JLabel gradeLabel;
	private JLabel ageLabel;
	public JTextField textField_fee;
	private JLabel feeLabel;
	public JButton btn_updateStudent;
	public JTextField textField_id;
	public JComboBox comboBox_grade;
	public ReadWriteJson rj;
	/**
	 * Create the frame.
	 */
	public StudentEditPage() {
		setForeground(Color.WHITE);
		rj = new ReadWriteJson();
		setResizable(false);
		setTitle("EDIT STUDENT PAGE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 341);
		contentPane_edit = new JPanel();
		contentPane_edit.setBackground(new Color(95, 158, 160));
		contentPane_edit.setForeground(Color.WHITE);
		contentPane_edit.setBorder(new BevelBorder(BevelBorder.RAISED, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
		setContentPane(contentPane_edit);
		
		JLabel stdtEditTopics_lbl = new JLabel("STUDENT INFORMATION");
		stdtEditTopics_lbl.setForeground(new Color(0, 0, 0));
		stdtEditTopics_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		stdtEditTopics_lbl.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_surname = new JTextField();
		textField_surname.setColumns(10);
		textField_name = new JTextField();
		textField_name.setColumns(10);
		textField_age = new JTextField();
		textField_age.setColumns(10);
		textField_fee = new JTextField();
		textField_fee.setColumns(10);
		
		idLabel = new JLabel("ID:");	
		idLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		idLabel.setForeground(new Color(255, 255, 255));
		surnameLabel = new JLabel("SURNAME:");
		surnameLabel.setForeground(new Color(255, 255, 255));
		surnameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		NameLabel = new JLabel("NAME:");
		NameLabel.setForeground(new Color(255, 255, 255));
		NameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		gradeLabel = new JLabel("GRADE:");
		gradeLabel.setForeground(new Color(255, 255, 255));
		gradeLabel.setBackground(new Color(240, 240, 240));
		gradeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		ageLabel = new JLabel("AGE:");
		ageLabel.setForeground(new Color(255, 255, 255));
		ageLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		feeLabel = new JLabel("FEE:");
		feeLabel.setForeground(new Color(255, 255, 255));
		feeLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			
		btn_updateStudent = new JButton("UPDATE STUDENT");
		btn_updateStudent.setForeground(Color.BLACK);
		btn_updateStudent.setBackground(Color.WHITE);
		btn_updateStudent.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		textField_id = new JTextField();
		textField_id.setEditable(false);
		textField_id.setColumns(10);
		
		comboBox_grade = new JComboBox();
		comboBox_grade.setBackground(new Color(255, 255, 255));
		int totalgradeNum = rj.grade_cnt;
		for(int i=1; i<totalgradeNum; i++) {
			comboBox_grade.addItem(i);
		}
		
		GroupLayout gl_contentPane_edit = new GroupLayout(contentPane_edit);
		gl_contentPane_edit.setHorizontalGroup(
			gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane_edit.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
						.addComponent(stdtEditTopics_lbl, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addComponent(btn_updateStudent, GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
						.addGroup(gl_contentPane_edit.createSequentialGroup()
							.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
								.addComponent(feeLabel, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
								.addComponent(ageLabel, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
								.addComponent(gradeLabel, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
								.addComponent(NameLabel, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
								.addComponent(surnameLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
								.addComponent(idLabel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox_grade, 0, 135, Short.MAX_VALUE)
								.addComponent(textField_surname, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
								.addComponent(textField_name, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
								.addComponent(textField_age, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
								.addComponent(textField_fee, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
								.addComponent(textField_id, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
					.addGap(35))
		);
		gl_contentPane_edit.setVerticalGroup(
			gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane_edit.createSequentialGroup()
					.addGap(20)
					.addComponent(stdtEditTopics_lbl, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE)
						.addComponent(idLabel)
						.addComponent(textField_id, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_surname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(surnameLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(textField_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane_edit.createSequentialGroup()
							.addGap(6)
							.addComponent(NameLabel)))
					.addGap(9)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.TRAILING)
						.addComponent(gradeLabel)
						.addComponent(comboBox_grade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(textField_age, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane_edit.createSequentialGroup()
							.addGap(6)
							.addComponent(ageLabel)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane_edit.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(textField_fee, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane_edit.createSequentialGroup()
							.addGap(6)
							.addComponent(feeLabel)))
					.addGap(18)
					.addComponent(btn_updateStudent, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		contentPane_edit.setLayout(gl_contentPane_edit);
	}
}
