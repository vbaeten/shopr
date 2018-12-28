package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "Reviews")
public class Beoordeling
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    @Size(min = 0, max = 10)
    private int score = 5;
    @Column
    private String onschrijving;
    @ManyToOne
    private User user;
    @ManyToMany
    private List <Artikel> artikels;

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
