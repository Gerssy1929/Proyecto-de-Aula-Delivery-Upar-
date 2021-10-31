
package Entidades;


public class Administrador extends Persona {
    private String username;
    private String password; 


      public Administrador(String nombre, String apellido, long id, String username, String password) {
        super(nombre, apellido, id);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getDatosPersona() {
        return "Nombre de Usuario: " + this.username;
    }
      
      
}




    