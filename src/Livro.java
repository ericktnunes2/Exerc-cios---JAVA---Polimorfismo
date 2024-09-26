public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes(){
        System.out.printf("""
                           Título do livro: %s
                           Autor do livro: %s
                           Preço: R$%.2f
                            """, titulo, autor, preco);
    }

}
