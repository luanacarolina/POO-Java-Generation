package patinete;

public class Patinete {

    private String marca;
    private String modelo;
    private String cor;
    private int quantidadeRodas;

    public Patinete (String marca,String modelo,String cor,int quantidadeRodas){
        this.marca=marca;
        this.modelo=modelo;
        this.cor=cor;
        this.quantidadeRodas=quantidadeRodas;
    }

    public void mostrarDados(){
        System.out.println("Dados Patinete********");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Cor: "+cor);
        System.out.println("Quantidade De Rodas: "+quantidadeRodas);
    }
}
