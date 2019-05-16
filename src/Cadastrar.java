import java.util.ArrayList;
import java.util.List;

public class Cadastrar extends Livros {

    List<Livros> livrosCadastrados = new ArrayList<>();

    public void CadastrarNovo(Livros livro){
        livrosCadastrados.add(livro);
    }
}
