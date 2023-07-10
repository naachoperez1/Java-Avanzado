package PatronesCreacionales;

public class SingletonClass {
    int contador;
    private static SingletonClass singleton;
//      Se define una variable estatica del mismo tipo que la clase
//      para que pueda ser utilizada sin necesidad de instanciar un objeto .


    private SingletonClass() {
//      Constructor privado para que no pueda ser llamado desde afuera de la clase.
    }


    public static SingletonClass getInstance() {
        if (singleton == null) {
            singleton = new SingletonClass();
        }
        return singleton;
//      Si la variable singleton no ha sido inicializada (no se ha creado ningun objeto de la clase),
//      se crea un objeto llamando al constructor privado. Si la variable ya ha sido instanciada, retorna la variable

    }
}
