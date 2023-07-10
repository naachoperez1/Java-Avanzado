package PatronesCreacionales.Factory;

public class FactoryPrecio {
    Precio precio;
//  Variable del tipo interfaz Precio, osea que el objeto que se guarde en ella debera ser de una clase que implemente
//  la interfaz Precio.
    private FactoryPrecio(){
//   Constructor privado para que la clase no sea instanciada sin argumentos.
    }

    public FactoryPrecio(String pais){
        if (pais.equalsIgnoreCase("españa")){
            precio = new PrecioEUR();
        }
        else {
            precio = new PrecioUSD();
        }
//      Dependiendo del string que se le pase como parametro al constructor, este creara un objeto
//      de la clase PrecioEUR o PrecioUSD.
    }
}
