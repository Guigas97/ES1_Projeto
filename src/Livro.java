public class Livro
{
    private String Editora;
    private  String Titulo;

    public Livro(String titulo, String editora) {
        Titulo = titulo;
        Editora = editora;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }
}