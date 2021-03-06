import java.time.LocalDate;
import java.util.Date;

public class Notificacao {
    java.time.LocalDate data;
    Emprestimo emprestimo;

    public Notificacao(LocalDate data, Emprestimo emprestimo) {
        this.data = data;
        this.emprestimo = emprestimo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
}
