package cn.jiyun.shop.service.impl;

import cn.jiyun.shop.entity.ProductCategory;
import cn.jiyun.shop.dao.ProductCategoryDao;
import cn.jiyun.shop.service.ProductCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (ProductCategory)表服务实现类
 *
 * @author makejava
 * @since 2022-09-21 09:27:23
 */
@Service("productCategoryService")
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Resource
    private ProductCategoryDao productCategoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param categoryid 主键
     * @return 实例对象
     */
    @Override
    public ProductCategory queryById(Integer categoryid) {
        return this.productCategoryDao.queryById(categoryid);
    }

    /**
     * 分页查询
     *
     * @param productCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */

    /**
     * 新增数据
     *
     * @param productCategory 实例对象
     * @return 实例对象
     */
    @Override
    public ProductCategory insert(ProductCategory productCategory) {
        this.productCategoryDao.insert(productCategory);
        return productCategory;
    }

    /**
     * 修改数据
     *
     * @param productCategory 实例对象
     * @return 实例对象
     */
    @Override
    public ProductCategory update(ProductCategory productCategory) {
        this.productCategoryDao.update(productCategory);
        return this.queryById(productCategory.getCategoryid());
    }

    /**
     * 通过主键删除数据
     *
     * @param categoryid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer categoryid) {
        return this.productCategoryDao.deleteById(categoryid) > 0;
    }
}
