package cn.jiyun.shop.dao;

import cn.jiyun.shop.entity.UserAddr;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (UserAddr)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-21 09:27:24
 */
public interface UserAddrDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAddr queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param userAddr 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */


    /**
     * 统计总行数
     *
     * @param userAddr 查询条件
     * @return 总行数
     */
    long count(UserAddr userAddr);

    /**
     * 新增数据
     *
     * @param userAddr 实例对象
     * @return 影响行数
     */
    int insert(UserAddr userAddr);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAddr> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<UserAddr> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<UserAddr> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<UserAddr> entities);

    /**
     * 修改数据
     *
     * @param userAddr 实例对象
     * @return 影响行数
     */
    int update(UserAddr userAddr);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

