public class Main {
    public static void main(String[] args) {
        Cinema c1 = new Cinema();
        Sessoes s1 = new Sessoes();
        Filme f1 = new Filme();

        c1.setNome("CinUa");
        c1.setSessao(s1);

        f1.setNome("ultimato");
        f1.setCategoria(1);
        f1.setFaixaIdade(16);

        s1.getFilmes().add(f1);

        System.out.println(c1);

    }
}
