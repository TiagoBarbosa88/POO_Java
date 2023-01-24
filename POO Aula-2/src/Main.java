import Animains.Cachorro;

public class Main {
    public static void main(String[] args) {



        Cachorro cachorro1 = new Cachorro();

        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("Tito", "preto", 20, 7.3, 5,"nada");
        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro3 = new Cachorro("Rex", "preto", 20, 7.3, 5,"nada");


//        cachorro1.setNome("Rex");
//        cachorro1.setCor("marrom");
//        cachorro1.setPeso(7.5);
//        cachorro1.setAltura(25);
//        cachorro1.setTamanhoDoRabo(5);


//        System.out.println(cachorro2.toString());
//        System.out.println(cachorro3.toString());

        System.out.println("------------------------------");

//        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
//        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
//        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
//        System.out.println("O cachorro está " + cachorro1.interagir("nada"));

    }
}