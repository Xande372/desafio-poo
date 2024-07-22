package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    // atributos: 
    private String name;
    private String description;
    private LocalDate firtsDate = LocalDate.now();
    private LocalDate lastDate = firtsDate.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    // getters and setters: 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getFirtsDate() {
        return firtsDate;
    }
    public void setFirtsDate(LocalDate firtsDate) {
        this.firtsDate = firtsDate;
    }

    public LocalDate getLastDate() {
        return lastDate;
    }
    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }
    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }
    
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    // equals and hashcodes: 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((firtsDate == null) ? 0 : firtsDate.hashCode());
        result = prime * result + ((lastDate == null) ? 0 : lastDate.hashCode());
        result = prime * result + ((devsInscritos == null) ? 0 : devsInscritos.hashCode());
        result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bootcamp other = (Bootcamp) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        if (firtsDate == null) {
            if (other.firtsDate != null)
                return false;
        } else if (!firtsDate.equals(other.firtsDate))
            return false;
        if (lastDate == null) {
            if (other.lastDate != null)
                return false;
        } else if (!lastDate.equals(other.lastDate))
            return false;
        if (devsInscritos == null) {
            if (other.devsInscritos != null)
                return false;
        } else if (!devsInscritos.equals(other.devsInscritos))
            return false;
        if (conteudos == null) {
            if (other.conteudos != null)
                return false;
        } else if (!conteudos.equals(other.conteudos))
            return false;
        return true;
    }
}
