package cn.jiyun.shop.entity;

import java.io.Serializable;

/**
 * (ProductBreand)实体类
 *
 * @author makejava
 * @since 2022-09-21 09:27:17
 */
public class ProductBreand implements Serializable {
    private static final long serialVersionUID = 291138215186912398L;
    /**
     * id
     */
    private Integer brandid;
    /**
     * 品牌名称
     */
    private String brandname;
    /**
     * logo
     */
    private String brandlogo;
    /**
     * 品牌故事
     */
    private String brandstory;
    /**
     * 品牌描述
     */
    private String brandinfo;


    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getBrandlogo() {
        return brandlogo;
    }

    public void setBrandlogo(String brandlogo) {
        this.brandlogo = brandlogo;
    }

    public String getBrandstory() {
        return brandstory;
    }

    public void setBrandstory(String brandstory) {
        this.brandstory = brandstory;
    }

    public String getBrandinfo() {
        return brandinfo;
    }

    public void setBrandinfo(String brandinfo) {
        this.brandinfo = brandinfo;
    }

}

