package paciente;

public class Paciente {
    private String nome;
    private String documento;
    private String endereco;
    private String telefone;
    private String dataNascimento;
    private boolean retorno;

    public Paciente(String nome,String documento,String endereco,String telefone,String dataNascimento,boolean retorno){
        this.nome=nome;
        this.documento=documento;
        this.endereco=endereco;
        this.telefone=telefone;
        this.dataNascimento=dataNascimento;
        this.retorno=retorno;
    }
    
}
