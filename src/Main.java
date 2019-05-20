public class Main {

    public static void main(String[] args) {

        Livro l5 = new Livro();
        l5.setTitulo("A Torre das Almas");
        l5.setAutor("Eduardo Spohr");
        l5.setAnoLancamento(2012);
        l5.setCodigo("0005");
        l5.setQuantidadeEmEstoque(10);
        l5.setCodigoISBN("9788562942686");
        l5.setPreco(49.90F);

        Catalogo catalogoDeLivros = new Catalogo();

        catalogoDeLivros.cadastrarLivro(l5);

        System.out.println("Temos os seguintes livros disponiveis: ");

        System.out.println("******************************************");

        System.out.println("1- "+catalogoDeLivros.consultarLivroPorCodigo("0001").getTitulo());

        System.out.println("2- "+catalogoDeLivros.consultarLivroPorCodigo("0002").getTitulo());

        System.out.println("3- "+catalogoDeLivros.consultarLivroPorCodigo("0003").getTitulo());

        System.out.println("4- "+catalogoDeLivros.consultarLivroPorCodigo("0004").getTitulo());

        System.out.println("5- "+catalogoDeLivros.consultarLivroPorCodigo("0005").getTitulo());

        System.out.println("*******************************************************************************************");

        catalogoDeLivros.efetuarVendaPorCodigo("0001");
        System.out.println(" ");
        System.out.println("*******************************************************************************************");
        catalogoDeLivros.efetuarVendaPorCodigo("0003");
        System.out.println(" ");
        System.out.println("*******************************************************************************************");
        catalogoDeLivros.efetuarVendaPorCodigo("0002");
        System.out.println(" ");
        System.out.println("*******************************************************************************************");
        catalogoDeLivros.efetuarVendaPorCodigo("0004");
        System.out.println(" ");
        System.out.println("*******************************************************************************************");
        catalogoDeLivros.efetuarVendaPorCodigo("0005");
        System.out.println(" ");
        System.out.println("*******************************************************************************************");
        catalogoDeLivros.efetuarVendaPorCodigo("0003");
        System.out.println(" ");
        System.out.println("*******************************************************************************************");
        catalogoDeLivros.efetuarVendaPorCodigo("0003");
        System.out.println(" ");
        System.out.println("*******************************************************************************************");
    }
}