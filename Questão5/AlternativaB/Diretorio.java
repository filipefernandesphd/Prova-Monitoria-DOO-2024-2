package Questão5.AlternativaB;

import java.util.ArrayList;
import java.util.List;

class Diretorio extends Componente {
    private String nome;
    private List<Arquivo> arquivos = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    public void adicionarArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    @Override
    public void exibir() {
        System.out.println("Diretório: " + nome);
        for (Arquivo arquivo : arquivos) {
            arquivo.exibir();
        }
    }
}
