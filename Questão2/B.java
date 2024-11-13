package Questão2;

import java.util.ArrayList;
import java.util.List;

class B {
    private List<A> listaDeAs;

    public B() {
        listaDeAs = new ArrayList<>();
    }

    public void adicionarA(A a) {
        listaDeAs.add(a);
    }

    public List<A> buscarAsPorAtributo2(String valorAtributo2) {
        List<A> resultados = new ArrayList<>();
        for (A a : listaDeAs) {
            if (a.getAtributo2().equals(valorAtributo2)) {
                resultados.add(a);
            }
        }
        return resultados;
    }

    public void listarAs() {
        if (listaDeAs.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            for (A a : listaDeAs) {
                System.out.println("Atributo1: " + a.getAtributo1() + ", Atributo2: " + a.getAtributo2());
            }
        }
    }
}
