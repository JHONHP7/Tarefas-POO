import java.util.ArrayList;
import java.util.List;

class CatalogoFilmesSeries {
    private List<Series> series;
    private List<Filme> Filmes;

    public CatalogoFilmesSeries() {
        this.series = new ArrayList<>();
        this.Filmes = new ArrayList<>();
    }

    public void addFilme(Filme Filme) {
        Filmes.add(Filme);
    }

    public void addSeries(Series series) {
        this.series.add(series);
    }

    public List<Filme> getFilmes() {
        return Filmes;
    }

    public List<Series> getSeries() {
        return series;
    }
}