package Animains;

public class Passaro extends Animal {

        static int numeroDePassaros;

    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
    }

    @Override
    public void soar() {
        System.out.println("Piu Piu");
    }
}
