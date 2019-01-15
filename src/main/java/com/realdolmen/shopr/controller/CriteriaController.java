package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.service.CriteriaService;
import net.bootsfaces.component.selectBooleanCheckbox.SelectBooleanCheckbox;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class CriteriaController implements Serializable {
    private List<Class> items = new ArrayList<>();
    private List<Class> types = new ArrayList<>();
    private Boolean booksChecked;
    private Boolean gamesChecked;
    private Boolean lpsChecked;

    @Inject
    private CriteriaService criteriaService;

    @PostConstruct
    private void init() {
        criteriaService.setCheckboxStates(types, booksChecked,
                gamesChecked, lpsChecked);
    }

    public void fetchCheckboxStateAndType(SelectBooleanCheckbox checked, String type) {
        types = criteriaService.manageCheckedTypes(types, (Boolean) checked.getValue(), type);
        items = criteriaService.findByCriteria(types);
    }

    public List<Class> getItems() {
        return items;
    }

    public void setItems(List<Class> items) {
        this.items = items;
    }

    public Boolean getBooksChecked() {
        return booksChecked;
    }

    public void setBooksChecked(Boolean booksChecked) {
        this.booksChecked = booksChecked;
    }

    public Boolean getGamesChecked() {
        return gamesChecked;
    }

    public void setGamesChecked(Boolean gamesChecked) {
        this.gamesChecked = gamesChecked;
    }

    public Boolean getLpsChecked() {
        return lpsChecked;
    }

    public void setLpsChecked(Boolean lpsChecked) {
        this.lpsChecked = lpsChecked;
    }
}
