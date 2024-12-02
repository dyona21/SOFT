package soft.dados;

public class Alimento {
    private String nome;
    private String nutrientes;
    private Animal animal;
    private String marca;
    private String precoKg;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNutrientes() {
        return nutrientes;
    }
    public void setNutrientes(String nutrientes) {
        this.nutrientes = nutrientes;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getPrecoKg() {
        return precoKg;
    }
    public void setPrecoKg(String precoKg) {
        this.precoKg = precoKg;
    }
    @Override
    public String toString() {
        return "Alimento [nome: " + nome + ", nutrientes: " + nutrientes + ", comida para :" + animal.getNome() + ", marca: "
                + marca + ", preço do Kg: " + precoKg + "]";
    }
}
