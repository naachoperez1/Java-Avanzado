package PatronesCreacionales.Prototipo;

public class Producto implements Prototipo{
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public Prototipo clonar() {
        try {
            return (Producto) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
