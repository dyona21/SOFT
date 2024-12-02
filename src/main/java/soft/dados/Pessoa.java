package soft.dados;

public class Pessoa {
    private int idade;
    private String cpf;
    private String nome;
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Pessoa [ idade: " + idade + ", CPF: " + cpf + ", nome: " + nome + "]";
    }
}
