package Polimorfismo;

public class Carro implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("Carro Andando");
    }

    @Override
    public void frear() {
        System.out.println("Carro Freando");
    }
}
