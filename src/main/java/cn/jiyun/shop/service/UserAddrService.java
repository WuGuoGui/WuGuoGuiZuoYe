package cn.jiyun.shop.service;

import cn.jiyun.shop.entity.UserAddr;


/**
 * (UserAddr)表服务接口
 *
 * @author makejava
 * @since 2022-09-21 09:27:24
 */
public interface UserAddrService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAddr queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userAddr 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */


    /**
     * 新增数据
     *
     * @param userAddr 实例对象
     * @return 实例对象
     */
    UserAddr insert(UserAddr userAddr);

    /**
     * 修改数据
     *
     * @param userAddr 实例对象
     * @return 实例对象
     */
    UserAddr update(UserAddr userAddr);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
