package org.example;

public class Personagem {
    protected int vida;
    protected int ataque;
    protected float velocidade;

    public Personagem(int vida, int ataque, float velocidade){
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public int getVida(){
        return this.vida;
    }

    public int getAtaque(){
        return this.ataque;
    }

    public float getVelocidade(){
        return this.velocidade;
    }

    public String mover(){
        return "Estou me movendo ";
    }

    public String atacar(){
        return "Estou atacando ";
    }
}
