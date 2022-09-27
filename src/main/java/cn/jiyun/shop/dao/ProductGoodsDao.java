package cn.jiyun.shop.dao;

import cn.jiyun.shop.entity.ProductGoods;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ProductGoods)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-21 09:27:19
 */
public interface ProductGoodsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param goodsid 主键
     * @return 实例对象
     */
    ProductGoods queryById(Integer goodsid);

    /**
     * 查询指定行数据
     *
     * @param productGoods 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */


    /**
     * 统计总行数
     *
     * @param productGoods 查询条件
     * @return 总行数
     */
    long count(ProductGoods productGoods);

    /**
     * 新增数据
     *
     * @param productGoods 实例对象
     * @return 影响行数
     */
    int insert(ProductGoods productGoods);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductGoods> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProductGoods> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductGoods> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ProductGoods> entities);

    /**
     * 修改数据
     *
     * @param productGoods 实例对象
     * @return 影响行数
     */
    int update(ProductGoods productGoods);

    /**
     * 通过主键删除数据
     *
     * @param goodsid 主键
     * @return 影响行数
     */
    int deleteById(Integer goodsid);

}

