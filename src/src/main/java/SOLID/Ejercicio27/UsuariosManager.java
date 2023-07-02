package SOLID.Ejercicio27;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

public class UsuariosManager implements ConexionDB, ConexionDBFichero {
    String archivoTexto = "C:/Users/NoteBook/Downloads/Usuarios.txt";
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public UsuariosManager() {
//        Scanner sc = new Scanner(System.in);

//        System.out.print("Bienvenido al Administrador de usuarios, ingrese la accion que desea realizar: ");
//        String accion = sc.nextLine();
//
//        switch (accion) {
//            case "crear usuario" -> System.out.println("creando usuario");
//            case "modificar usuario" -> System.out.println("modificando usuario");
//            case "mostrar usuario" -> System.out.println("mostrando usuario");
//            case "mostrar usuarios" -> System.out.println("mostrando usuarios");
//            case "eliminar usuario" -> System.out.println("eliminando usuarios");
//        }
    }


    @Override
    public void GuardarUsuario(Usuario usuario) throws IOException {
        usuarios.add(usuario);

//        // Escribir contenido en el archivo
//        FileWriter escritor = new FileWriter(this.archivoTexto);
//        // BufferedWritter es para escribir en una nueva linea cada vez
//        BufferedWriter bufferedWriter = new BufferedWriter(escritor);
//        bufferedWriter.write(usuarioAGuardar);
//        bufferedWriter.newLine();
//
//
//        bufferedWriter.close();

        System.out.println(usuario.username + " guardado en la base de datos.");


    }

    @Override
    public void GetUsuario(String username) {
        for (Usuario user : usuarios){
            if (Objects.equals(user.username, username)){
                System.out.println(user);
                return;
            }
        }

        System.out.println("Usuario " + username + " no encontrado");


    }

    @Override
    public void GetAllUsuarios() {
        for (Usuario user : this.usuarios){
            System.out.println(user);
        }

    }

    @Override
    public void UpdateUsuario(String username, String propiedad, String valor) {
        for (Usuario user : usuarios) {
            if (Objects.equals(username, user.username)) {
                switch (propiedad) {
                    case "edad" -> user.edad = Integer.parseInt(valor);
                    case "username" -> user.username = valor;
                    case "mail" -> user.mail = valor;
                }
            }

        }
    }

    @Override
    public void BorrarUsuario(String username) {
        for (Usuario user : usuarios){
            if (Objects.equals(user.username, username)){
                usuarios.remove(user);
            }
        }
    }

    @Override
    public void CrearFichero(String nombreArchivo) {
        String rutaArchivo = "C:/Users/NoteBook/Downloads/" + nombreArchivo + ".txt";
        try {
            // Crear instancia de la clase File
            File archivo = new File(rutaArchivo);

            // Verificar si el archivo ya existe
            if (archivo.exists()) {
                System.out.println("El archivo ya existe.");
                return;
            }

            // Crear el archivo
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado exitosamente.");
            } else {
                System.out.println("No se pudo crear el archivo.");
            }
            this.archivoTexto = rutaArchivo;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        @Override
    public void EliminarFichero(String nombreArchivo) {
            String rutaArchivo = "C:/Users/NoteBook/Downloads/" + nombreArchivo + ".txt";
            File archivo = new File(rutaArchivo);

            if (archivo.delete()) {
                System.out.println("Archivo eliminado exitosamente.");
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }

    }
}
