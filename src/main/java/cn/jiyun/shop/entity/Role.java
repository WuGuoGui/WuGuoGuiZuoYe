package cn.jiyun.shop.entity;

import java.io.Serializable;

/**
 * (Role)实体类
 *
 * @author makejava
 * @since 2022-09-21 09:27:20
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 352702142524782340L;
    /**
     * id
     */
    private Integer roleid;
    /**
     * 角色名称
     */
    private String rolename;


    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

}

