package com.wizard.springcloud.test.test.service;

import com.wizard.springcloud.test.test.entity.Dept;

import java.util.List;

public interface DeptService {

    /**
     * 添加部门
     * @param dept
     * @return boolean
     */
    boolean addDept(Dept dept);

    /**
     * 按照id查找部门
     * @param id 部门id
     * @return Dept
     */
    Dept findById(Long id);

    /**
     * 查找所有部门
     * @return List<Dept>
     */
    List<Dept> findAll();
}
