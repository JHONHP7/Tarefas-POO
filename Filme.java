import java.util.List;

class Filme {
    private String titulo;
    private String diretor;
    private List<Pessoa> elenco;
    private List<String> genero;
    private int duracao;
    private String dataDeLancamento;

    public Filme(String titulo, List<String> genero, String diretor, List<Pessoa> elenco, String dataDeLancamento, int duracao) {
        this.titulo = titulo;
        this.elenco = elenco;
        this.genero = genero;
        this.diretor = diretor;
        this.duracao = duracao;
        this.dataDeLancamento = dataDeLancamento;
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