package produtoEletronico;

public class ProdutoEletronico {
    private String nome;
    private String marca;
    private int preco;
    private String descricao;

    public ProdutoEletronico(String nome,String marca,int preco,String descricao){
        this.nome=nome;
        this.marca=marca;
        this.preco=preco;
        this.descricao=descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }
    public void mostrarProduto(){
        System.out.println("Sistema Produto Eletronico ********");
        System.out.println("Nome: "+nome);
        System.out.println("Marca: "+marca);
        System.out.println("Preço: "+preco);
        System.out.println("Descrição: "+descricao);

    }
}
