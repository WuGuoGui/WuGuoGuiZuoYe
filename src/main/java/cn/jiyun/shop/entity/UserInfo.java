package cn.jiyun.shop.entity;

import java.io.Serializable;

/**
 * (UserInfo)实体类
 *
 * @author makejava
 * @since 2022-09-21 09:27:22
 */
public class UserInfo implements Serializable {
    private static final long serialVersionUID = -36632121986525629L;
    /**
     * 用户ID
     */
    private Integer userid;
    /**
     * 昵称(中文)
     */
    private String username;
    /**
     * 站内Id（英文+数字）一般用来做账号登录
     */
    private String userkey;
    /**
     * 年龄
     */
    private Integer userage;
    /**
     * 地址
     */
    private String useraddress;
    /**
     * 性别
     */
    private Integer usersex;


    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserkey() {
        return userkey;
    }

    public void setUserkey(String userkey) {
        this.userkey = userkey;
    }

    public Integer getUserage() {
        return userage;
    }

    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

}

