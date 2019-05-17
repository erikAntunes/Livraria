import java.util.ArrayList;
import java.util.List;

public class Catalogo extends Livro {

    public List<Livro> estoque;

    public Catalogo(){
        estoque = new ArrayList<>();
        Livro l1 = new Livro();
        l1.setTitulo("A Batalha do Apocalipse");
        l1.setAnoLancamento(2007);
        l1.setAutor("Eduardo Spohr");
        l1.setCodigo("0001");
        l1.setCodigoISBN("9788576860761");
        l1.setPreco(29.90F);
        l1.setQuantidadeEmEstoque(10);
        estoque.add(l1);

        Livro l2 = new Livro();
        l1.setTitulo("Filhos do Éden: Herdeiros de Atlântida");
        l1.setAnoLancamento(2011);
        l1.setAutor("Eduardo Spohr");
        l1.setCodigo("0002");
        l1.setCodigoISBN("9788576862079");
        l1.setPreco(74.90F);
        l1.setQuantidadeEmEstoque(10);
        estoque.add(l2);

        Livro l3 = new Livro();
        l1.setTitulo("Filhos do Éden: Anjos da Morte");
        l1.setAnoLancamento(2013);
        l1.setAutor("Eduardo Spohr");
        l1.setCodigo("0003");
        l1.setCodigoISBN("9788576862451");
        l1.setPreco(27.40F);
        l1.setQuantidadeEmEstoque(10);
        estoque.add(l3);

        Livro l4 = new Livro();
        l1.setTitulo("Filhos do Éden: Paraíso Perdido");
        l1.setAnoLancamento(2015);
        l1.setAutor("Eduardo Spohr");
        l1.setCodigo("0004");
        l1.setCodigoISBN("9788576864752");
        l1.setPreco(28.40F);
        l1.setQuantidadeEmEstoque(10);
        estoque.add(l4);
    }

    public void cadastrarLivro(Livro l){}

    public void consultarLivroPorCodigo(String codigo){}

    public void efetuarVendaPorCodigo (String codigo){}




}

