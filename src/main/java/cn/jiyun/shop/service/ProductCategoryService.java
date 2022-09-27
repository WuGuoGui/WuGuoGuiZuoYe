package cn.jiyun.shop.service;

import cn.jiyun.shop.entity.ProductCategory;


/**
 * (ProductCategory)表服务接口
 *
 * @author makejava
 * @since 2022-09-21 09:27:23
 */
public interface ProductCategoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param categoryid 主键
     * @return 实例对象
     */
    ProductCategory queryById(Integer categoryid);

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
    ProductCategory insert(ProductCategory productCategory);

    /**
     * 修改数据
     *
     * @param productCategory 实例对象
     * @return 实例对象
     */
    ProductCategory update(ProductCategory productCategory);

    /**
     * 通过主键删除数据
     *
     * @param categoryid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer categoryid);

}
