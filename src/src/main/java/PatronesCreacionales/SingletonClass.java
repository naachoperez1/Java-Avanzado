package PatronesCreacionales;

public class SingletonClass {
    int contador;
    private static SingletonClass singleton;


    private SingletonClass() {
    }


    public static SingletonClass getInstance() {
        if (singleton == null) {
            singleton = new SingletonClass();
        }
        return singleton;
    }
}
