package cf;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class TelaCadastro {

	public static void main(String[] args) throws SQLException {
		
		SQLiteJDBC.criaTabela();
		
		Object[] itens = {"Adicionar", "Modificar", "Consultar", "Excluir"};
		String selecao = (String) JOptionPane.showInputDialog(null,
	          "Escolha um item", "Opçao",
	              JOptionPane.INFORMATION_MESSAGE, null,
	                  itens, itens[0]);
		if(selecao == "Adicionar")
			Funcionario.adicionarFuncionario();
		else if(selecao == "Modificar")
			Funcionario.modificarFuncionario();
		else if(selecao == "Consultar")
			Funcionario.consultaFuncionario(true);
		else if(selecao == "Excluir")
			Funcionario.excluiFuncionario();
	}
	
	
}
