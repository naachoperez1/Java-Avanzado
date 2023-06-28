package Excepciones;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException, IndexOutOfBoundsException {
//      Funcion que lanza una ArithmeticException.
        dividirDosNumeros(5,0);

//      Funcion que lanza una IndexOutOfBoundsException.
        ArrayList <String> nombres = new ArrayList<>();
        nombres.add("jose");
        nombres.add("pedro");
        nombres.add("nacho");
        nombres.add("pepe");
        imprimirNombres(nombres);

//      Funcion que lanza FileNotFoundException.
        editarFichero("ruta/incorrecta/deArchivo");


    }

    public static void dividirDosNumeros(int a, int b) throws ArithmeticException {
        int resultado;
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("No se puede dividir por 0");
        }
        System.out.println(resultado);
    }

    static void imprimirNombres(ArrayList<String> nombres) throws IndexOutOfBoundsException{
        try {
            String novenoNombre = nombres.get(9);
            System.out.println(novenoNombre);
        }catch (IndexOutOfBoundsException e ){
//            System.out.println("El array solo tiene " + nombres.size() + " elementos.");
            throw new IndexOutOfBoundsException("El array solo tiene " + nombres.size() + " elementos.");
        }
        finally {
            System.out.println(nombres);
        }
    }

    static void editarFichero(String rutaDeAcceso) throws FileNotFoundException{
        try {
            // Crear una instancia de la clase File con la ruta del archivo
            File archivo = new File(rutaDeAcceso);

            // Crear una instancia de la clase Scanner para leer el archivo
            Scanner scanner = new Scanner(archivo);

            // Leer el contenido del archivo línea por línea
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
           throw new FileNotFoundException("El archivo no existe en el directorio.");
        }
    }
}
