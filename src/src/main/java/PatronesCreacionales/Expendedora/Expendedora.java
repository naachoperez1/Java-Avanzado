package PatronesCreacionales.Expendedora;

public class Expendedora {
    public Estado estado;

    public Expendedora(){
        this.estado = new EstadoDineroNoIngresado(this);
    }

    public void cambiaEstado (Estado estado){
        System.out.println("Estado inicial: " + this.estado.getClass().getName());
        this.estado = estado;
        System.out.println("Estado final: " + this.estado.getClass().getName());
    }

    public Estado getEstado(){
        return estado;
    }
}
