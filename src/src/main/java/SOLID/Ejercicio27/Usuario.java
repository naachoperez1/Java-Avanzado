package SOLID.Ejercicio27;

public class Usuario {
    String username;
    String mail;
    int edad;

    public Usuario(String username, String mail, int edad) {
        this.username = username;
        this.mail = mail;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", mail='" + mail + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
