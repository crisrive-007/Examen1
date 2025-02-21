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
        setLayout(new BorderLayout());
<<<<<<< HEAD
        getContentPane().setBackground(Color.WHITE);
        
      
        //backgroundLabel.setLayout(new GridBagLayout());
        //add(backgroundLabel, BorderLayout.CENTER);
        
      
        JPanel buttonPanel = new JPanel(new GridLayout(3, 1, 15, 105));
=======
        getContentPane().setBackground(Color.WHITE); 

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
>>>>>>> 6f76a97ea5f21175650504ec49215ac4d021fd71
        buttonPanel.setOpaque(false);

        JButton facebookButton = new JButton("FACEBOOK");
        facebookButton.setBackground(new Color(51, 153, 255));
        facebookButton.setFont(new Font("Arial", Font.BOLD, 16));

        JButton twitterButton = new JButton("TWITTER");
        twitterButton.setBackground(new Color(255, 102, 0));
        twitterButton.setFont(new Font("Arial", Font.BOLD, 16));

        JButton uberSocialButton = new JButton("UBERSOCIAL");
        uberSocialButton.setBackground(new Color(255, 51, 51));
        uberSocialButton.setFont(new Font("Arial", Font.BOLD, 16));

        buttonPanel.add(facebookButton);
        buttonPanel.add(twitterButton);
        buttonPanel.add(uberSocialButton);
<<<<<<< HEAD
        
      
        //backgroundLabel.add(buttonPanel);
    }



}
=======

        add(buttonPanel, BorderLayout.CENTER);
    }
}

>>>>>>> 6f76a97ea5f21175650504ec49215ac4d021fd71
    

