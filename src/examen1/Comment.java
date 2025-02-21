package examen1;

import java.util.Calendar;

public final class Comment {
   protected int postId;
   protected String autor;
   protected String comentario;
   protected Calendar fecha; 

    public Comment(int postId, String autor, String comentario) {
        this.postId = postId;
        this.autor = autor;
        this.comentario = comentario;
        fecha = Calendar.getInstance(); 
    }
   
   public String print(){
   return (autor+" - "+fecha+" \n"+comentario);
   }
   
}
