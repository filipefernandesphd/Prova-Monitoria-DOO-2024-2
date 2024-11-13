abstract class Carro extends Veiculo {
    public Carro(String marca) {
        super(marca);
    }

    public abstract void abrirPortaMalas();

    @Override
    public void infoVeiculo() {
        super.infoVeiculo();
        System.out.println("Tipo: Carro");
    }
}
