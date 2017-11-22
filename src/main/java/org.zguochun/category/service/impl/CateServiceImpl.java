package org.zguochun.category.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zguochun.category.dao.CategoriesDao;
import org.zguochun.category.entity.Categories;
import org.zguochun.category.service.CateService;

import java.util.List;

/**
 * project:zsblog
 * author:zhengguocchun
 * date:2017/11/8
 */
@Service
public class CateServiceImpl implements CateService {
    @Autowired
    private CategoriesDao categoriesDao;

    @Override
    public List<Categories> listAllCate() {
        return categoriesDao.listAll();
    }
}
