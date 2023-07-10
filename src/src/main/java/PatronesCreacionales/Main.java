package PatronesCreacionales;

import PatronesCreacionales.SingletonClass;
// nuevo comentario anasheeee
public class Main {
    public static void main(String[] args) {


//      SINGLETON: Es un patrón de diseño creacional que se utiliza para garantizar que una
//      clase tenga una única instancia y proporcionar un punto de acceso global a dicha instancia.
//      CASO DE USO: Gestor de conexiones de base de datos: En una aplicación que requiere acceder a
//      una base de datos, se puede utilizar el patrón Singleton para crear un único objeto que
//      administre la conexión con la base de datos. Esto garantiza que todos los componentes de la
//      aplicación utilicen la misma conexión y evita la creación de múltiples conexiones innecesarias.

        SingletonClass singleton = SingletonClass.getInstance();
        singleton.contador = 10;
        System.out.println("valor: " + singleton.contador + ". Ubicacion: " + singleton );

        SingletonClass singleton1 = SingletonClass.getInstance();
        singleton1.contador = 25;
        System.out.println("valor: " + singleton1.contador + ". Ubicacion: " + singleton1 );
    }



//  Patrones estructurales:
//
//      1. DECORATOR: es un patrón de diseño estructural que permite agregar funcionalidad adicional a
//         un objeto de manera dinámica. El patrón Decorador actúa como una capa de envoltura alrededor de
//         un objeto existente, agregando comportamiento sin modificar la estructura subyacente.
//         CASO DE USO: Extensión de funcionalidad de objetos existentes: El patrón Decorador permite
//         agregar funcionalidad adicional a objetos existentes sin modificar su estructura interna.
//         Esto es útil cuando se desea añadir comportamiento adicional a un objeto de manera flexible y
//         dinámica, evitando una proliferación de clases hijas.
//
//      2. ADAPTER: es un patrón de diseño estructural que permite que dos interfaces incompatibles
//         trabajen juntas mediante la conversión de la interfaz de uno de los objetos en una interfaz
//         esperada por el otro objeto. El adaptador actúa como un intermediario entre dos objetos,
//         facilitando la comunicación y la colaboración entre ellos.
//         CASO DE USO: Integración de componentes heredados: Cuando se trabaja con código heredado o con
//         componentes de terceros que tienen interfaces incompatibles con el sistema actual, el patrón
//         Adapter se utiliza para adaptar la interfaz del componente existente al sistema actual.
//         Esto evita la necesidad de modificar el código existente y permite su reutilización.
//
//      3. FACADE: es un patrón de diseño estructural que proporciona una interfaz simplificada y
//         unificada para un conjunto de interfaces más complejas o subsistemas. Actúa como una capa de
//         acceso o punto de entrada único que oculta la complejidad interna y proporciona una interfaz
//         más sencilla para interactuar con el sistema.
//         CASO DE USO: Simplificar el uso de un sistema complejo: Si se tiene un sistema con múltiples
//         subsistemas o componentes que tienen interfaces complejas, el patrón Facade se utiliza para
//         proporcionar una interfaz más sencilla y fácil de usar. El cliente solo necesita interactuar con
//         la fachada en lugar de tener que conocer y utilizar directamente todas las interfaces internas.


}
