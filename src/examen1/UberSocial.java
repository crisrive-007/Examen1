package examen1;

import java.util.ArrayList;


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
   
   public SocialClass buscar(String username){
    return buscar(username,0);
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
      
      public void agregarPost(){}
   
   
   
   
   
   
}
