import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void concluirTarefa(int id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                t.marcarComoConcluida();
                System.out.println("Tarefa concluída!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    public void removerTarefa(int id) {
        boolean removida = tarefas.removeIf(t -> t.getId() == id);
        if (removida) {
            System.out.println("Tarefa removida com sucesso.");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            System.out.println("\n--- Lista de Tarefas ---");
            for (Tarefa t : tarefas) {
                System.out.println(t);
            }
        }
    }
}
