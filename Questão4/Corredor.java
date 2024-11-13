package Questão4;

interface Corredor {
    void correr();
    default void aquecer() {
        System.out.println("Aquecimento do corredor.");
    }
}
