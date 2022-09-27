package cn.jiyun.shop.service.impl;

import cn.jiyun.shop.dao.RoleMenuDao;
import cn.jiyun.shop.entity.Menu;
import cn.jiyun.shop.entity.Role;
import cn.jiyun.shop.dao.RoleDao;
import cn.jiyun.shop.entity.RoleMenu;
import cn.jiyun.shop.service.RoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Role)表服务实现类
 *
 * @author makejava
 * @since 2022-09-21 09:27:21
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleDao roleDao;

    @Resource
    private RoleMenuDao roleMenuDao;

    /**
     * 查询数据
     *
     * @return 实例对象
     */
    @Override
    public List<Role> findAllRole() {
        return roleDao.findAllRole();
    }

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
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public boolean insert(Role role, List<Menu> menus) {
        int a = roleDao.insert(role);
        RoleMenu roleMenu = new RoleMenu();
        roleMenu.setRoleid(role);
        roleMenu.setMenus(menus);
        int b = roleMenuDao.insertOrUpdateBatch(roleMenu);
        return a*b>0;
    }

    /**
     * 修改数据
     *
     * @param role 实例对象
     * @return 实例对象
     */
    @Override
    public Role update(Role role) {
        roleDao.update(role);
        return roleDao.queryById(role.getRoleid());
    }

    /**
     * 通过主键删除数据
     *
     * @param roleid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer roleid) {
        return roleDao.deleteById(roleid) > 0;
    }
}
