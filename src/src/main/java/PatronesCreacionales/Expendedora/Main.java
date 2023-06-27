package PatronesCreacionales.Expendedora;

public class Main {
    public static void main(String[] args) {
        Expendedora expendedora = new Expendedora();

        System.out.println(expendedora.estado);

        System.out.println(expendedora.estado.ingresarDinero());
        System.out.println(expendedora.estado);

        System.out.println(expendedora.estado.seleccionarBebida());
        System.out.println(expendedora.estado);

        System.out.println(expendedora.estado.entregarBebida());
        System.out.println(expendedora.estado);
    }
}
