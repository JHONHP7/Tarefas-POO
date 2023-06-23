import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TarefaHerancaPoo {
    private static Scanner scanner = new Scanner(System.in);
    private static CatalogoFilmesSeries CatalogoFilmesSeries = new CatalogoFilmesSeries();

    public static void main(String[] args) {
        int sairDoLoop = 0;

        while (sairDoLoop == 0) {
            System.out.println("############## TODOS AS SERIES E FILMES ##############");
            System.out.println("");
            System.out.println("1 -> Adicionar Filme");
            System.out.println("2 -> Adicionar Serie");
            System.out.println("3 -> Mostrar todas as Series");
            System.out.println("4 -> Mostrar todos os Filmes");
            System.out.println("5 -> Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    addFilme();
                    break;
                case 2:
                    addSeries();
                    break;
                case 3:
                    listSeries();
                    break;
                case 4:
                    listFilmes();
                    break;
                case 5:
                    sairDoLoop = 1;
                    break;
                default:
                    System.out.println("Não e' uma opcao valida. Tente outra. ");
                    break;
            }

            System.out.println();
        }
    }

    private static void addFilme() {
        System.out.println("############## Adicionar Filme ##############");

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("Generos (separe por virgula): ");
        String[] genreArray = scanner.nextLine().split(",");
        List<String> genero = new ArrayList<>();
        for (String genre : genreArray) {
            genero.add(genre.trim());
        }

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        List<Pessoa> elenco = getelenco();

        System.out.print("Data de lancamento: ");
        String dataDeLancamento = scanner.nextLine();

        System.out.print("Duracao (em minutos): ");
        int duracao = scanner.nextInt();
        scanner.nextLine();

        Filme Filme = new Filme(titulo, genero, diretor, elenco, dataDeLancamento, duracao);
        CatalogoFilmesSeries.addFilme(Filme);

        System.out.println("Filme adicionado!");
    }

    private static void addSeries() {
        System.out.println("############## Adicionar Serie ##############");

        System.out.print("Titulo: ");
        String titulo = scanner.nextLine();

        System.out.print("Generos (separe por virgula): ");
        String[] genreArray = scanner.nextLine().split(",");
        List<String> genero = new ArrayList<>();
        for (String genre : genreArray) {
            genero.add(genre.trim());
        }

        System.out.print("Diretor: ");
        String diretor = scanner.nextLine();

        List<Pessoa> elenco = getelenco();

        System.out.print("Data de lancamento: ");
        String dataDeLancamento = scanner.nextLine();

        System.out.print("Duracao de cada episodio (em minutos): ");
        int duracao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Total de temporadas: ");
        int totalDeTemporadas = scanner.nextInt();
        scanner.nextLine();

        List<Integer> episodiosPorTemporada = new ArrayList<>();
        for (int i = 1; i <= totalDeTemporadas; i++) {
            System.out.printf("Quantidade de episodios na temporada %d: ", i);
            int episodes = scanner.nextInt();
            episodiosPorTemporada.add(episodes);
            scanner.nextLine();
        }

        Series series = new Series(titulo, genero, diretor, elenco, dataDeLancamento, duracao, totalDeTemporadas,
                episodiosPorTemporada);
        CatalogoFilmesSeries.addSeries(series);

        System.out.println("Serie adicionada!");
    }

    private static void listSeries() {
        List<Series> series = CatalogoFilmesSeries.getSeries();
        System.out.println("############## TODAS AS SERIES ##############");
        for (Series s : series) {
            System.out.println("Titulo: " + s.gettitulo());
            System.out.println("Generos: " + String.join(", ", s.getgenero()));
            System.out.println("Diretor: " + s.getdiretor());
            System.out.println("Elenco Principal:");
            for (Pessoa Pessoa : s.getelenco()) {
                System.out.println("- Nome: " + Pessoa.getName());
                System.out.println("  Data de Nascimento: " + Pessoa.getdataNascimento());
                System.out.println("  Premios: " + String.join(", ", Pessoa.getpremios()));
            }
            System.out.println("Data de lancamento: " + s.getdataDeLancamento());
            System.out.println("Duracao de cada episodio: " + s.getduracao() + " minutos");
            System.out.println("Total de Temporadas: " + s.gettotalDeTemporadas());
            System.out.println("episodios por Temporada:");
            List<Integer> episodiosPorTemporada = s.getepisodiosPorTemporada();
            for (int i = 0; i < episodiosPorTemporada.size(); i++) {
                System.out.println("- Temporada " + (i + 1) + ": " + episodiosPorTemporada.get(i) + " episodios");
            }
            System.out.println();
        }
    }

    private static void listFilmes() {
        List<Filme> Filmes = CatalogoFilmesSeries.getFilmes();
        System.out.println("############## TODOS OS FILMES ##############");
        for (Filme Filme : Filmes) {
            System.out.println("Titulo: " + Filme.gettitulo());
            System.out.println("Generos: " + String.join(", ", Filme.getgenero()));
            System.out.println("Diretor: " + Filme.getdiretor());
            System.out.println("Elenco Principal:");
            for (Pessoa Pessoa : Filme.getelenco()) {
                System.out.println("- Nome: " + Pessoa.getName());
                System.out.println("  Data de Nascimento: " + Pessoa.getdataNascimento());
                System.out.println("  Premios: " + String.join(", ", Pessoa.getpremios()));
            }
            System.out.println("Data de lancamento: " + Filme.getdataDeLancamento());
            System.out.println("Duracao: " + Filme.getduracao() + " minutos");
            System.out.println();
        }
    }

    private static List<Pessoa> getelenco() {
        List<Pessoa> elenco = new ArrayList<>();

        boolean adicionarMais = true;
        while (adicionarMais) {
            System.out.print("Nome da atriz ou ator: ");
            String name = scanner.nextLine();

            System.out.print("Data de nascimento: ");
            String dataNascimento = scanner.nextLine();

            Pessoa Pessoa = new Pessoa(name, dataNascimento);

            boolean addpremios = true;
            while (addpremios) {
                System.out.print("Premio: ");
                String premio = scanner.nextLine();
                Pessoa.addPremios(premio);

                System.out.print("Deseja adicionar mais Premios? (digite S ou N): ");
                String escolha = scanner.nextLine();
                if (!escolha.equalsIgnoreCase("S")) {
                    addpremios = false;
                }
            }

            elenco.add(Pessoa);

            System.out.print("Deseja adicionar mais atores/atrizes? (digite S ou N): ");
            String escolha = scanner.nextLine();
            if (!escolha.equalsIgnoreCase("S")) {
                adicionarMais = false;
            }
        }

        return elenco;
    }
}
