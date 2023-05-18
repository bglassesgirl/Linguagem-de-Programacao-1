package exercicio3;

public class CadastroProduto {

	public static void main(String[] args) {

		Produto produto = new Produto();
		produto.nome = "Livro: orgulho e preconceito";
		produto.descricao = "Melhor romance de época!";
		produto.id = 1;
		produto.codigoBarras = "39383";
		produto.valor = 49.90;

		Produto produto2 = new Produto();
		produto2.nome = "Passagem: Brazil > Paris";
		produto2.descricao = "Aproveitar a vida";
		produto2.id = 2;
		produto2.codigoBarras = "34383";
		produto2.valor = 2.494;

		Produto produto3 = new Produto();
		produto3.nome = "Notebook";
		produto3.descricao = "Para divar em tudo";
		produto3.id = 3;
		produto3.codigoBarras = "93823";
		produto3.valor = 5.000;

		System.out.println("----NOTA FISCAL----");
		System.out.println("----Produto 1: ");
		System.out.println("Nome: " + produto.nome + ",  " + "Valor:  " + produto.valor + ",  " + "Id:  " + produto.id
				+ ",  " + "  Descricao: " + produto.descricao + ",  " + "Código de Barras:  " + produto.codigoBarras);

		System.out.println("----Produto 2: ");
		System.out.println(
				"Nome: " + produto2.nome + ",  " + "Valor:  " + produto2.valor + ",  " + "Id:  " + produto2.id + ",  "
						+ "  Descricao: " + produto2.descricao + ",  " + "Código de Barras:  " + produto2.codigoBarras);

		System.out.println("----Produto 3: ");
		System.out.println(
				"Nome: " + produto3.nome + ",  " + "Valor:  " + produto3.valor + ",  " + "Id:  " + produto3.id + ",  "
						+ "  Descricao: " + produto3.descricao + ",  " + "Código de Barras:  " + produto3.codigoBarras);

	}

}
