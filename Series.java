import java.util.List;

class Series extends Filme {
    private List<Integer> episodiosPorTemporada;
    private int totalDeTemporadas;

    public Series(String titulo, List<String> genero, String diretor, List<Pessoa> elenco, String dataDeLancamento,
                  int duracao, int totalDeTemporadas, List<Integer> episodiosPorTemporada) {
        super(titulo, genero, diretor, elenco, dataDeLancamento, duracao);
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.totalDeTemporadas = totalDeTemporadas;
    }

    public int gettotalDeTemporadas() {
        return totalDeTemporadas;
    }

    public List<Integer> getepisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
}