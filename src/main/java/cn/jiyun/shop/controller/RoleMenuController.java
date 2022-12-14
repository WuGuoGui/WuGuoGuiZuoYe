package cn.jiyun.shop.controller;

import cn.jiyun.shop.entity.RoleMenu;
import cn.jiyun.shop.service.RoleMenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (RoleMenu)表控制层
 *
 * @author makejava
 * @since 2022-09-21 09:27:17
 */
@RestController
@RequestMapping("shop/roleMenu")
public class RoleMenuController {
    /**
     * 服务对象
     */
    @Resource
    private RoleMenuService roleMenuService;

    /**
     * 分页查询
     *
     * @param roleMenu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */

//    /**
//     * 通过主键查询单条数据
//     *
//     * @param id 主键
//     * @return 单条数据
//     */
//    @GetMapping("")
//    public ResponseEntity<RoleMenu> queryById() {
//        return roleMenuService.queryById();
//    }
//
//    /**
//     * 新增数据
//     *
//     * @param roleMenu 实体
//     * @return 新增结果
//     */
//    @PostMapping
//    public ResponseEntity<RoleMenu> add(RoleMenu roleMenu) {
//        return roleMenuService.insert(roleMenu);
//    }
//
//    /**
//     * 编辑数据
//     *
//     * @param roleMenu 实体
//     * @return 编辑结果
//     */
//    @PutMapping
//    public ResponseEntity<RoleMenu> edit(RoleMenu roleMenu) {
//        return roleMenuService.update(roleMenu);
//    }
//
//    /**
//     * 删除数据
//     *
//     * @param id 主键
//     * @return 删除是否成功
//     */
//    @RequestMapping("delete/{id}")
//    public ResponseEntity<Boolean> deleteById(@PathVariable("id")Integer id) {
//        return ResponseEntity.ok(this.roleMenuService.deleteById(id));
//    }

}

