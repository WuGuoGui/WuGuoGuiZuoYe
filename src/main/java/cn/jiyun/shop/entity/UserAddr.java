package cn.jiyun.shop.entity;

import java.io.Serializable;

/**
 * (UserAddr)实体类
 *
 * @author makejava
 * @since 2022-09-21 09:27:24
 */
public class UserAddr implements Serializable {
    private static final long serialVersionUID = 685118282470929188L;
    /**
     * id
     */
    private Integer id;
    /**
     * 收货地址
     */
    private String addr;
    /**
     * 收货人
     */
    private String addruser;
    /**
     * 收货人联系方式
     */
    private String addrphone;
    /**
     * 默认收获状态 1为默认 0为其他
     */
    private Integer addrstate;
    /**
     * 下单用户的id
     */
    private Integer userid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddruser() {
        return addruser;
    }

    public void setAddruser(String addruser) {
        this.addruser = addruser;
    }

    public String getAddrphone() {
        return addrphone;
    }

    public void setAddrphone(String addrphone) {
        this.addrphone = addrphone;
    }

    public Integer getAddrstate() {
        return addrstate;
    }

    public void setAddrstate(Integer addrstate) {
        this.addrstate = addrstate;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

}

