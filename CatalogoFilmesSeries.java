import java.util.ArrayList;
import java.util.List;

class CatalogoFilmesSeries {
    private List<Filme> Filmes;
    private List<Series> series;

    public CatalogoFilmesSeries() {
        this.Filmes = new ArrayList<>();
        this.series = new ArrayList<>();
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