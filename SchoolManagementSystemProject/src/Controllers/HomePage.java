package Controllers;
import Models.Teacher;
import Models.SchoolBus;
import Models.Student;
import Models.Class;
import Views.ClassAddPage;
import Views.ClassEditPage;
import Views.StudentAddPage;
import Views.StudentDetailsPage;
import Views.StudentEditPage;
import Views.TeacherAddPage;
import Views.TeacherEditPage;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.UIManager;

public class HomePage extends JFrame implements ActionListener {
	private static final long serialVersionUID = 6198670169468219898L;
	private JPanel contentPane;
	public ReadWriteJson rj;
	public JTable std_table;
	public JTable teacher_table;
	private JTable class_table;
	public JPanel studentInfo;
	public JPanel teacherInfo;
	public JPanel classInfo;
	private JButton btnDetailsStudent_main;
	private JButton btnAddStudent_main;
	private JButton btnUpdateStudent_main;
	private JButton btnUpdateTeacher_main;
	private JButton btnAddTeacher_main;
	private JButton btnUpdateClass_main;
	private JButton btnAddClass_main;
	public StudentEditPage jtStudentEditRowData;
	public StudentAddPage jtStudentAddRowData;
	public StudentDetailsPage jtStudentDetailsRowData;
	public TeacherEditPage jtTeacherEditRowData;
	public TeacherAddPage jtTeacherAddRowData;
	public ClassEditPage jtClassEditRowData;
	public ClassAddPage jtClassAddRowData;
	
	// Create the frame.	
	public void HomePageView() { 
		setTitle("SCHOOL MANAGEMENT SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 582, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(72, 61, 139), new Color(72, 61, 139), new Color(72, 61, 139), new Color(72, 61, 139)));
		setContentPane(contentPane);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(255, 255, 255));
		tabbedPane.setBackground(new Color(72, 61, 139));
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD, 12));
		tabbedPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255), new Color(255, 255, 255)));
		studentInfo = new JPanel();                                   // Generate Student panel and table
		studentInfo.setBackground(new Color(72, 61, 139));
		studentInfo.setForeground(new Color(255, 255, 255));
		tabbedPane.addTab("Students", null, studentInfo, null);       // Show Details for any student. ex:arrived, status, capacity.
		btnDetailsStudent_main = new JButton("Details");              // Buttons for Students in main panel
		btnDetailsStudent_main.setBackground(new Color(255, 255, 255));
		btnDetailsStudent_main.setForeground(new Color(0, 0, 0));
		btnDetailsStudent_main.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddStudent_main = new JButton("Add Student");
		btnAddStudent_main.setBackground(new Color(255, 255, 255));
		btnAddStudent_main.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdateStudent_main = new JButton("Update Student");   
		btnUpdateStudent_main.setBackground(new Color(255, 255, 255));
		btnUpdateStudent_main.setFont(new Font("Tahoma", Font.BOLD, 12));
		JScrollPane scrollPane_std = new JScrollPane();
		std_table = new JTable();
		std_table.setFillsViewportHeight(true);
		std_table.setForeground(Color.BLACK);
		std_table.setBackground(new Color(255, 255, 255));
		scrollPane_std.setViewportView(std_table);
		std_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		std_table.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		JLabel lbl_topicStudent = new JLabel("STUDENT INFORMATIONS");
		lbl_topicStudent.setForeground(new Color(255, 255, 255));
		lbl_topicStudent.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_topicStudent.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_studentInfo = new GroupLayout(studentInfo);
		gl_studentInfo.setHorizontalGroup(
			gl_studentInfo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_studentInfo.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnDetailsStudent_main, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnUpdateStudent_main, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAddStudent_main, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
					.addGap(7))
				.addComponent(lbl_topicStudent, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
				.addGroup(gl_studentInfo.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_std, GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
					.addGap(7))
		);
		gl_studentInfo.setVerticalGroup(
			gl_studentInfo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_studentInfo.createSequentialGroup()
					.addGap(14)
					.addComponent(lbl_topicStudent)
					.addGap(18)
					.addGroup(gl_studentInfo.createParallelGroup(Alignment.BASELINE, false)
						.addComponent(btnDetailsStudent_main)
						.addComponent(btnUpdateStudent_main)
						.addComponent(btnAddStudent_main))
					.addGap(18)
					.addComponent(scrollPane_std, GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
					.addContainerGap())
		);
		studentInfo.setLayout(gl_studentInfo);
		teacherInfo = new JPanel(); 								 // Generate Teacher panel and table
		teacherInfo.setBackground(new Color(72, 61, 139));
		teacherInfo.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(95, 158, 160), null, null, null));
		tabbedPane.addTab("Teachers", null, teacherInfo, null);
		JScrollPane scrollPane_tch = new JScrollPane();
		teacher_table = new JTable();
		teacher_table.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(255, 255, 255), new Color(0, 0, 0), new Color(255, 255, 255)));
		teacher_table.setFillsViewportHeight(true);
		teacher_table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scrollPane_tch.setViewportView(teacher_table);
		teacher_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		teacher_table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Surname", "Name", "Salary" }));
		JLabel lbl_topicTeacher = new JLabel("TEACHER INFORMATIONS");
		lbl_topicTeacher.setForeground(new Color(255, 255, 255));
		lbl_topicTeacher.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_topicTeacher.setHorizontalAlignment(SwingConstants.CENTER);
		btnUpdateTeacher_main = new JButton("Update Teacher");  //-------- Buttons for TEACHERS in main panel
		btnUpdateTeacher_main.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdateTeacher_main.setBackground(new Color(255, 255, 255));
		btnAddTeacher_main = new JButton("Add Teacher"); 	
		btnAddTeacher_main.setBackground(new Color(255, 255, 255));
		btnAddTeacher_main.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_teacherInfo = new GroupLayout(teacherInfo);
		gl_teacherInfo.setHorizontalGroup(
			gl_teacherInfo.createParallelGroup(Alignment.TRAILING)
				.addComponent(lbl_topicTeacher, GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
				.addGroup(gl_teacherInfo.createSequentialGroup()
					.addGap(99)
					.addComponent(btnUpdateTeacher_main, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
					.addGap(6)
					.addComponent(btnAddTeacher_main, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
					.addGap(81))
				.addGroup(Alignment.LEADING, gl_teacherInfo.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane_tch, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_teacherInfo.setVerticalGroup(
			gl_teacherInfo.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_teacherInfo.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbl_topicTeacher)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_teacherInfo.createParallelGroup(Alignment.LEADING)
						.addComponent(btnUpdateTeacher_main)
						.addComponent(btnAddTeacher_main))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane_tch, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
					.addContainerGap())
		);
		teacherInfo.setLayout(gl_teacherInfo);
		classInfo = new JPanel();       							 // Generate class panel and table
		classInfo.setBackground(new Color(72, 61, 139));
		classInfo.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(95, 158, 160), null, null, null)); 
		tabbedPane.addTab("Classes", null, classInfo, null);
		JScrollPane scrollPane_class = new JScrollPane();
		class_table = new JTable();
		class_table.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), null, null, null));
		class_table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		class_table.setFillsViewportHeight(true);
		class_table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "GRADE ID", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" }));
		scrollPane_class.setViewportView(class_table);
		JLabel lbl_topicGrade = new JLabel("GRADE INFORMATIONS");
		lbl_topicGrade.setForeground(new Color(255, 255, 255));
		lbl_topicGrade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_topicGrade.setHorizontalAlignment(SwingConstants.CENTER);	
		btnUpdateClass_main = new JButton("Update Class");          // Button For Class in main panel
		btnUpdateClass_main.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdateClass_main.setForeground(new Color(0, 0, 0));
		btnUpdateClass_main.setBackground(new Color(255, 255, 255));
		btnAddClass_main = new JButton("Add Class");
		btnAddClass_main.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddClass_main.setForeground(new Color(0, 0, 0));
		btnAddClass_main.setBackground(new Color(255, 255, 255));
		GroupLayout gl_classInfo = new GroupLayout(classInfo);
		gl_classInfo.setHorizontalGroup(gl_classInfo.createParallelGroup(Alignment.TRAILING).addComponent(lbl_topicGrade, GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
			.addGroup(gl_classInfo.createSequentialGroup().addGap(12).addComponent(scrollPane_class, GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE).addGap(12))
			.addGroup(gl_classInfo.createSequentialGroup().addGap(93).addComponent(btnUpdateClass_main, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE).addGap(6)
			.addComponent(btnAddClass_main, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE).addGap(87)));
		gl_classInfo.setVerticalGroup(gl_classInfo.createParallelGroup(Alignment.LEADING).addGroup(gl_classInfo.createSequentialGroup().addContainerGap()
			.addComponent(lbl_topicGrade).addPreferredGap(ComponentPlacement.UNRELATED).addGroup(gl_classInfo.createParallelGroup(Alignment.LEADING)
			.addComponent(btnUpdateClass_main).addComponent(btnAddClass_main)).addGap(12).addComponent(scrollPane_class, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
			.addContainerGap()));
		classInfo.setLayout(gl_classInfo);	
		JLabel lbl_smsTopic = new JLabel("SCHOOL MANAGEMENT SYSTEM");
		lbl_smsTopic.setForeground(new Color(72, 61, 139));
		lbl_smsTopic.setFont(new Font("Source Serif Pro Black", Font.BOLD, 23));
		lbl_smsTopic.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel lbl_ruleProcess2 = new JLabel(" Please Firstly, click specific row on table. Secondly, click Edit Button or Update Button.");
		lbl_ruleProcess2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl_ruleProcess2.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbl_ruleProcess2, GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(lbl_smsTopic, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbl_smsTopic, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
					.addGap(7)
					.addComponent(lbl_ruleProcess2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);	
	}
	public HomePage() {
		rj = new ReadWriteJson(); 							  // initialize objects
		jtStudentEditRowData = new StudentEditPage();
		jtStudentAddRowData = new StudentAddPage();
		jtStudentDetailsRowData = new StudentDetailsPage();
		jtTeacherEditRowData = new TeacherEditPage();
		jtTeacherAddRowData = new TeacherAddPage();
		jtClassEditRowData = new ClassEditPage();
		jtClassAddRowData = new ClassAddPage();
		HomePageView();
		btnDetailsStudent_main.addActionListener(this);  				// Calls Listeners in main panels
		btnAddStudent_main.addActionListener(this);
		btnUpdateStudent_main.addActionListener(this);
		btnUpdateTeacher_main.addActionListener(this);  		
		btnAddTeacher_main.addActionListener(this);
		btnUpdateClass_main.addActionListener(this);                
		btnAddClass_main.addActionListener(this);
		jtStudentEditRowData.btn_updateStudent.addActionListener(this);  // Calls Listeners for opening new pages
		jtStudentAddRowData.btn_addStudent.addActionListener(this);
		jtTeacherEditRowData.btn_updateTeacher.addActionListener(this);
		jtTeacherAddRowData.btn_addTeacher.addActionListener(this);
		jtClassEditRowData.btn_updateClass.addActionListener(this);
		jtClassAddRowData.btn_addClass.addActionListener(this);
		addStudentRowToJtable(); // Populate data to student table  ---// method calls..
		addTeacherRowToJtable(); // Populate data to teacher table
		addClassRowToJtable();   // Populate data to class table
	}
	// Populate data to student table
	public void addStudentRowToJtable() {
		std_table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "ID", "SURNAME", "NAME", "GRADE", "AGE", "FEE" }) {
		private static final long serialVersionUID = 1L;
		boolean[] columnEditables = new boolean[] { false, true, true, false, true, true };
		public boolean isCellEditable(int row, int column) { return columnEditables[column]; }});
		DefaultTableModel model = (DefaultTableModel) std_table.getModel();
		Object rowData[] = new Object[6];
		int stdCnt = 1;
		for (int i = 0; i < rj.studentArr.size(); i++) {
			rowData[0] = stdCnt++;
			rowData[1] = rj.studentArr.get(i).getSurname();
			rowData[2] = rj.studentArr.get(i).getName();
			rowData[3] = rj.studentArr.get(i).getGrade();
			rowData[4] = rj.studentArr.get(i).getAge();
			rowData[5] = rj.studentArr.get(i).getFee();
			model.addRow(rowData);
		}
	} 
	// Populate data to teacher table 
	public void addTeacherRowToJtable() {
		teacher_table.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "SURNAME", "NAME", "BRACNH", "SALARY" }));
		DefaultTableModel teacher_tblmodel = (DefaultTableModel) teacher_table.getModel();
		Object rowData[] = new Object[4];
		for (int i = 0; i < rj.teacherArr.size(); i++) {
			rowData[0] = rj.teacherArr.get(i).getSurname();
			rowData[1] = rj.teacherArr.get(i).getName();
			rowData[2] = rj.teacherArr.get(i).getBranch();
			rowData[3] = rj.teacherArr.get(i).getSalary();
			teacher_tblmodel.addRow(rowData);
		}
	}
	// Populate data to class table
	public void addClassRowToJtable() {
		DefaultTableModel class_tblmodel = (DefaultTableModel) class_table.getModel();
		Object rowData[] = new Object[6];
		int cnt_grade = 1;
		for (int i = 0;  i < rj.classArr.size(); i++) {
			rowData[0] = cnt_grade++;  // grade id
			rowData[1] = rj.classArr.get(i).getMondayCourse();
			rowData[2] = rj.classArr.get(i).getTuesdayCourse();
			rowData[3] = rj.classArr.get(i).getWednesdayCourse();
			rowData[4] = rj.classArr.get(i).getThursdayCourse();		
			rowData[5] = rj.classArr.get(i).getFridayCourse();
			class_tblmodel.addRow(rowData);   
		}
	}
	// Add all Teachers to Teacher array list
	@SuppressWarnings("unchecked")
	public void addTeacherToArryList(String surname, String name, String salary, String bracnh_type) {
		Teacher new_teacher = new Teacher(surname, name, salary, bracnh_type);
		rj.teacherArr.add(new_teacher);
		// teacher add new bracnh, update class edit and add page combo box values.
		int ind = rj.teacherArr.size();   ind--;
		jtClassEditRowData.comboBox_mday.addItem(rj.teacherArr.get(ind).getBranch()); 
		jtClassEditRowData.comboBox_tuesday.addItem(rj.teacherArr.get(ind).getBranch());
		jtClassEditRowData.comboBox_wday.addItem(rj.teacherArr.get(ind).getBranch());
		jtClassEditRowData.comboBox_thursday.addItem(rj.teacherArr.get(ind).getBranch());
		jtClassEditRowData.comboBox_fday.addItem(rj.teacherArr.get(ind).getBranch());
		jtClassAddRowData.comboBox_mday.addItem(rj.teacherArr.get(ind).getBranch()); 
		jtClassAddRowData.comboBox_tuesday.addItem(rj.teacherArr.get(ind).getBranch());
		jtClassAddRowData.comboBox_wday.addItem(rj.teacherArr.get(ind).getBranch());
		jtClassAddRowData.comboBox_thursday.addItem(rj.teacherArr.get(ind).getBranch());
		jtClassAddRowData.comboBox_fday.addItem(rj.teacherArr.get(ind).getBranch());
		rj.WriteJsonFile(); // Method calls.. //-- Update Json file
	}
	@SuppressWarnings("unchecked")
	// Add all Classes to Class array list
	public void addClassToArryList(String mday, String tuesday, String wday, String thursday, String fday) {
		Class new_class = new Class(mday, tuesday, wday, thursday, fday);
		rj.classArr.add(new_class);
		int gradeCnt = rj.grade_cnt; gradeCnt--;
		jtStudentAddRowData.comboBox_grade.addItem(gradeCnt); // add new class -> add new grade number
		jtStudentEditRowData.comboBox_grade.addItem(gradeCnt);
		rj.WriteJsonFile(); // Method calls.. //-- Update Json file
	}
	// After new student record added, all text fields clean 
	public void cleanTextFieldStudentInfo() {	
		jtStudentAddRowData.textField_surname.setText("");
		jtStudentAddRowData.textField_name.setText("");
		jtStudentAddRowData.comboBox_grade.setSelectedItem(1); 
		jtStudentAddRowData.textField_age.setText("");
		jtStudentAddRowData.textField_fee.setText("");
	}
	// After new teacher record added, all text fields clean 
	public void cleanTextFieldTeacherInfo() {	
		jtTeacherAddRowData.textField_sname.setText("");
		jtTeacherAddRowData.textField_name.setText("");
		jtTeacherAddRowData.textField_bracnh.setText("");
		jtTeacherAddRowData.textField_salary.setText("");
	}	
	// After new class record added, all combo boxes clean 
	public void cleanTextFieldClassInfo() {	
		jtClassAddRowData.comboBox_mday.setSelectedItem(rj.bracnhArr.get(0));
		jtClassAddRowData.comboBox_fday.setSelectedItem(rj.bracnhArr.get(0));
		jtClassAddRowData.comboBox_wday.setSelectedItem(rj.bracnhArr.get(0));
		jtClassAddRowData.comboBox_thursday.setSelectedItem(rj.bracnhArr.get(0));
		jtClassAddRowData.comboBox_tuesday.setSelectedItem(rj.bracnhArr.get(0));
	}
	// Add all Students to Student array list
	public void addStudentToArryList(String surname, String name, String grade, String age, String fee) {
		Student new_std = new Student(surname, name, grade, age, fee);
		rj.studentArr.add(new_std);
		//add school bus id ,non to this added student.
		// if (school bus array size == checkcCapacity_cnt) -> all bus are full.
		int whicFreeBusIndx = 0;
		boolean capacity = false;
		boolean flag = false;	// this student have no in any bus 
		ArrayList<String> s = new ArrayList<String>();
		for(int i=0; i<rj.schoolBusArr.size(); i++) {
			int busCapacity = Integer.parseInt(rj.schoolBusArr.get(i).getCapacity());
			if( rj.schoolBusArr.get(i).getStudentsIDs().size() < busCapacity ) {
				s = new ArrayList<String>();
				for(int j=0; j<rj.schoolBusArr.get(i).getStudentsIDs().size(); j++) {
					int schoolbusStdID = Integer.parseInt(rj.schoolBusArr.get(i).getStudentsIDs().get(j));
					if(schoolbusStdID == rj.std_cnt )  // if student have a bus. 
						flag = true;
					else { s.add(rj.schoolBusArr.get(i).getStudentsIDs().get(j)); }
				}
				if(flag == false) { // student have no in bus
					capacity = true; // capacity have
					whicFreeBusIndx = i;  
					break;
				}
			}
			else 
				whicFreeBusIndx = i;	
		}
		int i = rj.std_cnt; 
		i--;
		String stdId = Integer.toString(i);
		s.add(stdId);
		if( capacity == true && flag == false ) {// student have no in any bus and bus capacity have. 
			rj.schoolBusArr.get(whicFreeBusIndx).setStudentsIDs(s);
			JOptionPane.showMessageDialog(this, "A school bus has been assigned to this student.");
		}
		if( (capacity == false && flag == false) ) {  // student have no in any bus and bus capacity have No. 
			jtStudentDetailsRowData.textField_capacity.setText("None");
			jtStudentDetailsRowData.textField_status.setText("None");
			jtStudentDetailsRowData.textField_arrived.setText("None");
			JOptionPane.showMessageDialog(this, "All buses are full!\nThere is no bus information for this student.");
		}
		rj.WriteJsonFile(); // Method calls.. //-- Update Json file
	}
	// The same branch should not be in the Teacher list at the same time.
	public boolean checkHaveSameBracnhType(String bracnh_type) {
		for(int i=0; i<rj.teacherArr.size(); i++) {
			if(bracnh_type.equals(rj.teacherArr.get(i).getBranch().toLowerCase())) {
				JOptionPane.showMessageDialog(this, "This Bracnh name have in list!\nPlease enter different bracnh name.");
				return false;
		}}return true;
	}
	// Add student
	public void addStudent() {
		DefaultTableModel tblmodel = (DefaultTableModel) std_table.getModel();
		int id2 = rj.std_cnt; // id2=10 -> size=9
		String id3 = Integer.toString(id2);
		// Take information of student from text file and combo box.
		String surname = jtStudentAddRowData.textField_surname.getText();
		String name = jtStudentAddRowData.textField_name.getText();
		int grade2 = (int) jtStudentAddRowData.comboBox_grade.getSelectedItem();
		String age = jtStudentAddRowData.textField_age.getText();
		String fee = jtStudentAddRowData.textField_fee.getText();
		// Collect all data in string array
		String grade = Integer.toString(grade2);
		String[] newAddStudentData = { id3, surname, name, grade, age, fee };
		// Add new record to student table
		if ((!surname.equals("") && !name.equals("") && !grade.equals("") && !age.equals("") && !fee.equals(""))) {
			if (rj.checkHaveSameStudent(surname, name)) {
				tblmodel.addRow(newAddStudentData);
				rj.std_cnt++;
				System.out.println("Student succefully added."); // Control
				JOptionPane.showMessageDialog(this, "Student succefully added.");
				addStudentToArryList(surname, name, grade, age, fee);
				cleanTextFieldStudentInfo();
			} else { JOptionPane.showMessageDialog(this, "This student have in list!\nPlease enter different student."); }
		} else { JOptionPane.showMessageDialog(this, "Please fill all field!"); }	
	}
	// Add Class
	public void addClass() {
		DefaultTableModel tblmodel = (DefaultTableModel) class_table.getModel();
		int id2 = rj.grade_cnt; // id2=2 -> size=1
		String id3 = Integer.toString(id2);
		// Take information of class from combo boxes.
		String mday = (String) jtClassAddRowData.comboBox_mday.getSelectedItem();
		String tuesday = (String) jtClassAddRowData.comboBox_tuesday.getSelectedItem();
		String wday = (String) jtClassAddRowData.comboBox_wday.getSelectedItem();
		String thursday = (String) jtClassAddRowData.comboBox_thursday.getSelectedItem();
		String fday = (String) jtClassAddRowData.comboBox_fday.getSelectedItem();
		// Collect all data in string array
		String[] newAddClassData = {id3, mday, tuesday, wday, thursday, fday};
		// Add new record to student table
		if ((!mday.equals("") && !tuesday.equals("") && !wday.equals("") && !thursday.equals("") && !fday.equals(""))) {
			if (rj.checkHaveSameClass(mday, tuesday, wday, thursday, fday)) {
				tblmodel.addRow(newAddClassData);
				rj.grade_cnt++;
				System.out.println("Class succefully added.");                         // Control
				JOptionPane.showMessageDialog(this, "Student succefully added.");
				addClassToArryList(mday, tuesday, wday, thursday, fday);
				cleanTextFieldClassInfo();
				String gradeId = Integer.toString(rj.grade_cnt);
				jtClassAddRowData.textField_gradeID.setText(gradeId);
		} else { JOptionPane.showMessageDialog(this, "This class have in list!\nPlease enter different class."); }
	} else { JOptionPane.showMessageDialog(this, "Please fill all field!"); }	
	}
	// Add teacher
	public void addTeacher() {
		DefaultTableModel tblmodel = (DefaultTableModel) teacher_table.getModel();
		// Take information of student from text file.
		String surname = jtTeacherAddRowData.textField_sname.getText();
		String name = jtTeacherAddRowData.textField_name.getText();
		String bracnh_type = jtTeacherAddRowData.textField_bracnh.getText();
		String salary = jtTeacherAddRowData.textField_salary.getText();
		// Collect all data in string array
		String[] newAddTeacherData = {surname, name, bracnh_type, salary };
		// Add new record to student table
		if ((!surname.equals("") && !name.equals("") && !bracnh_type.equals("") && !salary.equals(""))) {
			if (rj.checkHaveSameTeacher(surname, name)) {
				if(checkHaveSameBracnhType(bracnh_type)) {
					tblmodel.addRow(newAddTeacherData);
					System.out.println("Teacher succefully added."); // Control
					JOptionPane.showMessageDialog(this, "Teacher succefully added.");
					addTeacherToArryList(surname, name, salary, bracnh_type);
				}	cleanTextFieldTeacherInfo();
			} else { JOptionPane.showMessageDialog(this, "This Teacher have in list!\nPlease enter different teacher."); }
		} else { JOptionPane.showMessageDialog(this, "Please fill all field!"); }		
	}
	// Update student
	public void updateStudent() {
		DefaultTableModel tblmodel = (DefaultTableModel) std_table.getModel();
		// Take student data from textFields from edit page
		String id = jtStudentEditRowData.textField_id.getText();
		int index = Integer.parseInt(id);
		index--;
		String surname = jtStudentEditRowData.textField_surname.getText();
		String name = jtStudentEditRowData.textField_name.getText();
		int grade2 = (int) jtStudentEditRowData.comboBox_grade.getSelectedItem();
		String age = jtStudentEditRowData.textField_age.getText();
		String fee = jtStudentEditRowData.textField_fee.getText();
		String grade = Integer.toString(grade2); 
		// Set Updated value on student table
		if ((!surname.equals("") && !name.equals("") && !grade.equals("") && !age.equals("") && !fee.equals(""))) {
			tblmodel.setValueAt(surname, std_table.getSelectedRow(), 1);
			tblmodel.setValueAt(name, std_table.getSelectedRow(), 2);
			tblmodel.setValueAt(grade, std_table.getSelectedRow(), 3);
			tblmodel.setValueAt(age, std_table.getSelectedRow(), 4);
			tblmodel.setValueAt(fee, std_table.getSelectedRow(), 5);
			JOptionPane.showMessageDialog(this, "Update Successfully..");
			rj.updateStudentToArryList(index, surname, name, grade, age, fee); // Method calls..
		} else { JOptionPane.showMessageDialog(this, "Please fill all field!"); }
	}
	// Update teacher
	public void updateTeacher() {
		DefaultTableModel tblmodel = (DefaultTableModel) teacher_table.getModel();
		// Take teacher data from textFields from edit page
		String bracnh_type = jtTeacherEditRowData.textField_bracnh.getText();
		String surname = jtTeacherEditRowData.textField_surname.getText();
		String name = jtTeacherEditRowData.textField_name.getText();
		String salary = jtTeacherEditRowData.textField_salary.getText();
		// Set Updated value on teacher table
		if ((!surname.equals("") && !name.equals("") && !salary.equals(""))) {
			tblmodel.setValueAt(surname, teacher_table.getSelectedRow(), 0);
			tblmodel.setValueAt(name, teacher_table.getSelectedRow(), 1);
			tblmodel.setValueAt(salary, teacher_table.getSelectedRow(), 3);
			JOptionPane.showMessageDialog(this, "Update Successfully..");
			rj.updateTeacherToArryList(surname, name, salary, bracnh_type); // Method calls..
		} else { JOptionPane.showMessageDialog(this, "Please fill all field!"); }
	}

	// Update class
	public void updateClass() {
		DefaultTableModel tblmodel = (DefaultTableModel) class_table.getModel();
		// Take student data from textFields from edit page
		String grade_id = jtClassEditRowData.textField_grade.getText();
		int index = Integer.parseInt(grade_id); //1-2 -> 0 1
		index--;
		String monday = (String) jtClassEditRowData.comboBox_mday.getSelectedItem();
		String tuesday = (String) jtClassEditRowData.comboBox_tuesday.getSelectedItem();
		String wday = (String) jtClassEditRowData.comboBox_wday.getSelectedItem();
		String thursday = (String) jtClassEditRowData.comboBox_thursday.getSelectedItem();
		String friday = (String) jtClassEditRowData.comboBox_fday.getSelectedItem();
		// Set Updated value on student table
		if ((!monday.equals("") && !tuesday.equals("") && !wday.equals("") && !thursday.equals("") && !friday.equals(""))) {
			tblmodel.setValueAt(monday, class_table.getSelectedRow(), 1);
			tblmodel.setValueAt(tuesday, class_table.getSelectedRow(), 2);
			tblmodel.setValueAt(wday, class_table.getSelectedRow(), 3);
			tblmodel.setValueAt(thursday, class_table.getSelectedRow(), 4);
			tblmodel.setValueAt(friday, class_table.getSelectedRow(), 5);
			JOptionPane.showMessageDialog(this, "Update Successfully..");
			rj.updateClassToArryList(index, monday, tuesday, wday, thursday, friday); // Method calls..
		} else { JOptionPane.showMessageDialog(this, "Please fill all field!"); }	
	}	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jtStudentEditRowData.btn_updateStudent) // Update student for opening new page
			updateStudent(); 
		if (e.getSource() == jtStudentAddRowData.btn_addStudent)     // Add student for opening new page
			addStudent(); // Method calls..
		if (e.getSource() == jtTeacherEditRowData.btn_updateTeacher) // Update for opening new page
			updateTeacher(); 
		if (e.getSource() == jtTeacherAddRowData.btn_addTeacher)     // Add teacher for opening new page
			addTeacher(); // Method calls..
		if (e.getSource() == jtClassEditRowData.btn_updateClass)     // Update class for opening new page
			updateClass();
		if (e.getSource() == jtClassAddRowData.btn_addClass)        // Add class for opening new page
			addClass(); // Method calls..
		if(e.getSource() == btnDetailsStudent_main) {  // Main panels buttons
			TableModel model = std_table.getModel(); // First Click table row, Second click Details button.
			int row_index = std_table.getSelectedRow();  // get selected row 
			if(row_index != -1) {  // if selected specific row from student table, Show details page
				// Student Detail page sets visible
				jtStudentDetailsRowData.setVisible(true);
				jtStudentDetailsRowData.pack();
				jtStudentDetailsRowData.setLocationRelativeTo(null);
				jtStudentAddRowData.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				String id = model.getValueAt(row_index, 0).toString();
				int std_index = Integer.parseInt(id); 
				std_index--;
				String name = rj.studentArr.get(std_index).getName();
				String surname = rj.studentArr.get(std_index).getSurname();
				jtStudentDetailsRowData.textField_nameSurname.setText(name+" "+surname);	
				String grade_num = model.getValueAt(row_index, 3).toString(); //Take grade from table.
				int grade_index = Integer.parseInt(grade_num); 
				grade_index--;
				// Fill all courses to textFields in student details page
				jtStudentDetailsRowData.textField_mondayCourse.setText( rj.classArr.get(grade_index).getMondayCourse());
				jtStudentDetailsRowData.textField__tuesdayCourse.setText( rj.classArr.get(grade_index).getTuesdayCourse());
				jtStudentDetailsRowData.textField_wednesdayCourse.setText( rj.classArr.get(grade_index).getWednesdayCourse());
				jtStudentDetailsRowData.textField_thursdayCourse.setText( rj.classArr.get(grade_index).getThursdayCourse());
				jtStudentDetailsRowData.textField_fridayCourse.setText( rj.classArr.get(grade_index).getFridayCourse());
				@SuppressWarnings("unused")
				boolean flag = false; //this student id have no school bus -> flag is false 
				// Fill all school bus to textFields in student details page
				for(SchoolBus schBus : rj.schoolBusArr) {					
					for(int i=0; i<schBus.getStudentsIDs().size(); i++)  {							
						if(schBus.getStudentsIDs().get(i).equals(id))  {	
							jtStudentDetailsRowData.textField_capacity.setText(schBus.getCapacity());
							jtStudentDetailsRowData.textField_status.setText(schBus.getStatus());
							jtStudentDetailsRowData.textField_arrived.setText(schBus.getArrived());
							flag=true;
				}}}}
		}
		if(e.getSource() == btnAddStudent_main) {
			jtStudentAddRowData.setVisible(true);  // Student edit page sets visible
			jtStudentAddRowData.pack();
			jtStudentAddRowData.setLocationRelativeTo(null);
			jtStudentAddRowData.setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
		}
		if(e.getSource() == btnUpdateStudent_main) {
			int row_index = std_table.getSelectedRow();
			TableModel model = std_table.getModel();
			if ( row_index != -1) {
				// Take data from student table, and assign the values(ex:id,name) to edit page text fields
				String id = model.getValueAt(row_index, 0).toString();
				String sname = model.getValueAt(row_index, 1).toString();
				String name = model.getValueAt(row_index, 2).toString();
				String grade = model.getValueAt(row_index, 3).toString();
				String age = model.getValueAt(row_index, 4).toString();
				String fee = model.getValueAt(row_index, 5).toString();
				jtStudentEditRowData.setVisible(true); // Student edit page sets visible
				jtStudentEditRowData.pack();
				jtStudentEditRowData.setLocationRelativeTo(null);
				jtStudentEditRowData.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				jtStudentEditRowData.textField_id.setText(id);                 // Set informations to textFields
				jtStudentEditRowData.textField_surname.setText(sname);
				jtStudentEditRowData.textField_name.setText(name);
				jtStudentEditRowData.comboBox_grade.setSelectedItem(grade);
				jtStudentEditRowData.textField_age.setText(age);
				jtStudentEditRowData.textField_fee.setText(fee);
			}
		}
		if(e.getSource() == btnUpdateTeacher_main) {
			int row_index = teacher_table.getSelectedRow();
			TableModel model = teacher_table.getModel();
			if ( row_index != -1) {
				// Take data from teacher table, and assign the values(ex:name) to edit page text fields
				String sname = model.getValueAt(row_index, 0).toString();
				String name = model.getValueAt(row_index, 1).toString();
				String bracnh_type = model.getValueAt(row_index, 2).toString();
				String salary = model.getValueAt(row_index, 3).toString();
				jtTeacherEditRowData.setVisible(true); // teacher edit page sets visible
				jtTeacherEditRowData.pack();
				jtTeacherEditRowData.setLocationRelativeTo(null);
				jtTeacherEditRowData.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				jtTeacherEditRowData.textField_bracnh.setText(bracnh_type);                 // Set informations to textFields
				jtTeacherEditRowData.textField_surname.setText(sname);
				jtTeacherEditRowData.textField_name.setText(name);
				jtTeacherEditRowData.textField_salary.setText(salary);
			}
		}
		if(e.getSource() == btnAddTeacher_main) {
			jtTeacherAddRowData.setVisible(true); // Teacher edit page sets visible
			jtTeacherAddRowData.pack();
			jtTeacherAddRowData.setLocationRelativeTo(null);
			jtTeacherAddRowData.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		}
		if(e.getSource() == btnUpdateClass_main) {
			int row_index = class_table.getSelectedRow();
			TableModel model = class_table.getModel();
			if ( row_index != -1) {
				// Take data from class table, and assign the values to edit page text fields
				String grade_id = model.getValueAt(row_index, 0).toString();
				String monday = model.getValueAt(row_index, 1).toString();
				String tuesday = model.getValueAt(row_index, 2).toString();
				String wednesday = model.getValueAt(row_index, 3).toString();
				String thursday = model.getValueAt(row_index, 4).toString();
				String friday = model.getValueAt(row_index, 5).toString();
				jtClassEditRowData.setVisible(true); 								// class edit page sets visible
				jtClassEditRowData.pack();
				jtClassEditRowData.setLocationRelativeTo(null);
				jtClassEditRowData.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				jtClassEditRowData.textField_grade.setText(grade_id);					
				jtClassEditRowData.comboBox_mday.setSelectedItem(monday);                 // Set informations to textFields
				jtClassEditRowData.comboBox_tuesday.setSelectedItem(tuesday);
				jtClassEditRowData.comboBox_wday.setSelectedItem(wednesday);
				jtClassEditRowData.comboBox_thursday.setSelectedItem(thursday);
				jtClassEditRowData.comboBox_fday.setSelectedItem(friday);
			}	
		}
		if(e.getSource() == btnAddClass_main) {
			String gradeId = Integer.toString(rj.grade_cnt);
			jtClassAddRowData.textField_gradeID.setText(gradeId);
			jtClassAddRowData.setVisible(true);    			// Class edit page sets visible
			jtClassAddRowData.pack();
			jtClassAddRowData.setLocationRelativeTo(null);
			jtClassAddRowData.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		}
	}
	public void test() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}