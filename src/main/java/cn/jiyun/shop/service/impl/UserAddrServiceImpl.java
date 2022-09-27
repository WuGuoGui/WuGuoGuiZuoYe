package cn.jiyun.shop.service.impl;

import cn.jiyun.shop.entity.UserAddr;
import cn.jiyun.shop.dao.UserAddrDao;
import cn.jiyun.shop.service.UserAddrService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (UserAddr)表服务实现类
 *
 * @author makejava
 * @since 2022-09-21 09:27:24
 */
@Service("userAddrService")
public class UserAddrServiceImpl implements UserAddrService {
    @Resource
    private UserAddrDao userAddrDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserAddr queryById(Integer id) {
        return this.userAddrDao.queryById(id);
    }

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
    @Override
    public UserAddr insert(UserAddr userAddr) {
        this.userAddrDao.insert(userAddr);
        return userAddr;
    }

    /**
     * 修改数据
     *
     * @param userAddr 实例对象
     * @return 实例对象
     */
    @Override
    public UserAddr update(UserAddr userAddr) {
        this.userAddrDao.update(userAddr);
        return this.queryById(userAddr.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userAddrDao.deleteById(id) > 0;
    }
}
