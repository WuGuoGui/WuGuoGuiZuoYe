package cn.jiyun.shop.service;

import cn.jiyun.shop.entity.ProductGoods;

/**
 * (ProductGoods)表服务接口
 *
 * @author makejava
 * @since 2022-09-21 09:27:20
 */
public interface ProductGoodsService {

    /**
     * 通过ID查询单条数据
     *
     * @param goodsid 主键
     * @return 实例对象
     */
    ProductGoods queryById(Integer goodsid);

    /**
     * 分页查询
     *
     * @param productGoods 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */


    /**
     * 新增数据
     *
     * @param productGoods 实例对象
     * @return 实例对象
     */
    ProductGoods insert(ProductGoods productGoods);

    /**
     * 修改数据
     *
     * @param productGoods 实例对象
     * @return 实例对象
     */
    ProductGoods update(ProductGoods productGoods);

    /**
     * 通过主键删除数据
     *
     * @param goodsid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer goodsid);

}
