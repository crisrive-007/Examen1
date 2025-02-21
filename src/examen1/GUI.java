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
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI extends JFrame {
    private JPanel panel;
    private JPanel panelBotones;

    
    public GUI(){
        setTitle("Redes Sociales");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.WHITE); 

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
        buttonPanel.setOpaque(false);

        JButton facebookButton = new JButton("FACEBOOK");
        facebookButton.setBackground(new Color(255, 102, 102));
        facebookButton.setFont(new Font("Arial", Font.BOLD, 16));
        
        facebookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        JButton twitterButton = new JButton("TWITTER");
        twitterButton.setBackground(new Color(255, 102, 102));
        twitterButton.setFont(new Font("Arial", Font.BOLD, 16));
      
        twitterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });

        JButton PrintButton = new JButton("IMPRIMIR");
        PrintButton.setBackground(new Color(255, 102, 102));
        PrintButton.setFont(new Font("Arial", Font.BOLD, 16));
        
        PrintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });


        buttonPanel.add(facebookButton);
        buttonPanel.add(twitterButton);
        buttonPanel.add(PrintButton);

        add(buttonPanel, BorderLayout.CENTER);
    }
}

    

