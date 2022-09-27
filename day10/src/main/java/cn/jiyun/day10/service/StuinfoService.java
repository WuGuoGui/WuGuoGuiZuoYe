package cn.jiyun.day10.service;

import cn.jiyun.day10.entity.Stuinfo;

import java.util.List;


/**
 * (Stuinfo)表服务接口
 *
 * @author makejava
 * @since 2022-09-26 16:53:22
 */
public interface StuinfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param stuid 主键
     * @return 实例对象
     */
    Stuinfo queryById(Integer stuid);

    /**
     * 分页查询
     *
     * @param stuinfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    List<Stuinfo> findAll();

    /**
     * 新增数据
     *
     * @param stuinfo 实例对象
     * @return 实例对象
     */
    int add();

    /**
     * 修改数据
     *
     * @param stuinfo 实例对象
     * @return 实例对象
     */
    Stuinfo update(Stuinfo stuinfo);

    /**
     * 通过主键删除数据
     *
     * @param stuid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer stuid);

}
