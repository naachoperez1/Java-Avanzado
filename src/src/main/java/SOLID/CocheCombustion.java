package SOLID;

import java.util.Objects;

public class CocheCombustion extends Coche{
    int gasolinaLitros;
    public CocheCombustion(String marca, String modelo, int velocidad, Motor motor) throws MotorIncorrectoException {
        super(marca, modelo, velocidad, motor);
        if (!Objects.equals(motor.tipo, "combustion")){
            throw new MotorIncorrectoException(motor);
        }

    }

    public void CargarGasolina(int lts){
        this.gasolinaLitros += lts;
    }
}
