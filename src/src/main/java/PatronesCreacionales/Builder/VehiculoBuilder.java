package PatronesCreacionales.Builder;

public class VehiculoBuilder {
    Vehiculo vehiculo;

    public VehiculoBuilder (String marca){
        vehiculo = new Vehiculo();
        vehiculo.setMarca(marca);
    }

    public VehiculoBuilder setPuertas(int puertas){
        vehiculo.setNumeroPuertas(puertas);
        return this;
    }

    public VehiculoBuilder setTipo(String tipo){
        vehiculo.setTipo(tipo);
        return this;
    }

    public VehiculoBuilder setMotor(String motor){
        vehiculo.setMotor(motor);
        return this;
    }

    public Vehiculo build(){
        return vehiculo;
    }
}
