package Questão5.AlternativaC;

import java.util.ArrayList;
import java.util.List;

class Diretorio implements Componente {
    private String nome;
    private List<Diretorio> subDiretorios = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    public void adicionarDiretorio(Diretorio diretorio) {
        subDiretorios.add(diretorio);
    }

    @Override
    public void exibir() {
        System.out.println("Diretório: " + nome);
        for (Diretorio diretorio : subDiretorios) {
            diretorio.exibir();
        }
    }
}
