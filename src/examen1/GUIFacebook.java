/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 50494
 */
public class GUIFacebook extends JFrame{
    
     private JPanel panel;
     private JPanel panelBotones;
     UberSocial us = new UberSocial();
     public String usuario;

    public GUIFacebook() {
        this.setSize(712, 506);
        setTitle("Facebook");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
       agregar.addActionListener(e -> {
            usuario = JOptionPane.showInputDialog("Escriba su usuario:");
            SocialClass user = us.buscar(usuario);
            if (user == null) {
                us.agregarCuenta(usuario, "FACEBOOK");
                JOptionPane.showMessageDialog(null, "Se ha agregado a al usuario " + usuario +".");
            } else {
                JOptionPane.showMessageDialog(null, "Este usuario ya existe.");
            }
        });

        JButton amigos = new JButton("Agregar amigos");
        amigos.setBounds(400, 150, 214, 46);
        amigos.setFont(new Font("Tahoma", Font.BOLD, 18));
        amigos.setBackground(Color.CYAN);
        panelBotones.add(amigos);
       
        amigos.addActionListener(e -> {
            String friendName = JOptionPane.showInputDialog("Ingrese el nombre del amigo:");
            SocialClass user = us.buscar(usuario);

            if (friendName != null && !friendName.trim().isEmpty()) {
                if (friendName.equals(usuario)) {
                    JOptionPane.showMessageDialog(null, "No se puede agregar al mismo usuario actual.");
                    return;
                }

                for (String friend : user.friends) {
                    if (friend.equals(friendName)) {
                        JOptionPane.showMessageDialog(null, "Este amigo ya está agregado.");
                        return;
                    }
                }

                user.friends.add(friendName);
                JOptionPane.showMessageDialog(null, "Se ha agregado a " + friendName + " como amigo.");
            }
        });


        JButton post = new JButton("Agregar post");
        post.setBounds(100, 300, 214, 46);
        post.setFont(new Font("Tahoma", Font.BOLD, 18));
        post.setBackground(Color.CYAN);
        panelBotones.add(post);
        
        post.addActionListener(e -> {
            String mensaje = JOptionPane.showInputDialog("Agrega un mensaje.");
            SocialClass user = us.buscar(usuario);
            
            user.addPost(mensaje);
        });

        JButton salir = new JButton("Salir");
        salir.setBounds(400, 300, 214, 46);
        salir.setFont(new Font("Tahoma", Font.BOLD, 24));
        salir.setBackground(Color.CYAN);
        panelBotones.add(salir);

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GUI();
                dispose();
            }
        });
    }}