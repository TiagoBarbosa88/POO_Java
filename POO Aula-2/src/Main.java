import Animains.Cachorro;
import Animains.Gato;
import Animains.Passaro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Tito","Branco", 10, 7.5, "nada");

        Gato gato1 = new Gato("Felix", "preto", 25,3.5, "nada" );

        Passaro passaro1 = new Passaro("Frajola", "marrom", 30, 2.5, "nada");

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();




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