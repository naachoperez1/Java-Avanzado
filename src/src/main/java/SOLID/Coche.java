package SOLID;

public class Coche {
    String marca;
    String modelo;
    int velocidad;
    Motor motor;

    public Coche(String marca, String modelo, int velocidad, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.motor = motor;
    }

    public void Acelerar(int kms){
        this.velocidad += kms;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
