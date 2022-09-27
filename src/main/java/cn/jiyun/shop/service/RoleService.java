package cn.jiyun.shop.service;

import cn.jiyun.shop.entity.Menu;
import cn.jiyun.shop.entity.Role;

import java.util.List;


/**
 * (Role)表服务接口
 *
 * @author makejava
 * @since 2022-09-21 09:27:21
 */
public interface RoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param roleid 主键
     * @return 实例对象
     */
    List<Role> findAllRole();

    /**
     * 分页查询
     *
     * @param role 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */


    /**
     * 新增数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    boolean insert(Role role, List<Menu> menus);

    /**
     * 修改数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    Role update(Role role);

    /**
     * 通过主键删除数据
     *
     * @param roleid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer roleid);

}
