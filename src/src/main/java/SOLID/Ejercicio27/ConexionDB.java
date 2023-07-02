package SOLID.Ejercicio27;

import java.io.IOException;
import java.util.ArrayList;

public interface ConexionDB {
  default void GuardarUsuario(Usuario usuario) throws IOException {};
  default void GetUsuario(String username){};
  default void GetAllUsuarios(){};
  default void UpdateUsuario(String username, String propiedad, String valor){};
  default void BorrarUsuario(String username){};
}
