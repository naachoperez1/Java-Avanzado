package SOLID.Ejercicio27;

public interface ConexionDBFichero {
    default void CrearFichero(String nombreArchivo){};
    default void EliminarFichero(String nombreArchivo){};

}
