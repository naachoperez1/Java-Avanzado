package PatronesCreacionales.Expendedora;

public class EstadoDineroIngresado extends Estado{
    public EstadoDineroIngresado(Expendedora expendedora) {
        super(expendedora);
    }

    @Override
    public String ingresarDinero() {
        return "Ya has ingresado el dinero, elige tu bebida: ";
    }

    @Override
    public String seleccionarBebida() {
        expendedora.cambiaEstado(new EstadoBebidaElegida(expendedora));
        return "Bebida seleccionada correctamente";
    }

    @Override
    public String entregarBebida() {
        return "No se puede entregar la bebida sin seleccionarla primero";
    }
}
