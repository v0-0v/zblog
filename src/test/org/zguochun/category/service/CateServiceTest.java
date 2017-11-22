package org.zguochun.category.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zguochun.category.entity.Categories;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"})
public class CateServiceTest {
    @Autowired
    private CateService cateService;
    @Test
    public void listAllCate() throws Exception {
        List<Categories> list = new ArrayList<>();
        list = cateService.listAllCate();
        System.out.println(list+"------------------>>>>>>");
    }

}