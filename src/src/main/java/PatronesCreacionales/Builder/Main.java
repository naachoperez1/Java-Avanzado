package PatronesCreacionales.Builder;

public class Main {
    public static void main(String[] args) {
//       BUILDER: El patrón Builder (constructor o constructor fluido) es un patrón de diseño creacional
//       que se utiliza para construir objetos complejos paso a paso. El patrón Builder permite crear
//       diferentes variaciones de un objeto utilizando un mismo proceso de construcción, ocultando
//       la complejidad del proceso de construcción detrás de una interfaz simple y fluida.
//       CASO DE USO: Creación de objetos con muchos parámetros: Cuando una clase tiene muchos atributos
//       y parámetros opcionales, el uso de constructores con muchos argumentos puede volverse incómodo
//       y propenso a errores. En su lugar, se puede utilizar el patrón Builder para proporcionar una
//       forma más legible y mantenible de construir objetos complejos, permitiendo establecer solo
//       los atributos necesarios y omitiendo los opcionales.

        Vehiculo coche = new VehiculoBuilder("Ferrari").setMotor("Combustion").setPuertas(4).setTipo("Formula 1").build();

        System.out.println(coche.getMarca());
        System.out.println(coche.getMotor());
        System.out.println(coche.getTipo());
        System.out.println(coche.getNumeroPuertas());






    }
}
