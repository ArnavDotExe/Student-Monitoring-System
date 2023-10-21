package sms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu extends JFrame implements ActionListener {

    JButton addDetails, viewMarks, viewDetails, addAttendance, viewAttendance;

    int x = 225;

    menu() {
        setSize(600, 600);

        addDetails = new JButton("ADD DETAILS");
        addDetails.setBounds(x, 80, 150, 50);
        addDetails.addActionListener(this);
        add(addDetails);

        viewDetails = new JButton("VIEW DETAILS");
        viewDetails.setBounds(x, 160, 150, 50);
        viewDetails.addActionListener(this);
        add(viewDetails);

        viewMarks = new JButton("VIEW MARKS");
        viewMarks.setBounds(x, 240, 150, 50);
        viewMarks.addActionListener(this);
        add(viewMarks);

        viewAttendance = new JButton("VIEW ATTENDANCE");
        viewAttendance.setBounds(x, 320, 150, 50);
        viewAttendance.addActionListener(this);
        add(viewAttendance);

        addAttendance = new JButton("ADD ATTENDANCE");
        addAttendance.setBounds(x, 400, 150, 50);
        addAttendance.addActionListener(this);
        add(addAttendance);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }


    public static void main(String[] args) {
        new menu();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == addDetails) {
            new addDetails();
        }
        if (ae.getSource() == viewDetails) {
            new viewDetails();
        }
        if (ae.getSource() == viewMarks) {
            new viewMarks();
        }
        if (ae.getSource() == viewAttendance) {
            new viewAttendance();
        }
        if (ae.getSource() == addAttendance) {
            new addAttendance();
        }

    }
}

