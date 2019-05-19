import javax.swing.text.LabelView;
import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Livro> estoque;

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
        l2.setTitulo("Filhos do Éden: Herdeiros de Atlântida");
        l2.setAnoLancamento(2011);
        l2.setAutor("Eduardo Spohr");
        l2.setCodigo("0002");
        l2.setCodigoISBN("9788576862079");
        l2.setPreco(74.90F);
        l2.setQuantidadeEmEstoque(10);
        estoque.add(l2);

        Livro l3 = new Livro();
        l3.setTitulo("Filhos do Éden: Anjos da Morte");
        l3.setAnoLancamento(2013);
        l3.setAutor("Eduardo Spohr");
        l3.setCodigo("0003");
        l3.setCodigoISBN("9788576862451");
        l3.setPreco(27.40F);
        l3.setQuantidadeEmEstoque(10);
        estoque.add(l3);

        Livro l4 = new Livro();
        l4.setTitulo("Filhos do Éden: Paraíso Perdido");
        l4.setAnoLancamento(2015);
        l4.setAutor("Eduardo Spohr");
        l4.setCodigo("0004");
        l4.setCodigoISBN("9788576864752");
        l4.setPreco(28.40F);
        l4.setQuantidadeEmEstoque(10);
        estoque.add(l4);
    }

    public void cadastrarLivro(Livro novoLivro){
        estoque.add(novoLivro);
    }

    public Livro consultarLivroPorCodigo(String codigo){

        // percorra todos os elementos da lista estoque
        for (Livro livro : estoque) {

            // se o codigo passado for igual ao codigo do livro
            if (codigo.equals(livro.getCodigo())) {
                return livro; // retorna o Livro
            }
        }
        return null;
    }

    public void efetuarVendaPorCodigo (String codigo){
        for (Livro livro :estoque){
            if (codigo.equals(livro.getCodigo())){
                livro.setQuantidadeEmEstoque(livro.getQuantidadeEmEstoque()-1);
                System.out.println(livro.getTitulo()+" Vendido com Sucesso, "+"Quantidade total em estoque: "+livro.getQuantidadeEmEstoque());
            }
        }

        }
    }


