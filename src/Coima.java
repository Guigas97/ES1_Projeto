public class Coima
{
    private String descricao;
    float valor;
    Devolucao devolucao;

    public Coima(String descricao, float valor, Devolucao devolucao) {
        this.descricao = descricao;
        this.devolucao = devolucao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Devolucao getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Devolucao devolucao) {
        this.devolucao = devolucao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}


