package revisao;

public class CadastroFuncionario {

	public static void main(String[] args) {
		
	
		Funcionario fu1 = new Funcionario();
		fu1.id = 1;
		fu1.nome = "Maria";
		fu1.salario = 1500;
		fu1.usuario = new Usuario();
		fu1.usuario.id = 1;
		fu1.usuario.login = "maria.ifba";
		fu1.usuario.senha = "ifba123";
		fu1.endereco = new Endereco();
		fu1.endereco.id = 1;
		fu1.endereco.rua = "Rua SJ";
		fu1.endereco.numero = "12";
		fu1.endereco.cidade = "Paulo Afonso";
		fu1.endereco.estado = "Bahia";
		

		Funcionario fu2 = new Funcionario();
		fu2.id = 2;
		fu2.nome = "José";
		fu2.salario = 2500;
		fu2.usuario = new Usuario();
		fu2.usuario.id = 2;
		fu2.usuario.login = "jose.ifba";
		fu2.usuario.senha = "ifba123";
		fu2.endereco = new Endereco();
		fu2.endereco.id = 2;
		fu2.endereco.rua = "Rua MJ";
		fu2.endereco.numero = "13";
		fu2.endereco.cidade = "Petrolandia";
		fu2.endereco.estado = "Pernambuco";
		

		Funcionario fu3 = new Funcionario();
		fu3.id = 3;
		fu3.nome = "Luana";
		fu3.salario = 3500;
		fu3.usuario = new Usuario();
		fu3.usuario.id = 3;
		fu3.usuario.login = "luana.ifba";
		fu3.usuario.senha = "ifba123";
		fu3.endereco = new Endereco();
		fu3.endereco.id = 3;
		fu3.endereco.rua = "Rua OHJ";
		fu3.endereco.numero = "12";
		fu3.endereco.cidade = "água Branca";
		fu3.endereco.estado = "Alagoas";
		
		
		System.out.println(" LISTA DE FUNCIONÁRIOS CADASTRADOS: ");
		System.out.println("-----------");
		System.out.println("Id: " + fu1.id + ", " +"Nome: " + fu1.nome + ", " +"Salário: " + fu1.salario + ", "
				+" ID Usuário: " + fu1.usuario.id + ", " +" Login: " + fu1.usuario.login + ", "
				+" Senha: " + fu1.usuario.senha + ", " +" ID Endereço: " + fu1.endereco.id + ", "
				+" Rua: " + fu1.endereco.rua + ", " +" Número: " + fu1.endereco.numero + ", "
				+" Cidade: " + fu1.endereco.cidade + ", " +"  Estado: " + fu1.endereco.estado + ". ");
		System.out.println("-----------");
		System.out.println("Id: " + fu2.id + ", " +"Nome: " + fu2.nome + ", " +"Salário: " + fu2.salario + ", "
				+" ID Usuário: " + fu2.usuario.id + ", " +" Login: " + fu2.usuario.login + ", "
				+" Senha: " + fu1.usuario.senha + ", " +" ID Endereço: " + fu2.endereco.id + ", "
				+" Rua: " + fu2.endereco.rua + ", " +" Número: " + fu2.endereco.numero + ", "
				+" Cidade: " + fu2.endereco.cidade + ", " +"  Estado: " + fu2.endereco.estado + ". ");
		System.out.println("-----------");
		System.out.println("Id: " + fu3.id + ", " +"Nome: " + fu3.nome + ", " +"Salário: " + fu3.salario + ", "
				+" ID Usuário: " + fu3.usuario.id + ", " +" Login: " + fu3.usuario.login + ", "
				+" Senha: " + fu3.usuario.senha + ", " +" ID Endereço: " + fu3.endereco.id + ", "
				+" Rua: " + fu3.endereco.rua + ", " +" Número: " + fu3.endereco.numero + ", "
				+" Cidade: " + fu3.endereco.cidade + ", " +"  Estado: " + fu3.endereco.estado + ". ");
		
	}
	
}
