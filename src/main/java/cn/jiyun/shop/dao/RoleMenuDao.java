package cn.jiyun.shop.dao;

import cn.jiyun.shop.entity.RoleMenu;

/**
 * (RoleMenu)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-21 09:27:18
 */
public interface RoleMenuDao {


    /**
     * 查询角色及对应菜单
     *
     * @param roleid List<RoleMenu> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    RoleMenu queryMenuIdByRoleId(Integer roleid);



    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param roleMenu List<RoleMenu> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(RoleMenu roleMenu);



    /**
     * 通过主键删除数据
     *
     * @param  roleid 主键
     * @return 影响行数
     */
    int deleteRoleMenuByRoleId(Integer roleid);


    /**
     * 通过主键删除数据
     *
     * @param  menuid 主键
     * @return 影响行数
     */
    int deleteRoleMenuByMenuId(Integer menuid);

}

