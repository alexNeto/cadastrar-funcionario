package cf;

import javax.swing.JOptionPane;

public class Funcionario extends Usuario {

	public static String adicionarFuncionario() {
		Usuario user = new Usuario();
		user.setId(SQLiteJDBC.ultimoId() + 1);
		user.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário:"));
		user.setEmail(JOptionPane.showInputDialog("Digite o e-mail do funcionário:"));
		Object[] itens = { Cargos.GERENTE, Cargos.TECNICO, Cargos.CLIENTE };
		Cargos selecao = (Cargos) JOptionPane.showInputDialog(null,
	          "Escolha um item", "Opçao",
	              JOptionPane.INFORMATION_MESSAGE, null,
	                  itens, itens[0]);
	    user.setCargo(selecao);
	    user.setSenha(JOptionPane.showInputDialog("Digite a senha do funcionário:"));
	    SQLiteJDBC.gravaDados(getId(), getNome(), getEmail(), getCargo(), getSenha());
		return null;
	}

	public String modificarFuncionario() {
		
		return null;
	}

	public String excluiFuncionario() {
		return null;
	}

	public void consultaFuncionario() {

	}

}