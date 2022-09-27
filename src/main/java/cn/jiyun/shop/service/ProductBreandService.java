package cn.jiyun.shop.service;

import cn.jiyun.shop.entity.ProductBreand;


/**
 * (ProductBreand)表服务接口
 *
 * @author makejava
 * @since 2022-09-21 09:27:17
 */
public interface ProductBreandService {

    /**
     * 通过ID查询单条数据
     *
     * @param brandid 主键
     * @return 实例对象
     */
    ProductBreand queryById(Integer brandid);

    /**
     * 分页查询
     *
     * @param productBreand 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */


    /**
     * 新增数据
     *
     * @param productBreand 实例对象
     * @return 实例对象
     */
    ProductBreand insert(ProductBreand productBreand);

    /**
     * 修改数据
     *
     * @param productBreand 实例对象
     * @return 实例对象
     */
    ProductBreand update(ProductBreand productBreand);

    /**
     * 通过主键删除数据
     *
     * @param brandid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer brandid);

}
