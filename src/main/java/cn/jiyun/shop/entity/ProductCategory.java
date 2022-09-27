package cn.jiyun.shop.entity;

import java.io.Serializable;

/**
 * (ProductCategory)实体类
 *
 * @author makejava
 * @since 2022-09-21 09:27:23
 */
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = -39797803878038452L;
    /**
     * id
     */
    private Integer categoryid;
    /**
     * 分类名称
     */
    private String categoryname;


    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

}

