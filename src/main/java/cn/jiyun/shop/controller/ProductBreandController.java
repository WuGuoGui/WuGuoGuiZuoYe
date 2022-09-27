package cn.jiyun.shop.controller;

import cn.jiyun.shop.entity.ProductBreand;
import cn.jiyun.shop.service.ProductBreandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ProductBreand)表控制层
 *
 * @author makejava
 * @since 2022-09-21 09:27:16
 */
@RestController
@RequestMapping("shop/productBreand")
public class ProductBreandController {
    /**
     * 服务对象
     */
    @Resource
    private ProductBreandService productBreandService;

    /**
     * 分页查询
     *
     * @param productBreand 筛选条件
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
    public ResponseEntity<ProductBreand> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.productBreandService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param productBreand 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ProductBreand> add(ProductBreand productBreand) {
        return ResponseEntity.ok(this.productBreandService.insert(productBreand));
    }

    /**
     * 编辑数据
     *
     * @param productBreand 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ProductBreand> edit(ProductBreand productBreand) {
        return ResponseEntity.ok(this.productBreandService.update(productBreand));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.productBreandService.deleteById(id));
    }

}

