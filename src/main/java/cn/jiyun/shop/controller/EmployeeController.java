package cn.jiyun.shop.controller;

import cn.jiyun.shop.entity.Employee;
import cn.jiyun.shop.service.EmployeeService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Employee)表控制层
 *
 * @author makejava
 * @since 2022-09-21 09:27:13
 */
@RestController
@RequestMapping("shop/employee")
public class EmployeeController {
    /**
     * 服务对象
     */
    @Resource
    private EmployeeService employeeService;

    /**
     * 分页查询
     *
     * @param employee 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @RequestMapping("{id}")
    public Object queryById(@PathVariable("id") Integer id) {
        return employeeService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param employee 实体
     * @return 新增结果
     */
    @RequestMapping("addEmp")
    public Object add(Employee employee) {
        return employeeService.insert(employee);
    }

    /**
     * 编辑数据
     *
     * @param employee 实体
     * @return 编辑结果
     */
    @RequestMapping("updateEmp")
    public Object edit(Employee employee) {
        return employeeService.update(employee);
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @RequestMapping("deleteEmp/{id}")
    public Object deleteById(@PathVariable("id") Integer id) {
        return employeeService.deleteById(id);
    }

}

