package com.realdolmen.shopr.controller;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class utilityController {





    public String redirect(String link){

        switch (link){

            case "fiction":
                return "/overview-pages/fiction-overview.xhtml";

            case "nonFiction":
                return"/overview-pages/nonFiction-overview.xhtml";

            case "games":
                return "/overview-pages/games-overview.xhtml";

            case "lps":
                return "/overview-pages/lps-overview.xhtml";


        }return "items-overview.xhtml";

    }


}
