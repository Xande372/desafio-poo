package br.com.desafio.dominio;

public class Curso extends Conteudo{

    // atributos: 
    private int courseLoad;
    
    // construtor: 
    public Curso() {
    }

    // getters and setters: 
    public int getCourseLoad() {
        return courseLoad;
    }
    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }

    // métodos: 
    public double calculateXp() {
        return XP_STANDARD * courseLoad;
    }

    @Override
    public String toString() {
        return "Curso [ title= " + getTitle() + ", description= " + getDescription() + ", courseLoad= " + courseLoad + " ]";
    }
}
