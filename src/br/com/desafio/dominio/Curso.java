package br.com.desafio.dominio;

public class Curso {

    private String title;
    private String description;
    private int courseLoad;
    
    public Curso() {
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getCourseLoad() {
        return courseLoad;
    }
    public void setCourseLoad(int courseLoad) {
        this.courseLoad = courseLoad;
    }

    @Override
    public String toString() {
        return "Curso [ title= " + title + ", description= " + description + ", courseLoad= " + courseLoad + " ]";
    }
}
