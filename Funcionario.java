import java.util.Scanner;
import ValidaCPF;
class Funcionario {
	private String nome,CPF;
	private int telefone,senha;
	Scanner ler = new Scanner(System.in);
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = ler.nextInt();
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = ler.next();
	}




	public String getCPF() {

		return CPF;
	}




	public void setCPF(String CPF) {
		CPF = ler.next();
		if (ValidaCPF.isCPF(CPF) == true)
		       System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
		    else System.out.printf("Erro, CPF invalido !!!\n");
		}
	




	public int getTelefone() {
		return telefone;
	}




	public void setTelefone(int telefone) {
		this.telefone = ler.nextInt();
	}
	
	
	
}
