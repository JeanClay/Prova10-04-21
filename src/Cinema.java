public class Cinema {
    private String nome;
    private Sessoes sessao;

    public Cinema() {

    }

    public Cinema(String nome, Sessoes sessao) {
        this.nome = nome;
        this.sessao = sessao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sessoes getSessao() {
        return sessao;
    }

    public void setSessao(Sessoes sessao) {
        this.sessao = sessao;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "nome='" + nome + '\'' +
                ", sessao=" + sessao +
                '}';
    }
}
