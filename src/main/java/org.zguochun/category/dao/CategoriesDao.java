package org.zguochun.category.dao;

import org.springframework.stereotype.Repository;
import org.zguochun.category.entity.Categories;

import java.util.List;
@Repository
public interface CategoriesDao {
    public List<Categories> listAll();
}
