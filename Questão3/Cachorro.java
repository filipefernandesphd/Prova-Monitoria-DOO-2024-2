package Questão3;

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }
    
    public void correr() {
        System.out.println("Cachorro correndo");
    }
}
