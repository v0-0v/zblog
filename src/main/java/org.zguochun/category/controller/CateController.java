package org.zguochun.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zguochun.category.entity.Categories;
import org.zguochun.category.service.CateService;

import java.util.ArrayList;
import java.util.List;

/**
 * project:zsblog
 * author:zhengguocchun
 * date:2017/11/8
 */
@Controller
@RequestMapping(path={"/catego"})
public class CateController {
    @Autowired
    private CateService cateService;

    private static final String TOWRITEARTICLE = "jsp/admin/html/write_article";
    @RequestMapping()
    public String toWriteArticle(Model model){
        List<Categories> categoriesList = new ArrayList<>();
        categoriesList = cateService.listAllCate();
        System.out.println(categoriesList+"---------------------------->");
        model.addAttribute("cateList",categoriesList);
        return TOWRITEARTICLE;
    }
}
