package cn.jiyun.shop.controller;

import cn.jiyun.shop.entity.Menu;
import cn.jiyun.shop.entity.Role;
import cn.jiyun.shop.service.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Role)表控制层
 *
 * @author makejava
 * @since 2022-09-21 09:27:20
 */
@RestController
@RequestMapping("shop/role")
public class RoleController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    /**
     * 分页查询
     *
     * @param role 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("findAllRole")
    public Object findAllRole() {
        return roleService.findAllRole();
    }

    /**
     * 新增数据
     *
     * @param role 实体
     * @return 新增结果
     */
    @RequestMapping("addRole")
    public Object add(@RequestBody Role role, List<Menu> menus) {
        return roleService.insert(role,menus);
    }

    /**
     * 编辑数据
     *
     * @param role 实体
     * @return 编辑结果
     */
    @RequestMapping("updateRole")
    public Object edit(@RequestBody Role role) {
        return roleService.update(role);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @RequestMapping("deleteRole/{id}")
    public Object deleteById(@PathVariable("id") Integer id) {
        return roleService.deleteById(id);
    }

}

