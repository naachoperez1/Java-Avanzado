package PatronesCreacionales.Prototipo;

public class Main {
    public static void main(String[] args) {
        Producto prototipo = new Producto("Producto prototipo");
        Producto productoClonado = (Producto) prototipo.clonar();

        System.out.println("Prototipo: " + prototipo.getNombre());
        System.out.println("Clonado: " + productoClonado.getNombre());

        productoClonado.setNombre("Producto clonado");
        System.out.println("Prototipo: " + prototipo.getNombre());
        System.out.println("Clonado modificado: " + productoClonado.getNombre());
    }
}