import java.util.ArrayList;

public class Repositorio {
    ArrayList<Coima> arrayCoima = new ArrayList<>();

    ArrayList<Copia> arrayCopia = new ArrayList<>();

    ArrayList<Devolucao> arrayDevolucao = new ArrayList<>();

    ArrayList<Emprestimo> arrayEmprestimo = new ArrayList<>();

    ArrayList<Livro> arrayLivro = new ArrayList<>();

    ArrayList<Notificacao> arrayNotificacao = new ArrayList<>();

    ArrayList<Requisicao> arrayRequisicao = new ArrayList<>();

    ArrayList<TipoUtilizador> arrayTipo = new ArrayList<>();

    ArrayList<Utilizador> arrayUtilizador = new ArrayList<>();

    public Repositorio() {
    }

    void adicionaCoima(Coima coima){
        arrayCoima.add(coima);
    }

    void adicionaCopia(Copia copia){
        arrayCopia.add(copia);
    }

    void adicionaDevolucao(Devolucao devolucao){
        arrayDevolucao.add(devolucao);
    }

    void adicionaEmprestimo(Emprestimo emprestimo){
        arrayEmprestimo.add(emprestimo);
    }

    void adicionaLivro(Livro livro){
        arrayLivro.add(livro);
    }

    void adicionaNotificacao(Notificacao notificacao){
        arrayNotificacao.add(notificacao);
    }

    void adicionaRequisicao(Requisicao requisicao){
        arrayRequisicao.add(requisicao);
    }

    void adicionaTipoUtilizador(TipoUtilizador tipo){
        arrayTipo.add(tipo);
    }

    void adicionaUtilizador(Utilizador utilizador){
        arrayUtilizador.add(utilizador);
    }

    public Emprestimo devolveEmprestimoDaRequisicao(Requisicao r){
        for(Emprestimo e: arrayEmprestimo){
            if(e.getRequisicao().equals(r)){
                return e;
            }
        }
        return null;
    }
}
