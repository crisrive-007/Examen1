package examen1;

import javax.swing.JOptionPane;

public class Twittter extends SocialClass{

    public Twittter(String username) {
        super(username);
    }

    @Override
    public void timeline() {
         String timelinePosts = "Timeline de " + username + "\n\n";
        for (String post : posts) {
            timelinePosts += post + "\n";
        }
        JOptionPane.showMessageDialog(null, timelinePosts, "Timeline", JOptionPane.INFORMATION_MESSAGE);
    }    
}
