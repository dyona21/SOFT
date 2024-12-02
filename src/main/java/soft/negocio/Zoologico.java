package soft.negocio;

import java.util.*;

import soft.dados.*;

public class Zoologico {
    private List<Animal> animais = new ArrayList<Animal>();
    private List<Viveiro> viveiros = new ArrayList<Viveiro>();
    private List<Consultas> consultas = new ArrayList<Consultas>();
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private List<Visitas> visitas = new ArrayList<>();
    private List<Alimento> alimentos = new ArrayList<Alimento>();
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();
    private List<Veterinario> veterinarios = new ArrayList<Veterinario>();
    
    public Boolean cadastrarViveiro(Viveiro viveiro){
        return viveiros.add(viveiro);
    }

    public Boolean cadastrarVeterinario(Veterinario vet){
        return veterinarios.add(vet);
    }

    public Boolean cadastrarFuncionario(Funcionario funcionario){
        return funcionarios.add(funcionario);
    }

    public Boolean cadastrarAlimento(Alimento alimento){
        return alimentos.add(alimento);
    }

    public List<Alimento> listarAlimentos(){
        return alimentos;
    }

    public Alimento verAlimentoDoAnimal(Animal animal){
        for(Alimento ali : alimentos){
            if(ali.getAnimal().equals(animal)){
                return animal.getComida();
            }
        }
        return null;
    }

    public Boolean removerFuncionario(Funcionario funcionario){
        return funcionarios.remove(funcionario);
    }

    public List<Funcionario> getFuncionariosEspecificos(String cargo) {
        List<Funcionario> funcionarioTemp = new ArrayList<Funcionario>();

        for(Funcionario func : funcionarios){
            if(func.getCargo().equals(cargo)){
                funcionarioTemp.add(func);
            }
        }
        
        return funcionarioTemp;
    }

    public Boolean realizarAgendamento(List<Pessoa> pessoas, String nomeGrupo, String horario, String data, String guiaTuristico, int numeroPessoas){
        Visitas visita = new Visitas();
        visita.setData(data);
        visita.setGuiaTuristico(guiaTuristico);
        visita.setHorario(horario);
        visita.setNome_do_grupo(guiaTuristico);
        visita.setPessoas(pessoas);
        return visitas.add(visita);
    }

    public Boolean atribuirGuiaVisita(Funcionario guia, String nomeVisita){
        if (guia == null || nomeVisita == null) {
            throw new IllegalArgumentException("Nome do guia ou nome da visita não pode ser nulo");
        }
        for(Visitas vi : visitas){
            if(vi.getNome_do_grupo().equals(nomeVisita)){
                vi.setFuncionario(guia);
                return true;
            }
        }
        return false;
    }

    public Double valorIngresso(Pessoa pessoa){
        Double valor = 0.0;

        if(pessoa.getIdade() > 10){
            valor = 15.50;
        } else{
            valor = 10.50;
        }

        return valor;
    }

    public Boolean realizarCadastro(String nome, String cpf, int idade){

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf(cpf);
        pessoa.setIdade(idade);
        pessoa.setNome(nome);
        
        return pessoas.add(pessoa); 
    }

    public Boolean funcionariosViveiro(List<Funcionario> funcs, String nomeViveiro ){
        if (funcs == null || nomeViveiro == null) {
            throw new IllegalArgumentException("Nome do viveiro ou lista de funcionários não pode ser nulo");
        }
        for(Viveiro vive : viveiros){
            if(vive.getNome().equals(nomeViveiro)){
                vive.setFuncionarios(funcs);
                return true;
            }
        }
        return false;
    }

    public Boolean adicionarViveirosVisita(List<Viveiro> viveiros, String nomeGrupo){
        if (nomeGrupo == null || viveiros == null) {
            throw new IllegalArgumentException("Nome do viveiro ou lista de funcionários não pode ser nulo");
        }
        
        for(Visitas vi : visitas){
            if(vi.getNome_do_grupo().equals(nomeGrupo)){
                vi.setViveiros(viveiros);
                return true;
            }
        }
        return false;
    }

    public void editarInformacoesFuncionario(Funcionario funcionario, String nome, String cpf, String cargo, String horarioTrabalho){
        funcionario.setCargo(cargo);
        funcionario.setCpf(cpf);
        funcionario.setHorario_de_trabalho(horarioTrabalho);
        funcionario.setNome(nome);
    }

    public List<Visitas> listarAgendamentos(){
        return visitas;
    }

    public List<Consultas> consultasAnimal(Animal animal){
        List<Consultas> consultasDoAnimal = new ArrayList<>();
    
        for (Consultas consulta : consultas) {
            if (consulta.getAnimal().equals(animal)) {
                consultasDoAnimal.add(consulta);
            }
        }
    
        return consultasDoAnimal;
    }
    
    public void editarInformacoesAnimal(Animal animal, int altura, String especie, int largura, int comprimento, String nome, int idade){
        animal.setIdade(idade);
        animal.setNome(nome);
        animal.setEspecie(especie);
        animal.setAltura(altura);
        animal.setComprimento(comprimento);
        animal.setLargura(largura);
    }

    public Boolean removerAnimal(Animal animal){
        return animais.remove(animal);
    }

    public Boolean cadastrarAnimais(Animal animal){
        return animais.add(animal);
    }

    public List<Consultas> listarConsultas(Animal animal, Veterinario vet){
        List<Consultas> consults = new ArrayList<>();
        for(Consultas con : consultas){
            if(con.getAnimal().equals(animal) && con.getVet().equals(vet)){
                consults.add(con);
            }
        }
        return consults;
    }

    public Boolean salvarConsulta(Consultas consulta){
        return consultas.add(consulta);
    }
    
    public Boolean agendarConsulta(Animal animal, Veterinario vet, String data, String hora, String tratamento){
        Consultas consulta = new Consultas();
        consulta.setAnimal(animal);
        consulta.setVet(vet);
        consulta.setData(data);
        consulta.setHora(hora);
        consulta.setTratamento(tratamento);

        return consultas.add(consulta);
    }

    public List<Viveiro> getSoViveiros() {
        List<Viveiro> viveiroTemp = new ArrayList<>();
        
        for (Viveiro viveiro : viveiros) { // Presume-se que viveiros é uma List<Viveiro>
            if (!(viveiro instanceof Aquario)) {
                viveiroTemp.add(viveiro);
            }
        }
        
        return viveiroTemp;
    }
    
    public List<Aquario> getSoAquarios() {
        List<Aquario> aquarioTemp = new ArrayList<>();
        
        for (Viveiro viveiro : viveiros) { // Presume-se que viveiros é uma List<Viveiro>
            if (viveiro instanceof Aquario) {
                aquarioTemp.add((Aquario) viveiro);
            }
        }
        
        return aquarioTemp;
    }
    
    public boolean alocarAnimal(Animal animal, Viveiro viveiro){
            return viveiro.adicionarAnimal(animal);
    }
    
    public List<Animal> getAnimais() {
        return animais;
    }

    public List<Animal> getAnimaisEspecificos(String especie) {
        List<Animal> animalTemp = new ArrayList<Animal>();

        for(Animal ani : animais){
            if(ani.getEspecie().equals(especie)){
                animalTemp.add(ani);
            }
        }
        
        return animalTemp;
    }

    public List<Viveiro> getViveiros() {
        return viveiros;
    }

    public List<Viveiro> getViveirosEspecificos(String nomeViveiro) {
        List<Viveiro> viveiroTemp = new ArrayList<Viveiro>();

        for(Viveiro viver : viveiros){
            if(viver.getNome().equals(nomeViveiro)){
                viveiroTemp.add(viver);
            }
        }
        
        return viveiroTemp;
    }

    public List<Visitas> getVisitas() {
        return visitas;
    }

    public List<Funcionario> getFuncionarios(){
        return funcionarios;
    }

    public List<Consultas> getConsultas(){
        return consultas;
    }

    public List<Alimento> getAlimentos(){
        return alimentos;
    }
}
