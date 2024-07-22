package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    // atributos: 
    private LocalDate date;

    // construtor:
    public Mentoria() {
    }
    
    // getters and setters:
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

    // métodos:
    public double calculateXp() {
        return XP_STANDARD + 20;
    }

    @Override
    public String toString() {
        return "Mentoria [date=" + date + ", getTitle()=" + getTitle() + ", getDescription()=" + getDescription() + "]";
    }
}
