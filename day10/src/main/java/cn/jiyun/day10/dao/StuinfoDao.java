package cn.jiyun.day10.dao;

import cn.jiyun.day10.entity.Stuinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Stuinfo)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-26 16:53:21
 */
public interface StuinfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param stuid 主键
     * @return 实例对象
     */
    Stuinfo queryById(Integer stuid);

    /**
     * 查询指定行数据
     *
     * @param stuinfo 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */


    /**
     * 统计总行数
     *
     * @param stuinfo 查询条件
     * @return 总行数
     */
    long count(Stuinfo stuinfo);

    /**
     * 新增数据
     *
     * @param stuinfo 实例对象
     * @return 影响行数
     */
    int insert(Stuinfo stuinfo);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Stuinfo> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Stuinfo> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Stuinfo> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Stuinfo> entities);

    /**
     * 修改数据
     *
     * @param stuinfo 实例对象
     * @return 影响行数
     */
    int update(Stuinfo stuinfo);

    /**
     * 通过主键删除数据
     *
     * @param stuid 主键
     * @return 影响行数
     */
    int deleteById(Integer stuid);

    int add(Stuinfo stuinfo);

    List<Stuinfo> findAll();

}

