import java.util.List;

class Series extends Filme {
    private int totalDeTemporadas;
    private List<Integer> episodiosPorTemporada;

    public Series(String titulo, List<String> genero, String diretor, List<Pessoa> elenco, String dataDeLancamento,
                  int duracao, int totalDeTemporadas, List<Integer> episodiosPorTemporada) {
        super(titulo, genero, diretor, elenco, dataDeLancamento, duracao);
        this.totalDeTemporadas = totalDeTemporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int gettotalDeTemporadas() {
        return totalDeTemporadas;
    }

    public List<Integer> getepisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
}