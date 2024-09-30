package Polimorfismo;

public class Bici implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("Bici Andando");
    }

    @Override
    public void frear() {
        System.out.println("Bici Freando");
    }
}
