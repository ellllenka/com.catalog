package com.catalog.controller;

import com.catalog.domain.Good;
import com.catalog.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class GoodController {
    @Autowired
    private GoodService goodService;

    @RequestMapping(value = "/good", method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Good> getGood(@RequestParam(name="id", required = false) Integer id){
        return goodService.getGood(id);
    }

    @RequestMapping(value = "/good", method = RequestMethod.POST)
    @ResponseBody
    public Integer addGood(@RequestBody Good good){
        return goodService.addGood(good);
    }

    @RequestMapping(value = "/good", method = RequestMethod.PUT)
    @ResponseBody
    public void editGood(@RequestBody Good good){
        goodService.editGood(good);
    }

    @RequestMapping(value = "/good/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteGood(@PathVariable Integer id){
        goodService.deleteGood(id);
    }

//    @RequestMapping(value = "/good/isStocked/{id}", method = RequestMethod.PUT)
//    @ResponseBody
//    public void changeIsStocked(@PathVariable Integer id, Boolean isStocked) {
//        goodService.changeIsStocked(id, isStocked);
//    }

//    @RequestMapping(value = "/goods", method = RequestMethod.GET)
//    @ResponseBody
//    public Page<Good> getGoods(Pageable pageable, Boolean isStocked) {
//        if (isStocked == null)
//            return goodService.findAll(pageable);
//        else
//            return goodService.findByIsStocked(pageable, isStocked);
//    }

//    @RequestMapping(value = "/goods", method = RequestMethod.GET)
//    @ResponseBody
//    public Iterable<Good> getGoods() {
//        return goodService.findAll();
//    }





}


