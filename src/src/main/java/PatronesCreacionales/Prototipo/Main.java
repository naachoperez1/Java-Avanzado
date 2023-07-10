package PatronesCreacionales.Prototipo;

public class Main {
    public static void main(String[] args) {

//         PROTOTIPO: El patrón Prototype es un patrón de diseño creacional que se utiliza para crear
//         nuevos objetos a partir de un prototipo existente, clonándolo en lugar de crearlo desde cero.
//         En Java, se puede implementar el patrón Prototype utilizando la interfaz Cloneable y el método
//         clone() para realizar la clonación de objetos.
//         CASO DE USO: Creación de objetos costosos: Si la creación de un objeto es costosa en términos
//         de recursos computacionales o tiempo, y se necesita crear múltiples instancias similares del
//         mismo objeto, el patrón Prototipo puede ser útil. En lugar de crear cada objeto desde cero,
//         se puede utilizar un objeto prototipo y clonarlo para crear nuevas instancias.


        Producto prototipo = new Producto("Producto prototipo");
        Producto productoClonado = (Producto) prototipo.clonar();

        System.out.println("Prototipo: " + prototipo.getNombre());
        System.out.println("Clonado: " + productoClonado.getNombre());

        productoClonado.setNombre("Producto clonado");
        System.out.println("Prototipo: " + prototipo.getNombre());
        System.out.println("Clonado modificado: " + productoClonado.getNombre());
    }
}