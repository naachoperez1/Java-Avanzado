package SOLID;

public class Main {
    public static void main(String[] args) throws MotorIncorrectoException {
        Motor motorElectrico = new Motor("electrico", "Honda");
        Motor motorCombustion = new Motor("combustion", "Ferrari");
        CocheCombustion cocheC = new CocheCombustion("Mercedes", "A2023", 100, motorCombustion);

        cocheC.CargarGasolina(50);
    }


}
