package Pessoa;

public class Pessoa implements Atividades {

    @Override
    public void acordar() {
        System.out.println("Acordando...");
    }

    @Override
    public void comer() {
        System.out.println("Comendo...");
    }

    @Override
    public void dormir() {
        System.out.println("Dormindo...");
    }
}