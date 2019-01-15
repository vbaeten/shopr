package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Book;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.repository.CriteriaRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class CriteriaService implements Serializable {
    @Inject
    private CriteriaRepository criteriaRepository;

    public <T> List<T> findByCriteria(List<Class> types) {
        List<T> result = new ArrayList<>();
        types.forEach(type -> result.addAll(criteriaRepository.findByCriteria(type)));
        return result;
    }

    public List<Class> manageCheckedTypes(List<Class> types, Boolean checked,
                                          String type) {
        if (checked) {
            switch (type) {
                case "BOOK":
                    types.add(Book.class);
                    break;
                case "GAME":
                    types.add(Game.class);
                    break;
                case "LP":
                    types.add(Lp.class);
                    break;
            }
        } else {
            switch (type) {
                case "BOOK":
                    types.remove(Book.class);
                    break;
                case "GAME":
                    types.remove(Game.class);
                    break;
                case "LP":
                    types.remove(Lp.class);
                    break;
            }
        }
        return types;
    }

    public void setCheckboxStates(List<Class> types, Boolean booksChecked,
                                  Boolean gamesChecked, Boolean lpsChecked) {
        for (Class type : types) {
            if (type == Book.class) {
                booksChecked = true;
            } else if (type == Game.class) {
                gamesChecked = true;
            } else if (type == Lp.class) {
                lpsChecked = true;
            }
        }
    }
}
