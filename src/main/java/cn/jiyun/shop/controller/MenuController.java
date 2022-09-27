package cn.jiyun.shop.controller;

import cn.jiyun.shop.entity.Menu;
import cn.jiyun.shop.service.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Menu)表控制层
 *
 * @author makejava
 * @since 2022-09-21 09:27:15
 */
@RestController
@RequestMapping("shop/menu")
public class MenuController {
    /**
     * 服务对象
     */
    @Resource
    private MenuService menuService;



    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("{id}")
    public Object queryById(@PathVariable("id") Integer id) {
        return menuService.queryById(id);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("queryMenuList")
    public Object queryMenuList() {
        return menuService.queryMenuList();
    }

    /**
     * 新增数据
     *
     * @param menu 实体
     * @return 新增结果
     */
    @RequestMapping("addMenu")
    public Object add(@RequestBody Menu menu) {
        return menuService.insert(menu);
    }

    /**
     * 编辑数据
     *
     * @param menu 实体
     * @return 编辑结果
     */
    @RequestMapping("updateMenu")
    public Object edit(@RequestBody Menu menu) {
        return menuService.update(menu);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @RequestMapping("deleteMenu/{id}")
    public Object deleteById(@PathVariable("id") Integer id) {
        boolean flag = false;
        try {
            flag = menuService.deleteById(id);
        }catch (Exception e){

        }
        return flag;
    }

}

