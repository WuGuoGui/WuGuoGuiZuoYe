package cn.jiyun.day10.service.impl;

import cn.jiyun.day10.entity.Student;
import cn.jiyun.day10.entity.Stuinfo;
import cn.jiyun.day10.dao.StuinfoDao;
import cn.jiyun.day10.service.StuinfoService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (Stuinfo)表服务实现类
 *
 * @author makejava
 * @since 2022-09-26 16:53:22
 */
@Service("stuinfoService")
public class StuinfoServiceImpl implements StuinfoService {
    @Resource
    private StuinfoDao stuinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param stuid 主键
     * @return 实例对象
     */
    @Override
    public Stuinfo queryById(Integer stuid) {
        return this.stuinfoDao.queryById(stuid);
    }

    /**
     * 分页查询
     *
     * @param stuinfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public List<Stuinfo> findAll() {
        return stuinfoDao.findAll();
    }

    /**
     * 新增数据
     *
     * @param stuinfo 实例对象
     * @return 实例对象
     */
    @Override
    public int add() {
        Stuinfo stuinfo = new Stuinfo();
        Student student = new Student();
        student.setStuName("11");
        student.setStuAge("11");
        student.setStuSex("11");
        student.setStuAddress("11");
        student.setStuPhone("11");
        stuinfo.setStudent(student);
       return stuinfoDao.add(stuinfo);
    }

    /**
     * 修改数据
     *
     * @param stuinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Stuinfo update(Stuinfo stuinfo) {
        this.stuinfoDao.update(stuinfo);
        return this.queryById(stuinfo.getStuid());
    }

    /**
     * 通过主键删除数据
     *
     * @param stuid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer stuid) {
        return this.stuinfoDao.deleteById(stuid) > 0;
    }
}
