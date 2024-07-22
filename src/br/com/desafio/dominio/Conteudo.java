package br.com.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_STANDARD = 10d;
    private String title;
    private String description;

    public abstract double calculateXp();

    public static double getXpStandard() {
        return XP_STANDARD;
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
}
