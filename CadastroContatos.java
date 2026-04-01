import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        int op;
        do{
            System.out.println("\nEsconlha a opção: ");
            System.out.println("1- Cadastrar contatos: ");
            System.out.println("2- Listar contatos: ");
            System.out.println("3- Excluir contatos: ");
            System.out.println("4- Alterar contatos: ");
            System.out.println("5- Pesquisar contatos: ");
            System.out.println("0- Sair: ");
            System.out.println("Opção: ");
            op=sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Informe o número: ");
                    String numero = sc.nextLine();

                    contatos.add(new Contato(nome, numero));
                    System.out.println("Cadastro realizado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n Os nomes cadastrados são: ");
                    for(int i=0;i<contatos.size();i++){
                        System.out.println((i+1)+" - "+contatos.get(i));
                    }
                    break;

                case 3:
                    System.out.println("Informe o número para excluir: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if(index < 0 && index<=contatos.size()){
                        contatos.remove((index -1));
                        System.out.println("Contato excluido com sucesso");
                    }else{
                        System.out.println("Contato inválido!");
                    }
                
                case 4:
                    System.out.println("Informe o número para alterar: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if(pos>0 && pos<=contatos.size()){
                        System.out.println("Digite o novo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.println("Digite o novo número: ");
                        String novoNumero = sc.nextLine();

                        contatos.get(pos -1).setNome(novoNome);
                        contatos.get(pos =1).setNumero(novoNumero);
                        System.out.println("Contato alterado com sucesso!");
                    }else{
                        System.out.println("Contato inválido!");
                    }

                    case 5:
                        System.out.println("Informe o nome para pesquisar contato: ");
                        String busca = sc.nextLine();

                        boolean encontrado = false;

                        for(int i=0;i<contatos.size();i++){
                            if(contatos.get(i).getNome().equalsIgnoreCase(busca)){
                                System.out.println("Encontrado: "+contatos.get(i));

                                encontrado = true;
                            }
                        }

                        if(!encontrado){
                            System.out.println("Contato não encontrado!");
                        }
                            break;

                    case 0:
                        System.out.println("Encerrando...");
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }while(op!=6);

        sc.close();
    }
}