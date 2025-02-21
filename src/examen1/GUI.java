/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
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
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.WHITE);
        
      
        //backgroundLabel.setLayout(new GridBagLayout());
        //add(backgroundLabel, BorderLayout.CENTER);
        
      
        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 15, 105));
        buttonPanel.setOpaque(false);
        
       
        JButton facebookButton = new JButton("FACEBOOK");
        facebookButton.setBackground(new Color(51, 153, 255));
        facebookButton.setForeground(Color.WHITE);
        facebookButton.setFont(new Font("Arial", Font.BOLD, 16));
        facebookButton.setFocusPainted(false);
        facebookButton.setBorderPainted(false);
        
       
        JButton twitterButton = new JButton("TWITTER");
        twitterButton.setBackground(new Color(0, 0, 255));
        twitterButton.setForeground(Color.WHITE);
        twitterButton.setFont(new Font("Arial", Font.BOLD, 16));
        twitterButton.setFocusPainted(false);
        twitterButton.setBorderPainted(false);
        
       
        JButton uberSocialButton = new JButton("UBERSOCIAL");
        uberSocialButton.setBackground(new Color(0, 0, 204));
        uberSocialButton.setForeground(Color.WHITE);
        uberSocialButton.setFont(new Font("Arial", Font.BOLD, 16));
        uberSocialButton.setFocusPainted(false);
        uberSocialButton.setBorderPainted(false);
        
    
        buttonPanel.add(facebookButton);
        buttonPanel.add(twitterButton);
        buttonPanel.add(uberSocialButton);
        
      
        //backgroundLabel.add(buttonPanel);
    }



}
    

