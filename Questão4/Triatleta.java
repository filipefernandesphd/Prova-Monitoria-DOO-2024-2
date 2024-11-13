package Questão4;

class Triatleta implements Corredor, Nadador {
    @Override
    public void correr() {
        System.out.println("Triatleta correndo.");
    }
    
    @Override
    public void nadar() {
        System.out.println("Triatleta nadando.");
    }
    
    // Método de aquecimento específico implementado aqui
    @Override
    public void aquecer() {
        Corredor.super.aquecer();
        Nadador.super.aquecer();
        System.out.println("Aquecimento completo do triatleta.");
    }
}
