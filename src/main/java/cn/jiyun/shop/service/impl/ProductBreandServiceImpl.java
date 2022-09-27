package cn.jiyun.shop.service.impl;

import cn.jiyun.shop.entity.ProductBreand;
import cn.jiyun.shop.dao.ProductBreandDao;
import cn.jiyun.shop.service.ProductBreandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (ProductBreand)表服务实现类
 *
 * @author makejava
 * @since 2022-09-21 09:27:17
 */
@Service("productBreandService")
public class ProductBreandServiceImpl implements ProductBreandService {
    @Resource
    private ProductBreandDao productBreandDao;

    /**
     * 通过ID查询单条数据
     *
     * @param brandid 主键
     * @return 实例对象
     */
    @Override
    public ProductBreand queryById(Integer brandid) {
        return this.productBreandDao.queryById(brandid);
    }

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
    @Override
    public ProductBreand insert(ProductBreand productBreand) {
        this.productBreandDao.insert(productBreand);
        return productBreand;
    }

    /**
     * 修改数据
     *
     * @param productBreand 实例对象
     * @return 实例对象
     */
    @Override
    public ProductBreand update(ProductBreand productBreand) {
        this.productBreandDao.update(productBreand);
        return this.queryById(productBreand.getBrandid());
    }

    /**
     * 通过主键删除数据
     *
     * @param brandid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer brandid) {
        return this.productBreandDao.deleteById(brandid) > 0;
    }
}
