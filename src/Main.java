import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> listaDeLivros = new ArrayList<>();

        Livro livro1 = new Livro("Apocalipse Z: O Princípio Do Fim", "Loureiro", 25.75);
        Livro livro2 = new Livro("O Retiro", "Pearse", 76.40);
        Livro livro3 = new Livro("O Homem Mais Feliz Da História", "Augusto Cury", 41.56);

        Ebook ebook1 = new Ebook("As Coisas Como Elas São", "Laurie Frankel", 39.77, 4);
        Ebook ebook2 = new Ebook("A Mão Misteriosa", "Agatha Cristie", 19.84, 4);


        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);
        listaDeLivros.add(livro3);
        listaDeLivros.add(ebook1);
        listaDeLivros.add(ebook2);

        for (Livro item : listaDeLivros){
            item.exibirDetalhes();
            System.out.println("-".repeat(25));
        }

    }
}
