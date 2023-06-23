import java.util.List;

class Filme {
    private String titulo;
    private List<String> genero;
    private String diretor;
    private List<Pessoa> elenco;
    private String dataDeLancamento;
    private int duracao;

    public Filme(String titulo, List<String> genero, String diretor, List<Pessoa> elenco, String dataDeLancamento, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.elenco = elenco;
        this.dataDeLancamento = dataDeLancamento;
        this.duracao = duracao;
    }

    public String gettitulo() {
        return titulo;
    }

    public List<String> getgenero() {
        return genero;
    }

    public String getdiretor() {
        return diretor;
    }

    public List<Pessoa> getelenco() {
        return elenco;
    }

    public String getdataDeLancamento() {
        return dataDeLancamento;
    }

    public int getduracao() {
        return duracao;
    }
}