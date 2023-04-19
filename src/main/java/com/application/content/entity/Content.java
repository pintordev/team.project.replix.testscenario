package com.application.content.entity;

public class Content {
    private int id;
    private String name;
    private String releaseDate;
    private String productionCompany;
    private String director;
    private String plot;

    public Content(int id, String name, String releaseDate, String productionCompany, String director, String plot) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.productionCompany = productionCompany;
        this.director = director;
        this.plot = plot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }
}
