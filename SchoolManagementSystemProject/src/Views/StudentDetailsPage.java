package Views;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class StudentDetailsPage extends JFrame {

	private static final long serialVersionUID = 1161798747837651102L;
	private JPanel contentPane;
	public JTextField textField_mondayCourse;
	public JTextField textField__tuesdayCourse;
	public JTextField textField_wednesdayCourse;
	public JTextField textField_thursdayCourse;
	public JTextField textField_fridayCourse;
	public JTextField textField_capacity;
	public JTextField textField_status;
	public JTextField textField_arrived;
	public JTextField textField_nameSurname;

	/**
	 * Create the frame.
	 */
	public StudentDetailsPage() {
		setForeground(new Color(0, 0, 0));
		setResizable(false);
		setTitle("DETAILS STUDENT PAGE");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 470, 400);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(95, 158, 160), new Color(95, 158, 160), new Color(95, 158, 160), new Color(95, 158, 160)));
		setContentPane(contentPane);
		
		JPanel panel_syllabus = new JPanel();
		panel_syllabus.setForeground(Color.WHITE);
		panel_syllabus.setBackground(new Color(95, 158, 160));
		panel_syllabus.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(95, 158, 160), null, null, null));
		
		JPanel panel_schoolBusDetails = new JPanel();
		panel_schoolBusDetails.setForeground(Color.WHITE);
		panel_schoolBusDetails.setBackground(new Color(95, 158, 160));
		panel_schoolBusDetails.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(95, 158, 160), null, null, null));
		
		JLabel lbl_sdtSchoolBusTopic_1 = new JLabel("SCHOOL BUS DETAILS ");
		lbl_sdtSchoolBusTopic_1.setBackground(new Color(255, 255, 255));
		lbl_sdtSchoolBusTopic_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_sdtSchoolBusTopic_1.setForeground(Color.WHITE);
		lbl_sdtSchoolBusTopic_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel capacity_Label = new JLabel("CAPACITY");
		capacity_Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		capacity_Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_capacity = new JTextField();
		textField_capacity.setEditable(false);
		textField_capacity.setHorizontalAlignment(SwingConstants.CENTER);
		textField_capacity.setColumns(10);
		
		JLabel status_Label = new JLabel("STATUS");
		status_Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		status_Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_status = new JTextField();
		textField_status.setHorizontalAlignment(SwingConstants.CENTER);
		textField_status.setEditable(false);
		textField_status.setColumns(10);
		
		JLabel arrived_Label = new JLabel("ARRIVED");
		arrived_Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		arrived_Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_arrived = new JTextField();
		textField_arrived.setHorizontalAlignment(SwingConstants.CENTER);
		textField_arrived.setEditable(false);
		textField_arrived.setColumns(10);
		GroupLayout gl_panel_schoolBusDetails = new GroupLayout(panel_schoolBusDetails);
		gl_panel_schoolBusDetails.setHorizontalGroup(
			gl_panel_schoolBusDetails.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_schoolBusDetails.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addGroup(gl_panel_schoolBusDetails.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_capacity, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(status_Label, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(textField_status, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(arrived_Label, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(textField_arrived, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(capacity_Label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(31))
				.addComponent(lbl_sdtSchoolBusTopic_1, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
		);
		gl_panel_schoolBusDetails.setVerticalGroup(
			gl_panel_schoolBusDetails.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_schoolBusDetails.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbl_sdtSchoolBusTopic_1, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(capacity_Label)
					.addGap(1)
					.addComponent(textField_capacity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(status_Label)
					.addGap(1)
					.addComponent(textField_status, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(arrived_Label)
					.addGap(1)
					.addComponent(textField_arrived, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(80))
		);
		panel_schoolBusDetails.setLayout(gl_panel_schoolBusDetails);
		
		JLabel lbl_sdtSyllabusTopic = new JLabel("SYLLABUS");
		lbl_sdtSyllabusTopic.setBackground(new Color(0, 0, 0));
		lbl_sdtSyllabusTopic.setForeground(Color.WHITE);
		lbl_sdtSyllabusTopic.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_sdtSyllabusTopic.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel mondayCourse_Label = new JLabel("MONDAY");
		mondayCourse_Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		mondayCourse_Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_mondayCourse = new JTextField();
		textField_mondayCourse.setForeground(new Color(0, 0, 0));
		textField_mondayCourse.setHorizontalAlignment(SwingConstants.CENTER);
		textField_mondayCourse.setEditable(false);
		textField_mondayCourse.setColumns(10);
		
		JLabel tuesdayCourse_Label = new JLabel("TUESDAY");
		tuesdayCourse_Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		tuesdayCourse_Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField__tuesdayCourse = new JTextField();
		textField__tuesdayCourse.setHorizontalAlignment(SwingConstants.CENTER);
		textField__tuesdayCourse.setEditable(false);
		textField__tuesdayCourse.setColumns(10);
		
		JLabel wednesdayCouse_Label = new JLabel("WEDNESDAY");
		wednesdayCouse_Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		wednesdayCouse_Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_wednesdayCourse = new JTextField();
		textField_wednesdayCourse.setHorizontalAlignment(SwingConstants.CENTER);
		textField_wednesdayCourse.setEditable(false);
		textField_wednesdayCourse.setColumns(10);
		
		JLabel thursdayCourse_Label = new JLabel("THURSDAY");
		thursdayCourse_Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		thursdayCourse_Label.setForeground(new Color(0, 0, 0));
		thursdayCourse_Label.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_thursdayCourse = new JTextField();
		textField_thursdayCourse.setHorizontalAlignment(SwingConstants.CENTER);
		textField_thursdayCourse.setEditable(false);
		textField_thursdayCourse.setColumns(10);
		
		textField_fridayCourse = new JTextField();
		textField_fridayCourse.setHorizontalAlignment(SwingConstants.CENTER);
		textField_fridayCourse.setEditable(false);
		textField_fridayCourse.setColumns(10);
		
		JLabel fridayCourse_Label = new JLabel("FRIDAY");
		fridayCourse_Label.setFont(new Font("Tahoma", Font.BOLD, 12));
		fridayCourse_Label.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_syllabus = new GroupLayout(panel_syllabus);
		gl_panel_syllabus.setHorizontalGroup(
			gl_panel_syllabus.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_syllabus.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_panel_syllabus.createParallelGroup(Alignment.TRAILING)
						.addComponent(wednesdayCouse_Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(textField_wednesdayCourse, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(textField_mondayCourse, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(thursdayCourse_Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(textField_thursdayCourse, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(tuesdayCourse_Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(textField__tuesdayCourse, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(fridayCourse_Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(textField_fridayCourse, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
						.addComponent(mondayCourse_Label, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
					.addGap(39))
				.addComponent(lbl_sdtSyllabusTopic, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
		);
		gl_panel_syllabus.setVerticalGroup(
			gl_panel_syllabus.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_syllabus.createSequentialGroup()
					.addComponent(lbl_sdtSyllabusTopic, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(mondayCourse_Label, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(textField_mondayCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tuesdayCourse_Label)
					.addGap(1)
					.addComponent(textField__tuesdayCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(wednesdayCouse_Label)
					.addGap(1)
					.addComponent(textField_wednesdayCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(thursdayCourse_Label)
					.addGap(1)
					.addComponent(textField_thursdayCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(fridayCourse_Label)
					.addGap(1)
					.addComponent(textField_fridayCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		panel_syllabus.setLayout(gl_panel_syllabus);
		
		JLabel lbl_topicDetailsPage = new JLabel("DETAILS INFORMTIONS OF STUDENT");
		lbl_topicDetailsPage.setBackground(new Color(0, 0, 0));
		lbl_topicDetailsPage.setForeground(new Color(0, 0, 0));
		lbl_topicDetailsPage.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_topicDetailsPage.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField_nameSurname = new JTextField();
		textField_nameSurname.setBackground(Color.WHITE);
		textField_nameSurname.setFont(new Font("Tahoma", Font.BOLD, 12));
		textField_nameSurname.setForeground(new Color(0, 0, 0));
		textField_nameSurname.setHorizontalAlignment(SwingConstants.CENTER);
		textField_nameSurname.setEditable(false);
		textField_nameSurname.setColumns(10);
		
		JLabel mondayCourse_Label_1 = new JLabel("Student :");
		mondayCourse_Label_1.setForeground(new Color(0, 0, 0));
		mondayCourse_Label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(mondayCourse_Label_1, GroupLayout.PREFERRED_SIZE, 64, Short.MAX_VALUE)
							.addGap(37)
							.addComponent(textField_nameSurname, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel_syllabus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
							.addComponent(panel_schoolBusDetails, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(26))
				.addComponent(lbl_topicDetailsPage, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lbl_topicDetailsPage, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_nameSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(mondayCourse_Label_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_syllabus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_schoolBusDetails, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(22))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
