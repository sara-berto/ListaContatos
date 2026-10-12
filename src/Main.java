import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        String telefone;

        ArrayList<String> contatos = new ArrayList<>();

        Scanner selecionarOpcao = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3) {
        System.out.println("====Lista de Contatos====");
        System.out.println("1- Adicionar contato");
        System.out.println("2- Mostrar contatos");
        System.out.println("3- Sair");
        System.out.println("Selecione uma opção: ");

        opcao = selecionarOpcao.nextInt();

        if (opcao == 1) {
            System.out.println("Digite o nome do contato: ");
            selecionarOpcao.nextLine();
            nome = selecionarOpcao.nextLine();

            System.out.println("Digite o telefone do contato: ");
            telefone = selecionarOpcao.nextLine();

            contatos.add(nome +" - "+ telefone);

            System.out.println("Contato adicionado com sucesso!");
        } else if (opcao == 2) {
            System.out.println("Contatos salvos:");
            for (String contato : contatos) {
                System.out.println(contato);
            }

        } else if (opcao == 3) {
            System.out.println("Programa finalizando...");
        }
        }
    }
}
