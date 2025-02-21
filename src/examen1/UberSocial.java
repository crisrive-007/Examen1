package examen1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UberSocial {

    ArrayList<SocialClass> redes = new ArrayList<>();

    //1
    private SocialClass buscar(String username, int index) {
        if (index >= redes.size()) {
            return null;
        }
        if (redes.get(index).username.equals(username)) {
            return redes.get(index);
        } else {
            return buscar(username, index + 1);
        }
    }

    public SocialClass buscar(String username) {
        return buscar(username, 0);
    }

    //2
    public void agregarCuenta(String username, String tipo) {
        if (buscar(username) != null) {
            //no es unico
        }
        if (tipo.equals("FACEBOOK")) {
            redes.add(new Facebook(username));
        } else if (tipo.equals("TWITTER")) {
            redes.add(new Twittter(username));
        } else {
            //no existe
        }
    }

    //3
    public void agregarPost(String user, String post) {
        if (buscar(user) != null) {
            buscar(user).addPost(post);
        } else {

        }
    }

    public void agregarAmigo(String user1, String user2) {
        SocialClass usuario1 = buscar(user1);
        SocialClass usuario2 = buscar(user2);

        if (usuario2.getClass() == usuario1.getClass()) {
            usuario1.addFriend(user2);
            JOptionPane.showMessageDialog(null, "Se ha agregado a " + user2 + " como amigo.");
        } else {
            for (String amigo : usuario1.friends) {
                if (user2.equals(amigo)) {
                    JOptionPane.showMessageDialog(null, "Ya son amigos actualmente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha encontrado esa cuenta en " + usuario1.getClass().getSimpleName() + ".");
                }
            }
        }
    }
    
    public void agregarComment(String user, int postID, String autor, String comment) {
        SocialClass usuario = buscar(user);
        if (usuario instanceof Facebook) {
            Comment comentario = new Comment(postID, autor, comment);
            ((Facebook) usuario).addComment(comentario);
        }
    }
    
    public void profileFrom(String user) {
        
    }

}
