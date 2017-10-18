package com.cf;

/*
 * public class Funcionario extends Usuario {
 * 
 * public static String adicionarFuncionario() { Usuario user = new Usuario();
 * Usuario.setId(SQLiteJDBC.ultimoId() + 1);
 * user.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário:"));
 * user.setEmail(JOptionPane.showInputDialog("Digite o e-mail do funcionário:"))
 * ; Object[] itens = { Cargos.GERENTE, Cargos.TECNICO, Cargos.CLIENTE }; Cargos
 * selecao = (Cargos) JOptionPane.showInputDialog(null, "Escolha um item",
 * "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
 * user.setCargo(selecao);
 * user.setSenha(JOptionPane.showInputDialog("Digite a senha do funcionário:"));
 * SQLiteJDBC.gravaDados(getId(), getNome(), getEmail(), getCargo(),
 * getSenha()); return null; }
 * 
 * public static String modificarFuncionario() throws SQLException { Usuario
 * user = new Usuario(); Usuario.setId(consultaFuncionario(false));
 * user.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário:"));
 * user.setEmail(JOptionPane.showInputDialog("Digite o e-mail do funcionário:"))
 * ; Object[] itens = { Cargos.GERENTE, Cargos.TECNICO, Cargos.CLIENTE }; Cargos
 * selecao = (Cargos) JOptionPane.showInputDialog(null, "Escolha um item",
 * "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
 * user.setCargo(selecao);
 * user.setSenha(JOptionPane.showInputDialog("Digite a senha do funcionário:"));
 * SQLiteJDBC.gravaDados(getId(), getNome(), getEmail(), getCargo(),
 * getSenha());
 * 
 * return null; }
 * 
 * public static String excluiFuncionario() { setId(consultaFuncionario(false));
 * SQLiteJDBC.deletaDados(getId()); return null; }
 * 
 * public static int consultaFuncionario(boolean imprime) {
 * 
 * String procura = (String)JOptionPane.showInputDialog( null, "Digite o nome\n"
 * + "do funcionário desejado", "Customized Dialog", JOptionPane.PLAIN_MESSAGE,
 * null, null, ""); int id = SQLiteJDBC.consultarDados(imprime, procura); return
 * id; }
 * 
 * }
 */
