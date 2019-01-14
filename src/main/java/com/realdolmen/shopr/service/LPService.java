package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.repository.CrudRepository;
import com.realdolmen.shopr.repository.LPRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;
@Stateless
public class LPService extends CrudService<LP, Long>{
    @Inject
    private LPRepository lPRepository;

    @Override
    CrudRepository<LP, Long> getRepository() {
        return lPRepository;
    }

//    public LP findLPByArticleId(Long articleId) {
//        return lPRepository.findByArticleId(articleId);
//    }
//    public List<LP> findAllLPS() {
//        return lPRepository.findAll();
//    }
//
//    public LP findByTitle(String title) {
//        return lPRepository.findByTitle(title);
//    }
//
//    public void updateTitle(Long articleId, String newTitle) {
//        LP lP = lPRepository.findByArticleId(articleId);
//        lP.setTitle(newTitle);
//    }
//
//    public void removeLPByArticleId(Long articleId){
//        LP lP = lPRepository.findByArticleId(articleId);
//        lPRepository.removeLP(lP);
//    }
//
//    public void update(LP lp) {lPRepository.update(lp);}
//
//    public void insert(LP lp){
//        lPRepository.insert(lp);
//    }
}
