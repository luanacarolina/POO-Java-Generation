package POO2;

public abstract class Pessoa  {

    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa(){

    }
    public Pessoa(String nome,String endereco,String telefone){
        this.nome=nome;
        this.endereco=endereco;
        this.telefone=telefone;
    }
    public Pessoa(String nome,String endereco){
        this.nome=nome;
        this.endereco=endereco;
         this.telefone="não informado";
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void mostrarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Endereço: "+endereco);
        System.out.println("Telefone: "+telefone);
    }

}
