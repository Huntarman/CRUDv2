package Client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI extends JFrame {
    public JTextField productName;
    public ClientGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 471);
        getContentPane().setLayout(new GridLayout(1, 0, 0, 0));

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        productName = new JTextField();
        productName.setBounds(10, 10, 255, 19);
        panel.add(productName);
        productName.setColumns(10);

        JButton btnSendReturn = new JButton("Send");
        btnSendReturn.setBounds(275, 9, 101, 21);
        panel.add(btnSendReturn);

        JPanel productsPanel = new JPanel();
        productsPanel.setBackground(Color.WHITE);
        productsPanel.setBounds(10, 39, 255, 385);
        panel.add(productsPanel);

        JButton btnCheck = new JButton("Check Product");
        btnCheck.setBounds(275, 40, 101, 69);
        panel.add(btnCheck);

        JButton btnPassTime = new JButton("Pass time");
        btnPassTime.setBounds(275, 403, 101, 21);
        panel.add(btnPassTime);

        JLabel lblDate = new JLabel("Date");
        lblDate.setBounds(275, 380, 101, 13);
        panel.add(lblDate);
    }
}
