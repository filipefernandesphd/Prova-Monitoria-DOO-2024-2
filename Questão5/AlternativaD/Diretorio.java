package Questão5.AlternativaD;

import java.util.ArrayList;
import java.util.List;

class Diretorio implements Componente {
    private String nome;
    private List<Componente> componentes = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    public void adicionarComponente(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public void exibir() {
        System.out.println("Diretório: " + nome);
        for (Componente componente : componentes) {
            componente.exibir();
        }
    }
}
