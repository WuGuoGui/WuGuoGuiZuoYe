package cn.jiyun.shop.service.impl;

import cn.jiyun.shop.entity.Employee;
import cn.jiyun.shop.dao.EmployeeDao;
import cn.jiyun.shop.entity.LoginForm;
import cn.jiyun.shop.service.EmployeeService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

/**
 * (Employee)表服务实现类
 *
 * @author makejava
 * @since 2022-09-21 09:27:15
 */
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDao employeeDao;

    /**
     * 登录的接口
     * 通过用户名和密码查询单条数据
     *
     * @param loginForm 主键
     * @return 实例对象
     */
    @Override
    public Employee queryByPasswordAndName(LoginForm loginForm) {
        return employeeDao.queryByPasswordAndName(loginForm);
    }

    /**
     * 通过ID查询单条数据
     *
     * @param eid 主键
     * @return 实例对象
     */
    @Override
    public Employee queryById(Integer eid) {
        return this.employeeDao.queryById(eid);
    }

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
    @Override
    public Employee insert(Employee employee) {
        this.employeeDao.insert(employee);
        return employee;
    }

    /**
     * 修改数据
     *
     * @param employee 实例对象
     * @return 实例对象
     */
    @Override
    public Employee update(Employee employee) {
        this.employeeDao.update(employee);
        return this.queryById(employee.getEid());
    }

    /**
     * 通过主键删除数据
     *
     * @param eid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer eid) {
        return this.employeeDao.deleteById(eid) > 0;
    }
}
