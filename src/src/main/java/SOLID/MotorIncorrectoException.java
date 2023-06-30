package SOLID;

public class MotorIncorrectoException extends Exception{
    public MotorIncorrectoException(Motor motor){
        System.out.println("El motor es de tipo " + motor.tipo + ". Por favor, cambie el tipo de motor." );
    }
}
