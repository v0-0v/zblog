package org.zguochun.category.entity;

import java.io.Serializable;

/**
 * project:zsblog
 * desc:类别表的实体类，存储类别表的类型。
 * author:zhengguocchun
 * date:2017/11/8
 */
public class Categories implements Serializable {
    //序列化
    private static final long serialVersionUID = 8436865409597060281L;

    private int cate_id;

    public int getCate_id() {
        return cate_id;
    }

    public void setCate_id(int cate_id) {
        this.cate_id = cate_id;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "cate_id=" + cate_id +
                ", categories='" + categories + '\'' +
                '}';
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    private String categories;

}
