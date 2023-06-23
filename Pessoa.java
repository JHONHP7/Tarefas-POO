import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String name;
    private String dataNascimento;
    private List<String> premios;

    public Pessoa(String name, String dataNascimento) {
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.premios = new ArrayList<>();
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