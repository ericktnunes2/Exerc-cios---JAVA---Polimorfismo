public class Ebook extends Livro{

    private double tamanhoArquivos;
    public Ebook(String titulo, String autor, double preco, double tamanhoArquivos) {
        super(titulo, autor, preco);
        this.tamanhoArquivos = tamanhoArquivos;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tamanho do arquivo: " + tamanhoArquivos);
    }

}
