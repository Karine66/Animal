package com.karine.Animal;

public class Loup extends Canin {

    public Loup(){

    }

    public Loup(String couleur, int poids){
        this.couleur = couleur;
        this.poids = poids;
    }

    public void crier(){
        System.out.println("Je hurle à la la Lune en faisant ouhouh");
    }
}
