package cf;

public class TelaCadastro {

	public static void main(String[] args) {
		//SQLiteJDBC.iniciaDB();
		SQLiteJDBC.criaTabela();
		Funcionario.adicionarFuncionario();
	}
	
	
}
