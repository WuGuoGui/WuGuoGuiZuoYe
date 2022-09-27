package cn.jiyun.shop.service.impl;

import cn.jiyun.shop.entity.RoleMenu;
import cn.jiyun.shop.dao.RoleMenuDao;
import cn.jiyun.shop.service.RoleMenuService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (RoleMenu)表服务实现类
 *
 * @author makejava
 * @since 2022-09-21 09:27:19
 */
@Service("roleMenuService")
public class RoleMenuServiceImpl implements RoleMenuService {
    @Resource
    private RoleMenuDao roleMenuDao;


    @Override
    public RoleMenu queryMenuIdByRoleId(Integer roleid) {
        return roleMenuDao.queryMenuIdByRoleId(roleid);
    }

    /**
     * 新增数据
     *
     * @param roleMenu 实例对象
     * @return 实例对象
     */
    @Override
    public RoleMenu insertOrUpdateBatch(RoleMenu roleMenu) {
        this.roleMenuDao.insertOrUpdateBatch(roleMenu);
        return roleMenu;
    }


    /**
     * 通过主键删除数据
     *
     * @param  roleid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteRoleMenuByRoleId(Integer roleid) {
        return this.roleMenuDao.deleteRoleMenuByRoleId(roleid) > 0;
    }
}
