package Questão2;

import java.util.List;

public class C {
    public static void main(String[] args) {
        B b = new B();
        A a1 = new A("Valor1", "X");
        A a2 = new A("Valor2", "X");
        A a3 = new A("Valor3", "Y");

        b.adicionarA(a1);
        b.adicionarA(a2);
        b.adicionarA(a3);

        System.out.println("Objetos com Atributo2 = X:");
        List<A> resultados = b.buscarAsPorAtributo2("X");
        for (A a : resultados) {
            System.out.println(a.getAtributo1());
        }
    }
}
