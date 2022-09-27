package cn.jiyun.shop.service;

import cn.jiyun.shop.entity.Menu;

import java.util.List;

/**
 * (Menu)表服务接口
 *
 * @author makejava
 * @since 2022-09-21 09:27:16
 */
public interface MenuService {

    /**
     * 通过查询数据
     * @return 实例对象
     */
    List<Menu> queryMenuList();



    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu insert(Menu menu);

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 实例对象
     */
    Menu update(Menu menu);

    /**
     * 通过主键删除数据
     *
     * @param menuid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer menuid);

    /**
     * 通过ID查询单条数据
     *
     * @param menuid 主键
     * @return 实例对象
     */
    Menu queryById(Integer menuid);
}
