package SOLID;

import java.util.Objects;

public class CocheElectrico extends Coche {
    int bateria;
    public CocheElectrico(String marca, String modelo, int velocidad, Motor motor) throws MotorIncorrectoException {
        super(marca, modelo, velocidad, motor);
        if (!Objects.equals(motor.tipo, "electrico")){
            throw new MotorIncorrectoException(motor);
        }
    }

    public void CargarBateria (int bateria){
        if (this.bateria + bateria > 100){
            this.bateria = 100;
        }else {
            this.bateria += bateria;
        }
    }
}
