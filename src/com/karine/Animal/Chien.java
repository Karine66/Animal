package com.karine.Animal;

public class Chien extends Canin {

    public Chien(){

}

public Chien(String couleur, int poids) {
    this.couleur = couleur;
    this.poids = poids;
}

void crier() {
    System.out.println("J'abois sans raison");
    }
}