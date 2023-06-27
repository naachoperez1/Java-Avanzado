package PatronesCreacionales.Singleton;

//import PatronesCreacionales.SingletonClass.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.contador = 10;
        System.out.println("valor: " + singleton.contador + ". Ubicacion: " + singleton );

        Singleton singleton1 = Singleton.getInstance();
        singleton1.contador = 25;
        System.out.println("valor: " + singleton1.contador + ". Ubicacion: " + singleton1 );
    }
}
