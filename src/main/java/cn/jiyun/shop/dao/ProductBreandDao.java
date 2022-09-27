package cn.jiyun.shop.dao;

import cn.jiyun.shop.entity.ProductBreand;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (ProductBreand)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-21 09:27:16
 */
public interface ProductBreandDao {

    /**
     * 通过ID查询单条数据
     *
     * @param brandid 主键
     * @return 实例对象
     */
    ProductBreand queryById(Integer brandid);

    /**
     * 查询指定行数据
     *
     * @param productBreand 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */


    /**
     * 统计总行数
     *
     * @param productBreand 查询条件
     * @return 总行数
     */
    long count(ProductBreand productBreand);

    /**
     * 新增数据
     *
     * @param productBreand 实例对象
     * @return 影响行数
     */
    int insert(ProductBreand productBreand);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductBreand> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProductBreand> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductBreand> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ProductBreand> entities);

    /**
     * 修改数据
     *
     * @param productBreand 实例对象
     * @return 影响行数
     */
    int update(ProductBreand productBreand);

    /**
     * 通过主键删除数据
     *
     * @param brandid 主键
     * @return 影响行数
     */
    int deleteById(Integer brandid);

}

