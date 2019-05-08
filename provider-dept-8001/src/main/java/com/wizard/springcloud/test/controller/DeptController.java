package com.wizard.springcloud.test.test.controller;

import com.wizard.springcloud.test.test.entity.Dept;
import com.wizard.springcloud.test.test.service.DeptService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/dept")
@Api("部门模块")
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 添加部门
     * @param dept
     * @return boolean
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    /**
     * 按照id查找部门
     * @param id 部门id
     * @return Dept
     */
    @RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
    public Dept findById(@PathVariable Long id){
        return deptService.findById(id);
    }

    /**
     * 查找所有部门
     * @return List<Dept>
     */
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Dept> findAll(){
        return deptService.findAll();
    }
}
