package cn.jiyun.shop.service.impl;

import cn.jiyun.shop.entity.ProductGoods;
import cn.jiyun.shop.dao.ProductGoodsDao;
import cn.jiyun.shop.service.ProductGoodsService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (ProductGoods)表服务实现类
 *
 * @author makejava
 * @since 2022-09-21 09:27:20
 */
@Service("productGoodsService")
public class ProductGoodsServiceImpl implements ProductGoodsService {
    @Resource
    private ProductGoodsDao productGoodsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param goodsid 主键
     * @return 实例对象
     */
    @Override
    public ProductGoods queryById(Integer goodsid) {
        return this.productGoodsDao.queryById(goodsid);
    }

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
    @Override
    public ProductGoods insert(ProductGoods productGoods) {
        this.productGoodsDao.insert(productGoods);
        return productGoods;
    }

    /**
     * 修改数据
     *
     * @param productGoods 实例对象
     * @return 实例对象
     */
    @Override
    public ProductGoods update(ProductGoods productGoods) {
        this.productGoodsDao.update(productGoods);
        return this.queryById(productGoods.getGoodsid());
    }

    /**
     * 通过主键删除数据
     *
     * @param goodsid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer goodsid) {
        return this.productGoodsDao.deleteById(goodsid) > 0;
    }
}
