package Animains;

public class Cachorro extends Animal{
// Atributos

   static int numeroDeCachorros;

    private int tamanhoDoRabo;

    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        super(nome, cor, altura, peso, estadoDeEspirito);
    }


// Construtor adicionados
//    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
//        this.nome = nome;
//        this.cor = cor;
//        this.altura = altura;
//        this.peso = peso;
//        this.tamanhoDoRabo = tamanhoDoRabo;
//        this.estadoDeEspirito = estadoDeEspirito;
//
//        numeroDeCachorros ++;
//    }

    // Metodos

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor(String marrom) {
        return cor;
    }

    public int getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

//    public String getEstadoDeEspirito() {
//        return estadoDeEspirito;
//    }



    public String pegar(){
        return "pegou a bolinha";
    }

    public String interagir(String acao) {

        switch (acao){
            case "carinho" : this.estadoDeEspirito = "feliz"; break;
            case "vai dormir" : this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha" : this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro"; break;
        }

//        if(acao.equals("carinho")){
//            this.estadoDeEspirito = "feliz";
//        } else if(acao.equals("vai dormir")){
//            this.estadoDeEspirito = "bravo";
//        }else {
//            this.estadoDeEspirito = "neutro";
//        }
        return estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Au Au");;
    }
}
