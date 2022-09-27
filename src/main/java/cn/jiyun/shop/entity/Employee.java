package cn.jiyun.shop.entity;

import java.io.Serializable;

/**
 * (Employee)实体类
 *
 * @author makejava
 * @since 2022-09-21 09:27:14
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 206063880073470150L;
    /**
     * 员工id
     */
    private Integer eid;
    /**
     * 员工姓名
     */
    private String ename;
    /**
     * 登录名
     */
    private String elogingname;
    /**
     * 密码
     */
    private String epassword;
    /**
     * 员工角色
     */
    private Integer eroleid;
    /**
     * 手机号
     */
    private String ephone;
    /**
     * 邮箱
     */
    private String eemail;

    private RoleMenu roleMenu;

    public RoleMenu getRoleMenu() {
        return roleMenu;
    }

    public void setRoleMenu(RoleMenu roleMenu) {
        this.roleMenu = roleMenu;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getElogingname() {
        return elogingname;
    }

    public void setElogingname(String elogingname) {
        this.elogingname = elogingname;
    }

    public String getEpassword() {
        return epassword;
    }

    public void setEpassword(String epassword) {
        this.epassword = epassword;
    }

    public Integer getEroleid() {
        return eroleid;
    }

    public void setEroleid(Integer eroleid) {
        this.eroleid = eroleid;
    }

    public String getEphone() {
        return ephone;
    }

    public void setEphone(String ephone) {
        this.ephone = ephone;
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail;
    }

}

