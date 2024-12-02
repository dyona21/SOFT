package soft.dados;

import java.util.ArrayList;
import java.util.List;

public class Visitas {
    private String nome_do_grupo;
    private String data;
    private String horario;
    private String guiaTuristico;
    private Funcionario guia = new Funcionario();
    private List<Viveiro> viveiros = new ArrayList<Viveiro>();
    private double ingresso;
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();
    
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public double getIngresso() {
        return ingresso;
    }
    public void setIngresso(double ingresso) {
        this.ingresso = ingresso;
    }
    public List<Viveiro> getViveiros() {
        return viveiros;
    }
    public void setViveiros(List<Viveiro> viveiros) {
        this.viveiros = viveiros;
    }
    public void setFuncionario(Funcionario func){
        guia = func;
    }
    public Funcionario getGuia(){
        return guia;
    }
    public String getNome_do_grupo() {
        return nome_do_grupo;
    }
    public void setNome_do_grupo(String nome_do_grupo) {
        this.nome_do_grupo = nome_do_grupo;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getGuiaTuristico() {
        return guiaTuristico;
    }
    public void setGuiaTuristico(String guiaTuristico) {
        this.guiaTuristico = guiaTuristico;
    }
    @Override
    public String toString() {
        return "Visitas [nome do grupo: " + nome_do_grupo + ", data: " + data + ", horário:" + horario
                + ", guia turístico: " + guiaTuristico + "]";
    }
    
}
