package org.zguochun.category.service;

import org.springframework.stereotype.Service;
import org.zguochun.category.entity.Categories;

import java.util.List;
public interface CateService {
    public List<Categories> listAllCate();
}
