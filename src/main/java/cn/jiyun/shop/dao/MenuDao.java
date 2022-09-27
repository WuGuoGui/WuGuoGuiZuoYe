package cn.jiyun.shop.dao;

import cn.jiyun.shop.entity.Menu;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Menu)表数据库访问层
 *
 * @author makejava
 * @since 2022-09-21 09:27:15
 */
public interface MenuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param menuid 主键
     * @return 实例对象
     */
    Menu queryById(Integer menuid);


    /**
     * 通过查询数据
     *
     * @return 实例对象
     */
    List<Menu> queryMenuList();




    /**
     * 新增数据
     *
     * @param menu 实例对象
     * @return 影响行数
     */
    int insert(Menu menu);


    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Menu> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Menu> entities);

    /**
     * 修改数据
     *
     * @param menu 实例对象
     * @return 影响行数
     */
    int update(Menu menu);

    /**
     * 通过主键删除数据
     *
     * @param menuid 主键
     * @return 影响行数
     */
    int deleteById(Integer menuid);


}

