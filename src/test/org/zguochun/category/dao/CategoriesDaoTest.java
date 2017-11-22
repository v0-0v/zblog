package org.zguochun.category.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zguochun.category.entity.Categories;
import org.zguochun.user.entity.User;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class CategoriesDaoTest {
    @Resource
    CategoriesDao categoriesDao;
    @Test
    public void listAll() throws Exception {
        List<Categories> list=  new ArrayList<>();
        list = categoriesDao.listAll();
        System.out.println(list+"---------------->");
    }

}