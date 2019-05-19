public class Main {

    public static void main(String[] args) {


        Catalogo catalogoDeLivros = new Catalogo();

        // se o livro foi encontrado?
        //Livro livro = catalogoDeLivros.consultarLivroPorCodigo("0001");
        //if (livro != null) {
          //  System.out.println(livro.getTitulo());
        //} else {
     //       System.out.println("Livro não encontrado!");

        catalogoDeLivros.efetuarVendaPorCodigo("0004");
        }
    }