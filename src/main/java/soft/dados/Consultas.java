package soft.dados;

public class Consultas {
    private String data;
    private String hora;
    private String tratamento;
    private Veterinario vet;
    private Animal animal;
    
    public String getTratamento() {
        return tratamento;
    }
    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public Veterinario getVet() {
        return vet;
    }
    public void setVet(Veterinario vet) {
        this.vet = vet;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    @Override
    public String toString() {
        return "Consultas [ data: " + data + ", hora: " + hora + ", veterinário: " + vet.getNome() + ", animal: " + animal.getNome() + "]";
    }
    
}
