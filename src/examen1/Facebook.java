/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author river
 */
public class Facebook extends SocialClass implements Commentable{
    
    public ArrayList<ArrayList<Comment>> comentarios;
    
    public Facebook(String username) {
        super(username);
        comentarios = new ArrayList();
    }

    @Override
    public boolean addComment(Comment comment) {
        int postID = 0;
        if (postID < posts.size()) {
            comentarios.get(postID).add(comment);
            return true;
        }
        return false;
    }
    
    @Override
    public void timeline() {
        for (int i = 0; i < posts.size(); i++) {
            String post = "POST " + i + "\n" + posts.get(i);
            String coments = null;
            for (Comment comentario : comentarios.get(i)) {
                coments += comentario + "\n";
            }
            JOptionPane.showMessageDialog(null, post + "\n" + "\n" + coments);
        }
    }
    
}
