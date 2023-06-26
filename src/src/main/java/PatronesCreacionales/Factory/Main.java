package PatronesCreacionales.Factory;

public class Main {
    public static void main(String[] args) {
        FactoryPrecio euro = new FactoryPrecio("españa");
        System.out.println(euro.precio.getPrecio());

        FactoryPrecio dolar = new FactoryPrecio("usa");
        System.out.println(dolar.precio.getPrecio());
    }
}
