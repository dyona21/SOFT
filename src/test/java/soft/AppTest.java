package soft;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import soft.dados.*;
import soft.negocio.*;
/**
 * Unit test for simple App.
 */
class AppTest {
    Zoologico zoo = new Zoologico();

    @Test
    void testIngresso() {
        Pessoa p1 = new Pessoa();
        p1.setIdade(25);
        assertEquals(15.50, zoo.valorIngresso(p1));
    }

    @Test
    void testCadastroAlimento(){
        Alimento ali1 = new Alimento();
        assertTrue(zoo.cadastrarAlimento(ali1));
    }

    @Test
    void testCadastroAnimal(){
        Animal animal = new Animal();
        assertTrue(zoo.cadastrarAnimais(animal));
    }

    @Test
    void testCadastroFuncionario(){
        Funcionario funcionario = new Funcionario();
        assertTrue(zoo.cadastrarFuncionario(funcionario));
    }

    @Test
    void testCadastroPessoa(){
        assertTrue(zoo.realizarCadastro("Dyonatan", "042482894-23", 21));
    }

    @Test
    void testCadastroVeterinario(){
        Veterinario vet = new Veterinario();
        assertTrue(zoo.cadastrarVeterinario(vet));
    }

    @Test
    void testCadastroviveiro(){
        Viveiro viveiro = new Viveiro();
        assertTrue(zoo.cadastrarViveiro(viveiro));
    }

    @Test
    void testAdicionarViveiroVisita(){
        List<Viveiro> viveiros = new ArrayList<Viveiro>();
        Viveiro vive = new Viveiro();
        viveiros.add(vive);
        Visitas visita = new Visitas();
        visita.setNome_do_grupo("escola");
        zoo.getVisitas().add(visita);
        
        assertTrue(zoo.adicionarViveirosVisita(viveiros, "escola"));
    }

    @Test
    void testMetodoLancaExcecaoViveiros() {
        assertThrows(IllegalArgumentException.class, () -> {
            zoo.adicionarViveirosVisita(null, "escola");
        });
    }

    @Test 
    void testAgendarConsulta(){
        Animal ani = new Animal();
        Veterinario vet = new Veterinario();
        assertTrue(zoo.agendarConsulta(ani, vet, "10/11/2025", "13:00", "Remédios"));
    }

    @Test
    void testAlocarAnimal(){
        Animal animal = new Animal();
        Viveiro viveiro = new Viveiro();
        assertTrue(zoo.alocarAnimal(animal, viveiro));
    }

    @Test
    void testAlocarPeixe(){
        Peixe peixe = new Peixe();
        Viveiro viveiro = new Viveiro();
        Aquario aquario = new Aquario();
        assertFalse(zoo.alocarAnimal(peixe, viveiro));
        assertTrue(zoo.alocarAnimal(peixe, aquario));
    }

    @Test 
    void testAtribuirGuiaVisita(){
        Funcionario guia = new Funcionario();
        Visitas visita = new Visitas();
        visita.setNome_do_grupo("grupo escolar");
        zoo.getVisitas().add(visita);
        zoo.atribuirGuiaVisita(guia, "grupo escolar");
    }

    @Test
    void testMetodoLancaExcecaoVisitas() {
        assertThrows(IllegalArgumentException.class, () -> {
            zoo.atribuirGuiaVisita(null, null);
        });
    }

    @Test
    void testFuncionariosViveiro(){
        List<Funcionario> funcs = new ArrayList<>();
        Funcionario f = new Funcionario();
        funcs.add(f);
        Viveiro viveiro = new Viveiro();
        viveiro.setNome("sala 12");
        zoo.getViveiros().add(viveiro);

        assertTrue(zoo.funcionariosViveiro(funcs, "sala 12"));
    }

    @Test
    void testAnimaisEspecificos(){
        List<Animal> animais = new ArrayList<>();
        assertEquals(animais, zoo.getAnimaisEspecificos("mamiferos"));
    }

    @Test 
    void testFuncionarioEspecifico(){
        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario f = new Funcionario();
        f.setCargo("gerente");
        Funcionario f2 = new Funcionario();
        f2.setCargo("gerente");
        zoo.getFuncionarios().add(f);
        zoo.getFuncionarios().add(f2);
        funcionarios.add(f);
        funcionarios.add(f2);
        assertEquals(funcionarios, zoo.getFuncionariosEspecificos("gerente"));
    }

    @Test
    void testViveiroEspecifico(){
        List<Viveiro> viveiros = new ArrayList<>();
        Viveiro v = new Viveiro();
        v.setNome("sala 15");
        Viveiro v2 = new Viveiro();
        v2.setNome("sala 15");
        zoo.getViveiros().add(v);
        zoo.getViveiros().add(v2);
        viveiros.add(v);
        viveiros.add(v2);
        assertEquals(viveiros, zoo.getViveirosEspecificos("sala 15"));
    }

    @Test
    void testListaConsultas(){
        List<Consultas> consultas = new ArrayList<>();
        Animal animal = new Animal();
        Veterinario vet = new Veterinario();
        assertEquals(consultas, zoo.listarConsultas(animal, vet));
    }

    @Test
    void testListaAgendamentos(){
        List<Consultas> consultas = new ArrayList<>();
        assertEquals(consultas, zoo.listarAgendamentos());
    }

    @Test
    void testListaAlimento(){
        List<Alimento> alimentos = new ArrayList<>();
        assertEquals(alimentos, zoo.listarAlimentos());
    }

    @Test
    void testAgendamentoVisita(){
        List<Pessoa> pessoas = new ArrayList<>();
        assertTrue(zoo.realizarAgendamento(pessoas, "grupo escolar Peteleko", "12:00", "10/12/2018", "Afonso" , 20));
    }

    @Test
    void testSalvarConsulta(){
        Consultas consulta = new Consultas();
        assertTrue(zoo.salvarConsulta(consulta));
    }

    @Test
    void testAlimentoAnimal(){
        Alimento alimento = new Alimento();
        alimento.setNome("ração");
        Animal animal = new Animal();
        animal.setComida(alimento);
        zoo.getAnimais().add(animal);
        zoo.getAlimentos().add(alimento);
        alimento.setAnimal(animal);
        assertEquals(alimento, zoo.verAlimentoDoAnimal(animal));
    }
}
