import Animains.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Titos";
        cachorro1.cor = "Caramelo";
        cachorro1.altura = 25;
        cachorro1.peso = 7.5;
        cachorro1.tamanhoDoRabo = 5;

        System.out.println(cachorro1);
    }
}