package cn.jiyun.day10.controller;

import cn.jiyun.day10.entity.Stuinfo;
import cn.jiyun.day10.service.StuinfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Stuinfo)表控制层
 *
 * @author makejava
 * @since 2022-09-26 16:53:20
 */
@RestController
@RequestMapping("stuinfo")
public class StuinfoController {
    /**
     * 服务对象
     */
    @Resource
    private StuinfoService stuinfoService;

    /**
     * 分页查询
     *
     * @param stuinfo 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @RequestMapping("findAll")
    public Object queryByPage() {
        return stuinfoService.findAll();
    }



    /**
     * 新增数据
     *
     * @param stuinfo 实体
     * @return 新增结果
     */
    @RequestMapping("add")
    public Object add() {

        return stuinfoService.add();
    }

    /**
     * 编辑数据
     *
     * @param stuinfo 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Stuinfo> edit(Stuinfo stuinfo) {
        return ResponseEntity.ok(this.stuinfoService.update(stuinfo));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.stuinfoService.deleteById(id));
    }

}

