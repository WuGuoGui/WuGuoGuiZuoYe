package cn.jiyun.shop.service.impl;

import cn.jiyun.shop.dao.RoleMenuDao;
import cn.jiyun.shop.entity.Menu;
import cn.jiyun.shop.dao.MenuDao;
import cn.jiyun.shop.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Menu)表服务实现类
 *
 * @author makejava
 * @since 2022-09-21 09:27:16
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuDao menuDao;

    @Resource
    private RoleMenuDao roleMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param menuid 主键
     * @return 实例对象
     */
    @Override
    public List<Menu> queryMenuList() {
        return menuDao.queryMenuList();
    }



    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu insert(Menu menu) {
        menuDao.insert(menu);
        return menu;
    }

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    @Override
    public Menu update(Menu menu) {
        menuDao.update(menu);
        return menuDao.queryById(menu.getMenuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param menuid 主键
     * @return 是否成功
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public boolean deleteById(Integer menuid) throws RuntimeException {
        int a = roleMenuDao.deleteRoleMenuByMenuId(menuid);
        int b = menuDao.deleteById(menuid);
        return a*b>0;
    }
    /**
     * 通过ID查询单条数据
     *
     * @param menuid 主键
     * @return 实例对象
     */
    @Override
    public Menu queryById(Integer menuid) {
        return menuDao.queryById(menuid);
    }
}
