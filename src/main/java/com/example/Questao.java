package com.example;

import com.google.code.gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Questao {

    private String questao;
    private String[] opcoes;
    private int points;
    private int correct;
    private int num_opcoes;

    public String getQuestao() {
        return questao;
    }

    public void setQuestao(String questao) {
        this.questao = questao;
    }

    public String[] getOpcoes() {
        return opcoes;
    }

    public void setOpcoes(String[] opcoes) {
        this.opcoes = opcoes;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }

    public static Questao readFromFile(String caminhoArquivo) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(caminhoArquivo)));
            Gson gson = new Gson();
            return gson.fromJson(content, Questao.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
