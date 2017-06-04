package cf;

public class Usuario {

	private static int id;

	private static String nome;

	private static String email;

	private static Cargos cargo;

	private static String senha;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Usuario.id = id;
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Usuario.nome = nome;
	}

	public static String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Usuario.email = email;
	}

	public static Cargos getCargo() {
		return cargo;
	}

	public void setCargo(Cargos cargo) {
		Usuario.cargo = cargo;
	}

	public static String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		Usuario.senha = senha;
	}

	

}
