class Sedan extends Carro {
    public Sedan(String marca) {
        super(marca);
    }

    @Override
    public int getMaxVelocidade() {
        return 200;
    }

    @Override
    public void abrirPortaMalas() {
        System.out.println("Porta-malas do Sedan aberto.");
    }
}
