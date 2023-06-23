import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String name;
    private List<String> premios;
    private String dataNascimento;

    public Pessoa(String name, String dataNascimento) {
        this.name = name;
        this.premios = new ArrayList<>();
        this.dataNascimento = dataNascimento;
    }

    public String getName() {
        return name;
    }

    public String getdataNascimento() {
        return dataNascimento;
    }

    public List<String> getpremios() {
        return premios;
    }

    public void addPremios(String premio) {
        premios.add(premio);
    }
}