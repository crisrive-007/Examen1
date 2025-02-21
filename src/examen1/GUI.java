/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame {

    private JPanel panel;
    private JPanel panelBotones;
    UberSocial us = new UberSocial();

    public GUI() {
        setTitle("Redes Sociales");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.WHITE);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        buttonPanel.setOpaque(false);

        JButton facebookButton = new JButton("FACEBOOK");
        facebookButton.setBackground(new Color(255, 102, 102));
        facebookButton.setFont(new Font("Arial", Font.BOLD, 16));
        facebookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUIFacebook();
                dispose();
            }
        });

        JButton twitterButton = new JButton("TWITTER");
        twitterButton.setBackground(new Color(255, 102, 102));
        twitterButton.setFont(new Font("Arial", Font.BOLD, 16));
        twitterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiTwitter tw = new guiTwitter();
                tw.setVisible(true);
                dispose();
            }
        });

        JButton printButton = new JButton("IMPRIMIR");
        printButton.setBackground(new Color(255, 102, 102));
        printButton.setFont(new Font("Arial", Font.BOLD, 16));
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String usuario = JOptionPane.showInputDialog("Ingresa el nombre del usuario que deseas imprimir la informacion.");
                SocialClass user = us.buscar(usuario);
                if (user != null) {
                    user.myProfile();
                    user.timeline();
                } else {
                    JOptionPane.showMessageDialog(null, "Este usuario no existe.");
                }

                JOptionPane.showMessageDialog(null, "Imprimir perfiles y timelines");
                
            }
        });

        buttonPanel.add(facebookButton);
        buttonPanel.add(twitterButton);
        buttonPanel.add(printButton);

        add(buttonPanel, BorderLayout.CENTER);

        setVisible(true);
    }

}