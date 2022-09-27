package cn.jiyun.shop.entity;

import java.io.Serializable;

/**
 * (Menu)实体类
 *
 * @author makejava
 * @since 2022-09-21 09:27:15
 */
public class Menu implements Serializable {
    private static final long serialVersionUID = 955986983679760568L;
    /**
     * id
     */
    private Integer menuid;
    /**
     * 菜单名称
     */
    private String menuname;
    /**
     * url
     */
    private String menupath;


    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenupath() {
        return menupath;
    }

    public void setMenupath(String menupath) {
        this.menupath = menupath;
    }

}

