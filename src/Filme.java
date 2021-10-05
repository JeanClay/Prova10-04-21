import java.time.Instant;

public class Filme {
    private String nome;
    private int categoria;
    private Instant duracao;
    private int faixaIdade;

    public Filme() {
    }

    public Filme(String nome, int categoria, Instant duracao, int faixaIdade) {
        this.nome = nome;
        this.categoria = categoria;
        this.duracao = duracao;
        this.faixaIdade = faixaIdade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public Instant getDuracao() {
        return duracao;
    }

    public void setDuracao(Instant duracao) {
        this.duracao = duracao;
    }

    public int getFaixaIdade() {
        return faixaIdade;
    }

    public void setFaixaIdade(int faixaIdade) {
        this.faixaIdade = faixaIdade;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", categoria=" + categoria +
                ", duracao=" + duracao +
                ", faixaIdade=" + faixaIdade +
                '}';
    }
}

