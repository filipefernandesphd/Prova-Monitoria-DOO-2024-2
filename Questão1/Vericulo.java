abstract class Veiculo {
    private String marca;


    public Veiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public abstract int getMaxVelocidade();

    public void infoVeiculo() {
        System.out.println("Marca: " + getMarca());
        System.out.println("Velocidade Máxima: " + getMaxVelocidade() + " km/h");
    }
}
