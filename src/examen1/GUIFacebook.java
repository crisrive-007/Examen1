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
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author 50494
 */
public class GUIFacebook extends JFrame{
    
     private JPanel panel;
     private JPanel panelBotones;
     private ArrayList<String> FacebookAccounts;
     private ArrayList<String> FacebookFriends;

    public GUIFacebook() {
        this.setSize(712, 506);
        setTitle("Facebook");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        FacebookAccounts = new ArrayList<>();
        iniciarComponentes();
        setVisible(true);
    }
    
    public void iniciarComponentes() {
        panel = new JPanel();
        panel.setLayout(null);
        colocarBotones();
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);
    }
    
    public void colocarBotones() {
        JLabel etiqueta = new JLabel("Facebook");
        panel.add(etiqueta);
        etiqueta.setBounds(290, 65, 300, 50);
        etiqueta.setForeground(Color.BLACK);
        etiqueta.setFont(new Font("Tahoma", Font.BOLD, 36));
        

        panelBotones = new JPanel();
        panelBotones.setLayout(null);
        panelBotones.setBounds(0, 0, 712, 506);
        panel.add(panelBotones);

        JButton agregar = new JButton("Agregar cuenta");
        agregar.setBounds(100, 150, 214, 46);
        agregar.setFont(new Font("Tahoma", Font.BOLD, 18));
        agregar.setBackground(Color.CYAN);
        panelBotones.add(agregar);
        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = JOptionPane.showInputDialog("Escriba su usuario:");
                if (username != null && !username.trim().isEmpty()) {
                    FacebookAccounts.add(username);
                    JOptionPane.showMessageDialog(null, "Cuenta agregada: " + username);
                }
            }
        });

        JButton amigos = new JButton("Agregar amigos");
        amigos.setBounds(400, 150, 214, 46);
        amigos.setFont(new Font("Tahoma", Font.BOLD, 18));
        amigos.setBackground(Color.CYAN);
        panelBotones.add(amigos);
        amigos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String friendName = JOptionPane.showInputDialog("Ingrese el nombre del amigo:");
                if (friendName != null && !friendName.trim().isEmpty()) {
                    FacebookFriends.add(friendName);
                    JOptionPane.showMessageDialog(null, "Amigo agregado: " + friendName);
                }
            }
        });

        JButton post = new JButton("Agregar post");
        post.setBounds(100, 300, 214, 46);
        post.setFont(new Font("Tahoma", Font.BOLD, 18));
        post.setBackground(Color.CYAN);
        panelBotones.add(post);

        JButton salir = new JButton("Salir");
        salir.setBounds(400, 300, 214, 46);
        salir.setFont(new Font("Tahoma", Font.BOLD, 24));
        salir.setBackground(Color.CYAN);
        panelBotones.add(salir);

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}