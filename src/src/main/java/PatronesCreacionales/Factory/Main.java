package PatronesCreacionales.Factory;

public class Main {
    public static void main(String[] args) {

//         FACTORY: El patrón Factory (o patrón de fábrica) es un patrón de diseño creacional que se
//         utiliza para crear objetos sin exponer la lógica de creación al cliente. En Java, se puede
//         implementar el patrón Factory utilizando una clase fábrica que se encargue de instanciar y
//         devolver objetos de diferentes tipos.
//         CASO DE USO: Abstracción de la creación de objetos: Si se desea ocultar la complejidad de
//         la creación de objetos o la lógica de selección de la subclase al cliente, el patrón Factory
//         puede proporcionar una interfaz común y sencilla para crear objetos. El cliente solo necesita
//         interactuar con la fábrica y no tiene que preocuparse por los detalles de creación.
//
        FactoryPrecio euro = new FactoryPrecio("españa");
        System.out.println(euro.precio.getPrecio());

        FactoryPrecio dolar = new FactoryPrecio("usa");
        System.out.println(dolar.precio.getPrecio());
    }
}
