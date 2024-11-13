package Questão4;

interface Nadador {
    void nadar();
    default void aquecer() {
        System.out.println("Aquecimento do nadador.");
    }
}

