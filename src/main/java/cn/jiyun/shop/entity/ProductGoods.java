package cn.jiyun.shop.entity;

import java.io.Serializable;

/**
 * (ProductGoods)实体类
 *
 * @author makejava
 * @since 2022-09-21 09:27:19
 */
public class ProductGoods implements Serializable {
    private static final long serialVersionUID = -67941612930637056L;
    /**
     * id
     */
    private Integer goodsid;
    /**
     * 商品名称
     */
    private String goodsname;
    /**
     * 所属品牌
     */
    private Integer brandid;
    /**
     * 分类
     */
    private Integer category;
    /**
     * 价格
     */
    private String price;
    /**
     * 0是下架 1是上架
     */
    private Integer state;
    /**
     * 规格
     */
    private Object param;


    public Integer getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getBrandid() {
        return brandid;
    }

    public void setBrandid(Integer brandid) {
        this.brandid = brandid;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

}

