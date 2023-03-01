package Worker;

import javax.swing.*;
import java.awt.*;

public class WorkerGUI extends JFrame {

    public WorkerGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 770, 471);
        getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(10, 39, 255, 385);
        panel.add(panel_1);

        JButton btnTakeComplaintFromClient = new JButton("Check for complaints");
        btnTakeComplaintFromClient.setBounds(10, 8, 255, 21);
        panel.add(btnTakeComplaintFromClient);

        JLabel lblDate = new JLabel("Date");
        lblDate.setBounds(651, 383, 101, 13);
        panel.add(lblDate);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(Color.WHITE);
        panel_2.setBounds(386, 101, 255, 323);
        panel.add(panel_2);

        JButton btnSendSeller = new JButton("Send to seller");
        btnSendSeller.setBounds(275, 10, 156, 21);
        panel.add(btnSendSeller);

        JButton btnSendBackToClient = new JButton("Send back");
        btnSendBackToClient.setBounds(275, 41, 156, 21);
        panel.add(btnSendBackToClient);

        JButton btnFinalizeComplaint = new JButton("Finalize");
        btnFinalizeComplaint.setBounds(275, 72, 156, 21);
        panel.add(btnFinalizeComplaint);

        JButton btnGetFromSeller = new JButton("Get from seller");
        btnGetFromSeller.setBounds(568, 70, 178, 21);
        panel.add(btnGetFromSeller);
    }
}
