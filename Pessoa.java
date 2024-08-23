package poo;

public class Pessoa {

	public static void main(String[] args) {
		
	}
		String nome;
		int idade;
		long Cpf;
		int Rg;
		String endereco;
		String profissao;
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public int getIdade() {
			return idade;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getProfissao() {
			return profissao;
		}
		public void setProfissao(String profissao) {
			this.profissao = profissao;
		}
		public long getCpf() {
			return Cpf;
		}
		public void setCpf(long cpf) {
			this.Cpf = cpf;
		}
		public int getRg() {
			return Rg;
		}
		public void setRg(int Rg) {
			this.Rg = Rg;
		}
	}