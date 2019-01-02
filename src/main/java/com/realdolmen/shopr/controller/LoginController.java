package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.*;
import java.io.Console;
import java.util.List;

@ManagedBean
@SessionScoped
public class LoginController
{
    @PersistenceContext
    EntityManager entityManager;
//    @Resource
//    UserTransaction utx;

    private User currentUser;
    private String currentUserName;

    public String getCurrentUserName()
    {
        return currentUserName;
    }

    public void setCurrentUserName(String currentUserName)
    {
        this.currentUserName = currentUserName;
    }

    public LoginController()
    {
//        addUsers();
    }

    public void addUsers()
    {
//        try
//        {
//            utx.begin();
//            User user = new User("Meyers", "Koen");
//            User user2 = new User("Meyers", "Indy");
//            User user3 = new User("Meyers", "Odin");
//            entityManager.persist(user);
//            entityManager.persist(user2);
//            entityManager.persist(user3);
//            utx.commit();
//        } catch (NotSupportedException e)
//        {
//            e.printStackTrace();
//        } catch (SystemException e)
//        {
//            e.printStackTrace();
//        } catch (RollbackException e)
//        {
//            e.printStackTrace();
//        } catch (HeuristicMixedException e)
//        {
//            e.printStackTrace();
//        } catch (HeuristicRollbackException e)
//        {
//            e.printStackTrace();
//        }
    }

    public void setCurrentUser(int id )
    {
        this.currentUser = entityManager.find(User.class, id);





    }

    public void loggedIn()
    {

        System.out.println(currentUserName);
    }


//    public List<User> findAllUsers(){
//
//
//        return entityManager.createQuery("select u from User u", User.class).getResultList();
//    }

    public User getCurrentUser()
    {
        return currentUser;
    }


}
