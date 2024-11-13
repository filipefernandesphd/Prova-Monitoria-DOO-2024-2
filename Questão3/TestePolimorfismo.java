package Questão3;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();
        
        animal1.emitirSom();
        animal2.emitirSom();
        
        // Código adicional
        if (animal1 instanceof Cachorro) {
            ((Cachorro) animal1).correr();
        }
    }
}
