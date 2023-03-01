package Seller;

import javax.swing.*;
import java.awt.*;

public class SellerGUI extends JFrame {

    public SellerGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 447, 471);
        getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(10, 39, 255, 385);
        panel.add(panel_1);

        JButton btngetComplaint = new JButton("Get Complaint");
        btngetComplaint.setBounds(10, 8, 255, 21);
        panel.add(btngetComplaint);

        JButton btnAnswer = new JButton("Answer complaint");
        btnAnswer.setBounds(275, 39, 148, 21);
        panel.add(btnAnswer);

        JLabel lblDate = new JLabel("Date");
        lblDate.setBounds(275, 411, 148, 13);
        panel.add(lblDate);
    }
}
