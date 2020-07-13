package cliente;

public class Cliente {
    private String nome;
    private String documento;
    private String endereço;

    public Cliente(String nome ,String documento,String endereço){
        this.nome=nome;
        this.documento=documento;
        this.endereço = endereço;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public boolean possuiDebito(boolean debito){
        if(debito==true){
            System.out.println("Cliente Possui debito");
        }else{
            System.out.println("Cliente não possui debito");
        }
        return debito;
    }

    public void mostrarDados(){

        System.out.println("Sistema Cliente******");
        System.out.println("Nome: "+nome);
        System.out.println("Documento: "+documento);
        System.out.println("Endereço: "+ endereço);

    }
}
