package PatronesCreacionales.Expendedora;

public abstract class Estado {
    public Expendedora expendedora;

    public Estado(Expendedora expendedora){
        this.expendedora = expendedora;
    }

    abstract public String ingresarDinero();
    abstract public String seleccionarBebida();
    public abstract  String entregarBebida();
}
