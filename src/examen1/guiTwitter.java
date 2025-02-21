/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 50494
 */
public class guiTwitter extends JFrame {

    private JPanel panel;
    private JPanel panelBotones;
    UberSocial us = new UberSocial();
    public String usuario;

    public guiTwitter() {
        this.setSize(712, 506);
        setTitle("Twitter");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();

    }

    public void iniciarComponentes() {

        panel = new JPanel();
        panel.setLayout(null);
        colocarBotones();
        panel.setBackground(Color.WHITE);
        this.getContentPane().add(panel);

    }

    public void colocarBotones() {

        JLabel etiqueta = new JLabel("Twitter");
        panel.add(etiqueta);//agregar etiqueta al panel
        etiqueta.setBounds(290, 65, 300, 50);//tamaño y posición de la etiqueta
        etiqueta.setForeground(Color.BLACK);//ponerle color a las letras 
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
                usuario = JOptionPane.showInputDialog("Escriba su usuario:");
                SocialClass user = us.buscar(usuario);
                if (user == null) {
                    us.agregarCuenta(usuario, "TWITTER");
                    JOptionPane.showMessageDialog(null, "Se ha agregado a al usuario " + usuario + ".");
                } else {
                    JOptionPane.showMessageDialog(null, "Este usuario ya existe.");
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
            SocialClass user = us.buscar(usuario);

            if (friendName != null && !friendName.trim().isEmpty()) {
                if (friendName.equals(usuario)) {
                    JOptionPane.showMessageDialog(null, "No se puede agregar al mismo usuario actual.");
                    return;
                }

                for (String friend : user.friends) {
                    if (friend.equals(friendName)) {
                        JOptionPane.showMessageDialog(null, "Este amigo ya está agregado.");
                        return;
                    }
                }

                user.friends.add(friendName);
                JOptionPane.showMessageDialog(null, "Se ha agregado a " + friendName + " como amigo.");
            }
            }
        });

        JButton post = new JButton("Agregar post");
        post.setBounds(100, 300, 214, 46);
        post.setFont(new Font("Tahoma", Font.BOLD, 18));
        post.setBackground(Color.CYAN);
        panelBotones.add(post);

        post.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String mensaje = JOptionPane.showInputDialog("Agrega un mensaje.");
            SocialClass user = us.buscar(usuario);
            
            user.addPost(mensaje);
            }
        });

        JButton salir = new JButton("salir");
        salir.setBounds(400, 300, 214, 46);
        salir.setFont(new Font("Tahoma", Font.BOLD, 24));
        salir.setBackground(Color.CYAN);
        panelBotones.add(salir);

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

}