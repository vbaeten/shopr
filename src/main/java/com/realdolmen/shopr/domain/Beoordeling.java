package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "Reviews")
@NamedQueries({
        @NamedQuery(name = Beoordeling.FIND_ALL,
                query = "select b from Beoordeling b")})

public class Beoordeling
{

    public static final String FIND_ALL = "Beoordeling.findAll";


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private int score = 5;
    @Column
    private String onschrijving;
    @ManyToOne
    private User user;
   @ManyToOne
   private Artikel artikel;


    public Artikel getArtikel()
    {
        return artikel;
    }

    public void setArtikel(Artikel artikel)
    {
        this.artikel = artikel;
    }

    public Long getId()
    {
        return id;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public String getOnschrijving()
    {
        return onschrijving;
    }

    public void setOnschrijving(String onschrijving)
    {
        this.onschrijving = onschrijving;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }


}
