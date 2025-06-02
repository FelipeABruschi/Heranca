package org.example;

public class Arqueiro extends Personagem{
    public Arqueiro(){
        super(35, 2, 1f);
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
        return super.mover() + "com velocidade de " + this.getVelocidade();
    }

    public String atacar(){
        return super.atacar() + "com ataque de " + this.getAtaque();
    }
}
