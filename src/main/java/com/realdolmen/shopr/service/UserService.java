package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.OverviewRepository;
import com.realdolmen.shopr.repository.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;


//business logic goes here in service

@Stateless
public class UserService
{
    @Inject
    private UserRepository userRepository;

    @Inject
    private OverviewRepository overviewRepository;

    private List<Artikel> favorietenLijst = new ArrayList<>();

    public List<Artikel> getFavorietenLijst()
    {
        return favorietenLijst;
    }

    public void setFavorietenLijst(List<Artikel> favorietenLijst)
    {
        this.favorietenLijst = favorietenLijst;
    }

    public User findUserById(int id)
    {
        return userRepository.findById(id);
    }

    public List<User> findAllUsers()
    {
        return userRepository.findAll();
    }

    public User findUserByName(String name)
    {
        return userRepository.findByName(name);
    }


    //managed transaction --> geen persist nodig
    // na gebruik service auto persist/update , kracht van jpa
    // alles in service valt binnen transaction

    public void updateName(int id, String newName)
    {
        User user = userRepository.findById(id);
        user.setName(newName);
    }

    public void insert(User user)
    {
        userRepository.insert(user);
    }

    public void delete(int id)
    {
        User user = userRepository.findById(id);
        userRepository.delete(user);
    }

    public void update(User user)
    {
        userRepository.update(user);
    }

    public boolean isFavoriet(Artikel a, User u)
    {
User user = userRepository.findById(u.getId());

        for (Artikel x : user.getFavorieten() )
        {
            if (x.getId() == a.getId())
            {
                return true;
            }

        }
        return false;

    }

    public void addFavoriet(Artikel a, User u)
    {

        User user = userRepository.findById(u.getId());
        user.favorietToevoegenAanUser(a);




    }

    public void removeFavoriet(Artikel a, User u)
    {

       User user = userRepository.findById(u.getId());
       Artikel artikel = overviewRepository.findById(a.getId());
       user.favorietVerwijderenUser(artikel);


    }

}
