package GUI;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;

import project.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import exceptions.noData;
import admin.admin;

public class ProjectReportGui implements GUIInterface{
    JFrame frame = new JFrame();
    JLabel projectApprove = new JLabel("APPROVE PROJECT");
    JLabel id = new JLabel("ID");
    JLabel projectName = new JLabel("Project Name");
    JTextField dynamicProjectNameTextField = new JTextField();
    //JLabel ProjectStatus = new JLabel("Project Status Name");
   // JTextField dynamicProjectStatusTextField = new JTextField();
    JLabel clientID = new JLabel("Client ID");
    JTextField dynamicClientIDTextField = new JTextField();
    JLabel deadline = new JLabel("Deadline Date(YYYY-MM-DD)");
    JTextField dynamicDeadlineTextField = new JTextField();
    JButton backButton = new JButton("BACK");
    String[] emptyArray = { "null" };
    final String[] statusChoices = { "APPROVED", "REJECTED", "DEADLINE DATE CHANGED", "CHANGES REJECTED",
            "CHANGES APPROVED", "WORK IN PROGRESS", "TESTING", "COMPLETED", "PAID" };
            JLabel Status = new JLabel("Project Status");
            JTextField dynamicStatusTextField = new JTextField();
    JLabel descriptionLabel = new JLabel("Project Log");

    JTextArea descriptionTextField = new JTextArea(10, 50);
    JScrollPane scroll = new JScrollPane(descriptionTextField,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

    JComboBox<String> allID3 = new JComboBox<String>(emptyArray);

    Font labelFont = new Font("Arial", Font.PLAIN, 20);
    public ProjectReportGui() throws noData {
    	frame.getContentPane().setBackground(Color.BLACK);
    	id.setFont(labelFont);
        frame.setSize(1280, 1024);
        projectApprove.setFont(labelFont);
        projectApprove.setForeground(Color.GREEN);
        frame.add(projectApprove);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        admin a = new admin();
        String[] projectList = null;
        projectList = a.ProjectListAll();
        System.out.println("projectList: " + projectList.length);
        if(projectList.length == 0){
            throw new noData();
        }
        projectApprove.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        allID3.setBackground(Color.BLACK);
        allID3.removeAllItems();
        for (String id : projectList) {
            allID3.addItem(id);
        }
        allID3.setSelectedIndex(0);
        System.out.println("Printing selected index of allID3:" + allID3.getSelectedIndex());
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(20, 20, 20, 0);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        id.setForeground(Color.GREEN);
        projectApprove.add(id, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        allID3.setForeground(Color.WHITE);
        allID3.setBackground(Color.DARK_GRAY);
        allID3.setBorder(new LineBorder(Color.DARK_GRAY));
        allID3.setForeground(Color.GREEN);
        projectApprove.add(allID3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        projectName.setForeground(Color.white);
        projectName.setFont(labelFont);
        projectName.setForeground(Color.GREEN);
        projectApprove.add(projectName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        projectApprove.add(dynamicProjectNameTextField, gbc);
        dynamicProjectNameTextField.setForeground(Color.WHITE);
        dynamicProjectNameTextField.setBackground(Color.DARK_GRAY);
        dynamicProjectNameTextField.setBorder(new LineBorder(Color.DARK_GRAY));
        dynamicProjectNameTextField.setCaretColor(Color.WHITE);
        dynamicProjectNameTextField.setEditable(false);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        clientID.setForeground(Color.white);
        clientID.setFont(labelFont);
        clientID.setForeground(Color.GREEN);
        projectApprove.add(clientID, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        dynamicClientIDTextField.setForeground(Color.WHITE);
        dynamicClientIDTextField.setBackground(Color.DARK_GRAY);
        dynamicClientIDTextField.setBorder(new LineBorder(Color.DARK_GRAY));
        dynamicClientIDTextField.setCaretColor(Color.WHITE);
        dynamicClientIDTextField.setEditable(false);
        projectApprove.add(dynamicClientIDTextField, gbc);
        

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        deadline.setForeground(Color.white);
        deadline.setFont(labelFont);
        deadline.setForeground(Color.GREEN);
        projectApprove.add(deadline, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        dynamicDeadlineTextField.setForeground(Color.WHITE);
        dynamicDeadlineTextField.setBackground(Color.DARK_GRAY);
        dynamicDeadlineTextField.setBorder(new LineBorder(Color.DARK_GRAY));
        dynamicDeadlineTextField.setCaretColor(Color.WHITE);
        dynamicDeadlineTextField.setEditable(false);
        projectApprove.add(dynamicDeadlineTextField, gbc);
        
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        Status.setForeground(Color.GREEN);
        projectApprove.add(Status, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        dynamicStatusTextField.setForeground(Color.WHITE);
        dynamicStatusTextField.setBackground(Color.DARK_GRAY);
        dynamicStatusTextField.setBorder(new LineBorder(Color.DARK_GRAY));
        dynamicStatusTextField.setCaretColor(Color.WHITE);
        dynamicStatusTextField.setEditable(false);
        projectApprove.add(dynamicStatusTextField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        descriptionLabel.setForeground(Color.white);
        descriptionLabel.setFont(labelFont);
        descriptionLabel.setForeground(Color.GREEN);
        projectApprove.add(descriptionLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        descriptionTextField.setForeground(Color.WHITE);
        descriptionTextField.setBackground(Color.DARK_GRAY);
        descriptionTextField.setBorder(new LineBorder(Color.DARK_GRAY));
        descriptionTextField.setCaretColor(Color.WHITE);
        descriptionTextField.setLineWrap(true);
        descriptionTextField.setEditable(false);
        projectApprove.add(scroll, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
        backButton.setFont(labelFont);
        backButton.setForeground(Color.GREEN);
        projectApprove.add(backButton, gbc);

        /* gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        projectApprove.add(Approve,gbc); */
        allID3.addActionListener(new handleShowProjectDetails());
        // Approve.addActionListener(new handleStatusChange());
        frame.setVisible(true);
        backButton.addActionListener(new goToMainMenu());
    }

    public void resetTextFields(){
        dynamicProjectNameTextField.setText("Select Data From the Drop Down List");
        dynamicDeadlineTextField.setText("Select Data From the Drop Down List");
    
    }
    
    private void updateProjectGUI(project P) {

        int index = 0;
        String item = P.getProjectStatus();
        System.out.println("item: " + item);

        //  if(item == null)
        //   throw new noData();    
        for (int i = 0; i < statusChoices.length; i++) {
            if (item.compareToIgnoreCase(statusChoices[i]) == 0) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        dynamicProjectNameTextField.setText(P.getProjectName());
        System.out.println(P.getClientID()); //--> Shows NULL here
        dynamicClientIDTextField.setText(P.getClientID());
        //System.out.println("UpdateRemEmpGUI: " + p.getName());
        //dynamicProjectStatusTextFieldsetText(P.getProjectStatus());
        dynamicStatusTextField.setText(P.getProjectStatus());
        dynamicDeadlineTextField.setText(P.getProjectDeadline());
        String full_log = P.getProjectLog();
        String description = full_log.replaceAll("\\\\n", System.getProperty("line.separator"));
        description = full_log.replaceAll("#", System.getProperty("line.separator"));
        descriptionTextField.setText(description);
    }

    class handleShowProjectDetails implements ActionListener {
        public void actionPerformed(ActionEvent a) {
            /*reports will be added later*/

        }
    }
    class goToMainMenu implements ActionListener{
        public void actionPerformed(ActionEvent a){
            frame.dispose();
            new AdminGUI(); 
            //disposing and re-creating the frame fixed a lot of bugs in the back button part of the GUI such as the showProjectDetails 
        }
    }
}
class DriverProRep {
        public static void main(String[] args) {
            try{
                new ProjectReportGui();
            }catch(noData nd){
                nd.displaYError(new JFrame());
            }
            //adg.logPrompt();
        }
    }

