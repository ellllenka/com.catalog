package com.catalog.service;

import com.catalog.domain.Good;
import com.catalog.domain.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class GoodService {
    @Autowired
    private GoodRepository goodRepository;

    public Iterable<Good> getGood(Integer id){
        if (id == null)
            return goodRepository.findAll();
        else {
            List<Good> goods = new ArrayList<>();
            goods.add(goodRepository.findOne(id));
            return goods;
        }
    }

    public Integer addGood(Good good){
        goodRepository.save(good);
        return good.getId();
    }

    public void editGood(Good good){
        goodRepository.save(good);
    }

    public void deleteGood(Integer id){
        goodRepository.delete(id);
    }

//    public Integer changeIsStocked(Integer  id, Boolean isStocked){
//        Good good = goodRepository.findOne(id);
//        good.setIsStoked(isStocked);
//        goodRepository.save(good);
//        return good.getId();
//    }

    public Iterable<Good> findAll(){
        Iterable<Good> actionPage = goodRepository.findAll();
        return actionPage;
    }

//    public Page<Good> findByIsStocked(Pageable pageable, Boolean isStocked){
//        Page<Good> goodPage = goodRepository.findByIsStocked(pageable, isStocked);
//        return goodPage;
//    }





}
