package PatronesCreacionales.Expendedora;

public class EstadoDineroNoIngresado extends Estado{
    public EstadoDineroNoIngresado(Expendedora expendedora) {
        super(expendedora);
    }


    @Override
    public String ingresarDinero() {
        expendedora.cambiaEstado(new EstadoDineroIngresado(expendedora));
        return "ingresarDinero(): Dinero Ingresado";
    }

    @Override
    public String seleccionarBebida() {
        return "No se puede seleccionar bebida sin ingresar dinero primero";
    }

    @Override
    public String entregarBebida() {
        return "No se puede entregar bebida sin ingresar dinero primero";
    }
}
