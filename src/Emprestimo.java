import java.time.LocalDate;

public class Emprestimo {
    java.time.LocalDate data;
    Requisicao requisicao;

    public Emprestimo(LocalDate data, Requisicao requisicao) {
        this.data = data;
        this.requisicao = requisicao;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Requisicao getRequisicao() {
        return this.requisicao;
    }

    public void setRequisicao(Requisicao requisicao) {
        this.requisicao = requisicao;
    }
}
