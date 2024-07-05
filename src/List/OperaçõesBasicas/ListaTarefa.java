package List.OperaçõesBasicas;


import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));
    }


    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefalist) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefalist.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefalist);
    }
    public static void main(String[] arg){
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("o número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.adicionarTarefa( descricao: "Tarefa 1");
        listaTarefa.adicionarTarefa( descricao: "Tarefa 1");
        listaTarefa.adicionarTarefa( descricao: "Tarefa 1");

        System.out.println("o numero total tarefas é: "+ listaTarefa.obterNumeroTotalTarefas());


    }

}


