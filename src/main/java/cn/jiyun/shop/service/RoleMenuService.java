package cn.jiyun.shop.service;

import cn.jiyun.shop.entity.RoleMenu;


/**
 * (RoleMenu)表服务接口
 *
 * @author makejava
 * @since 2022-09-21 09:27:18
 */
public interface RoleMenuService {

    /**
     * 查询角色及对应菜单
     *
     * @param roleid List<RoleMenu> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    RoleMenu queryMenuIdByRoleId(Integer roleid);

    /**
     * 新增数据
     *
     * @param roleMenu 实例对象
     * @return 实例对象
     */
    RoleMenu insertOrUpdateBatch(RoleMenu roleMenu);

    /**
     * 通过主键删除数据
     *
     * @param  roleid 主键
     * @return 是否成功
     */
    boolean deleteRoleMenuByRoleId(Integer roleid);

}
