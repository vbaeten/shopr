package com.realdolmen.shopr.domain;

public enum LpGenre {
    classical("Classical"), pop("Pop"), rock("Rock"), dance("Dance"), rnb("R&B"), hiphop("Hip-hop");
    public String description;
    LpGenre(String des){
        this.description = des;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
