public class TesteAbstrato {
    public static void main(String[] args) {
        Veiculo veiculo = new Sedan("Toyota");
        veiculo.infoVeiculo();
        ((Carro) veiculo).abrirPortaMalas();
    }
}
