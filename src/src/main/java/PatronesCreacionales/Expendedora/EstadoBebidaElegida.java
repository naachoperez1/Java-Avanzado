package PatronesCreacionales.Expendedora;

public class EstadoBebidaElegida extends Estado {
    public EstadoBebidaElegida(Expendedora expendedora) {
        super(expendedora);
    }

    @Override
    public String ingresarDinero() {
        return "Ya has ingresado el dinero";
    }

    @Override
    public String seleccionarBebida() {
        return "Ya has seleccionado la bebida";
    }

    @Override
    public String entregarBebida() {
        expendedora.cambiaEstado(new EstadoDineroNoIngresado(expendedora));
        return "Bebida entregada correctamente";
    }
}
