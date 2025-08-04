import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Concluir Tarefa");
            System.out.println("3. Remover Tarefa");
            System.out.println("4. Listar Tarefas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                scanner.next();
            }
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;
                case 2:
                    System.out.print("Digite o ID da tarefa para concluir: ");
                    int idConcluir = scanner.nextInt();
                    gerenciador.concluirTarefa(idConcluir);
                    break;
                case 3:
                    System.out.print("Digite o ID da tarefa para remover: ");
                    int idRemover = scanner.nextInt();
                    gerenciador.removerTarefa(idRemover);
                    break;
                case 4:
                    gerenciador.listarTarefas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
