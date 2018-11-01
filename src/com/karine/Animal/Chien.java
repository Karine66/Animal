package com.karine.Animal;

public class Chien extends Canin implements Rintintin {

    public Chien() {

    }

    public Chien(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    public void crier() {
        System.out.println("J'abois sans raison");
    }

    public void faireCalin() {
    System.out.println("Je te fais un GROS CALIN");
    }

    public void faireLeBeau() {
    System.out.println("Je fais le beau !");
    }

    public void faireLechouille() {
        System.out.println("Je fais de grosses léchouilles...");
    }
}