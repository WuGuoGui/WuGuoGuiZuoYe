package cn.jiyun.shop.controller;

import cn.jiyun.shop.entity.Employee;
import cn.jiyun.shop.entity.LoginForm;
import cn.jiyun.shop.entity.RoleMenu;
import cn.jiyun.shop.service.EmployeeService;
import cn.jiyun.shop.service.RoleMenuService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * ClassName: LoginController
 * Author:   WGG
 * Date:    2022-09-2022/9/21-16:37
 * Version: 1.0
 * Description:
 */
@RestController
@RequestMapping("shop")
public class LoginController {

    @Resource
    private RedisTemplate<String,String> redisTemplate;

    @Resource
    private EmployeeService employeeService;

    @Resource
    private RoleMenuService roleMenuService;
    /**
     * * 登录的接口
     * 通过用户名和密码查询单条数据
     *
     * @param loginForm 主键
     * @return 实例对象
     */
    @RequestMapping("login")
    public Object queryByPasswordAndName(@RequestBody LoginForm loginForm) {
        System.out.println(loginForm);
        //根据名称密码查找
        Employee emp = employeeService.queryByPasswordAndName(loginForm);
        //判断是否为空
        if (emp==null || emp.getEroleid()==null){
            return "false";
        }else {
            //不为空，存入redis
            redisTemplate.opsForValue().set(emp.getElogingname(),emp.getEpassword(),30000, TimeUnit.SECONDS);
            String password = redisTemplate.opsForValue().get(emp.getElogingname());
            return password;
            //根据角色id找出对应权限并返归前端
//            RoleMenu roleMenu = roleMenuService.queryMenuIdByRoleId(emp.getEroleid());
//            emp.setRoleMenu(roleMenu);
//            return emp;
        }
    }
}
