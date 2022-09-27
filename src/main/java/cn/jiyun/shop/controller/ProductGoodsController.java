package cn.jiyun.shop.controller;

import cn.jiyun.shop.entity.ProductGoods;
import cn.jiyun.shop.service.ProductGoodsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ProductGoods)表控制层
 *
 * @author makejava
 * @since 2022-09-21 09:27:19
 */
@RestController
@RequestMapping("shop/productGoods")
public class ProductGoodsController {
    /**
     * 服务对象
     */
    @Resource
    private ProductGoodsService productGoodsService;

    /**
     * 分页查询
     *
     * @param productGoods 筛选条件
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
    public ResponseEntity<ProductGoods> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.productGoodsService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param productGoods 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ProductGoods> add(ProductGoods productGoods) {
        return ResponseEntity.ok(this.productGoodsService.insert(productGoods));
    }

    /**
     * 编辑数据
     *
     * @param productGoods 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ProductGoods> edit(ProductGoods productGoods) {
        return ResponseEntity.ok(this.productGoodsService.update(productGoods));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.productGoodsService.deleteById(id));
    }

}

