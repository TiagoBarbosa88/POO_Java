package Animains;

public class Gato extends  Animal {
    static int numeroDeGatos;

    public Gato(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
    }

    @Override
    public void soar() {
        System.out.println("Miau Miau");
    }
}
