package Animains;

public class Cachorro {
// Atributos
   private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

// Construtor padrão
    public Cachorro(){}

// Construtor adicionados
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    // Metodos
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

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }



    private void comer(){}

    public void latir(){
        System.out.println("Au Au");
    }

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

}
