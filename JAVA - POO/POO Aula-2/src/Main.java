import Animains.Animal;
import Animains.Cachorro;
import Animains.Gato;
import Animains.Passaro;
import Lojas.PetShop;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Tito","Branco", 10, 7.5, "nada");
        Gato gato1 = new Gato("Felix", "preto", 25,3.5, "nada" );
        Passaro passaro1 = new Passaro("Frajola", "marrom", 30, 2.5, "nada");

        System.out.println("------------------------------");

       PetShop petShop = new PetShop();

        petShop.tosar(cachorro1);
        System.out.println(cachorro1.getNome() +" está "  + cachorro1.getEstadoDeEspirito());

        petShop.darBanho(cachorro1);
        System.out.println(cachorro1.getNome() +" está "  + cachorro1.getEstadoDeEspirito());

        petShop.darBanho(gato1);
        System.out.println(gato1.getNome() +" está "  +  gato1.getEstadoDeEspirito());

       petShop.deixarNoHotel(passaro1);
        System.out.println(passaro1.getNome() + " está " + passaro1.getEstadoDeEspirito());

        gato1.soar();

//        cachorro1.setNome("Rex");
//        cachorro1.setCor("marrom");
//        cachorro1.setPeso(7.5);
//        cachorro1.setAltura(25);
//        cachorro1.setTamanhoDoRabo(5);

//        System.out.println(cachorro2.toString());
//        System.out.println(cachorro3.toString());

//        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
//        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
//        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
//        System.out.println("O cachorro está " + cachorro1.interagir("nada"));

        // Casting transforma uma variavel
        double d = 5.5d;
        float f = 3.0f;

        float x = f + (float)d;
        System.out.println(x);

        // underline ajuda
        int a = 23_132_157;
        System.out.println(a);
    }
}