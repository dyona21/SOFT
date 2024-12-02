package soft.dados;

public class Funcionario {
    private String nome;
    private String cargo;
    private String horario_de_trabalho;
    private String cpf;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getHorario_de_trabalho() {
        return horario_de_trabalho;
    }
    public void setHorario_de_trabalho(String horario_de_trabalho) {
        this.horario_de_trabalho = horario_de_trabalho;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String toString() {
        return "Funcionario [nome: " + nome + ", cargo: " + cargo + ", horário de trabalho:" + horario_de_trabalho
                + ", CPF:" + cpf + "]";
    } 
    

}
