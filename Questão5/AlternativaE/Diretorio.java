package Questão5.AlternativaE;

import java.util.ArrayList;
import java.util.List;

class Diretorio {
    private String nome;
    private List<Arquivo> arquivos = new ArrayList<>();

    public Diretorio(String nome) {
        this.nome = nome;
    }

    public void adicionarArquivo(Arquivo arquivo) {
        arquivos.add(arquivo);
    }

    public void exibir() {
        System.out.println("Diretório: " + nome);
        for (Arquivo arquivo : arquivos) {
            arquivo.exibir();
        }
    }
}
