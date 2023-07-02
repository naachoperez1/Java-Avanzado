package SOLID.Ejercicio27;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        UsuariosManager usermanager = new UsuariosManager();

        Usuario usr1 = new Usuario("naachoperez1", "naachoperez11@gmail.com", 25);
        usermanager.GuardarUsuario(usr1);

        Usuario usr2 = new Usuario("matuperez08", "mateoperez_08@gmail.com", 14);
        usermanager.GuardarUsuario(usr2);

        Usuario usr3 = new Usuario("valeperez96", "valeperez_96@gmail.com", 27);
        usermanager.GuardarUsuario(usr3);


        usermanager.GetUsuario("naachoperez1");
        usermanager.GetUsuario("naachoperez");

        usermanager.UpdateUsuario("valeperez96", "edad", "30");
        usermanager.GetUsuario("valeperez96");

        usermanager.BorrarUsuario("matuperez08");
        usermanager.GetAllUsuarios();

//        usermanager.GetAllUsuarios();
    }
}
