package soft.dados;

public class Veterinario {
    private String nome;
    private String especialidade;
    private String telefone;
    private String horarioTrabalho;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getHorarioTrabalho() {
        return horarioTrabalho;
    }
    public void setHorarioTrabalho(String horarioTrabalho) {
        this.horarioTrabalho = horarioTrabalho;
    }
    @Override
    public String toString() {
        return "Veterinário [ nome: " + nome + ", especialidade: " + especialidade + ", telefone: " + telefone
                + ", horário de trabalho: " + horarioTrabalho + "]";
    }
}
