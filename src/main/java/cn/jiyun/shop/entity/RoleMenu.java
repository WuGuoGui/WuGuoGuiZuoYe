package cn.jiyun.shop.entity;

import lombok.*;

import java.io.Serializable;
import java.util.List;

/**
 * (RoleMenu)实体类
 *
 * @author makejava
 * @since 2022-09-21 09:27:18
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RoleMenu implements Serializable {
    private static final long serialVersionUID = 446573676663179763L;
    /**
     * 角色
     */
    private Role roleid;
    /**
     * 角色关联的菜单集合
     */
    private List<Menu> menus;



}

