package cn.jiyun.shop.controller;

import cn.jiyun.shop.entity.UserAddr;
import cn.jiyun.shop.service.UserAddrService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (UserAddr)表控制层
 *
 * @author makejava
 * @since 2022-09-21 09:27:23
 */
@RestController
@RequestMapping("shop/userAddr")
public class UserAddrController {
    /**
     * 服务对象
     */
    @Resource
    private UserAddrService userAddrService;

    /**
     * 分页查询
     *
     * @param userAddr 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<UserAddr> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.userAddrService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param userAddr 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<UserAddr> add(UserAddr userAddr) {
        return ResponseEntity.ok(this.userAddrService.insert(userAddr));
    }

    /**
     * 编辑数据
     *
     * @param userAddr 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<UserAddr> edit(UserAddr userAddr) {
        return ResponseEntity.ok(this.userAddrService.update(userAddr));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.userAddrService.deleteById(id));
    }

}

