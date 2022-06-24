package com.example.touchgamev2;

public class GameActivity {

    public int ponto;
    public String nome;
    public  String ranking;

    public GameActivity() {

    }

    public GameActivity(int ponto, String nome) {
        this.ponto = ponto;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome + '|' + ponto;
    }

    public int getPonto() {
        return ponto;
    }

    public void setPonto(int ponto) {
        this.ponto = ponto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRanking(String ranking) { this.ranking = ranking; }


}
