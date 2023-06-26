package PatronesCreacionales.Factory;

public class FactoryPrecio {
    Precio precio;
    private FactoryPrecio(){}

    public FactoryPrecio(String pais){
        if (pais.equalsIgnoreCase("españa")){
            precio = new PrecioEUR();
        }
        else {
            precio = new PrecioUSD();
        }
    }
}
