package PatronesCreacionales.Singleton;

public class Singleton {
    int contador;
    private static Singleton singleton;


    private Singleton(){}


    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
