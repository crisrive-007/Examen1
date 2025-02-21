/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 50494
 */
public abstract class SocialClass {
    protected String username;
    protected ArrayList <String> friends = new ArrayList<>();
    protected ArrayList <String> posts = new ArrayList<>();

    public SocialClass(String username) {
        this.username = username;
        this.friends = new ArrayList();
        this.posts = new ArrayList();
    }
    
     public boolean addFriend(String user) {
        if (user == null || user.isEmpty() || user.equals(username) || friends.contains(user)) {
            return false;
        }
        friends.add(user);
        return true;
    }
    
    public void addPost(String msg){
       if (msg != null && !msg.isEmpty()) {
            posts.add(msg);
        }
    }
    
    public abstract void timeline();
    
    public void myProfile(){
        String profileInfo = "Usuario: " + username + "\n\n";   
        timeline(); 
        profileInfo += "Amigos:\n";
        for (int i = 0; i < friends.size(); i++) {
            profileInfo += friends.get(i) + " ";
            if ((i + 1) % 10 == 0) {
                profileInfo += "\n"; 
            }
        }
        JOptionPane.showMessageDialog(null, profileInfo, "Perfil de " + username, JOptionPane.INFORMATION_MESSAGE);
    }
}
