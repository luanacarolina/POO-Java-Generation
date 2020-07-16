package POO3.loja;



import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new TreeMap<>();
        Scanner scan = new Scanner(System.in);
        String nome;
        int opcoes =0,id;

       while (opcoes!=5){
           mapa.put(1,"Arroz");
           mapa.put(2,"Feijão");
           mapa.put(3,"Macarrão");
           System.out.println("Digite de acordo com as opções: ");
           System.out.println("1-Adicionar ");
           System.out.println("2-Remover ");
           System.out.println("3-Atualizar ");
           System.out.println("4-Apresentar Todos os Dados da List");
           System.out.println("5-Sair");
            opcoes = scan.nextInt();

           if(opcoes==1){
               System.out.println("Digite um Id para o produto");
               id = scan.nextInt();
               System.out.println("Digite o nome do produto");
               nome = scan.next();

               if(mapa.containsKey(id) || mapa.containsValue(nome)){
                   System.out.println("O produto já existe");
               }else {
                   System.out.println("Produto Adicionado");
                   mapa.put(id,nome);
               }


           }if(opcoes==2){
               System.out.println("Digite o nome do produto a ser removido");
               nome = scan.next();
               System.out.println("Digite o ID do produto a ser removido");
               id = scan.nextInt();
               if(mapa.containsKey(id) && mapa.containsValue(nome)){
                   mapa.remove(id,nome);
               }else{
                   System.out.println("O produto não existe");
               }
           }if(opcoes==3){
               System.out.println("Digite o Id do produto");
               id = scan.nextInt();
               if(mapa.containsKey(id)){
               System.out.println("Digite o novo Nome do produto");
               String nomeNovo = scan.next();

                   mapa.replace(id,nomeNovo);
               }else{
                   System.out.println("O Id não está vinculado a nenhum produto");
               }
           }if(opcoes==4){
               System.out.println(mapa);
           }


       }



    }
}
