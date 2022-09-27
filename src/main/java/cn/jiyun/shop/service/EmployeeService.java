package cn.jiyun.shop.service;

import cn.jiyun.shop.entity.Employee;
import cn.jiyun.shop.entity.LoginForm;


/**
 * (Employee)表服务接口
 *
 * @author makejava
 * @since 2022-09-21 09:27:14
 */
public interface EmployeeService {
    /**
     * * 登录的接口
     * 通过用户名和密码查询单条数据
     *
     * @param loginForm 主键
     * @return 实例对象
     */
    Employee queryByPasswordAndName(LoginForm loginForm);

    /**
     * 通过ID查询单条数据
     *
     * @param eid 主键
     * @return 实例对象
     */
    Employee queryById(Integer eid);

    /**
     * 分页查询
     *
     * @param employee 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */


    /**
     * 新增数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    Employee insert(Employee employee);

    /**
     * 修改数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    Employee update(Employee employee);

    /**
     * 通过主键删除数据
     *
     * @param eid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer eid);

}
