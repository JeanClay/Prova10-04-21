import java.util.ArrayList;
import java.util.List;

public class Sessoes {
    private List<Filme> filmes= new ArrayList();

    public Sessoes() {
    }

    public Sessoes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    @Override
    public String toString() {
        return "Sessoes{" +
                "filmes=" + filmes +
                '}';
    }
}
