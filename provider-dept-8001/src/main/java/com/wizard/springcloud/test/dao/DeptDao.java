package com.wizard.springcloud.test.test.dao;


import com.wizard.springcloud.test.test.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {

    /**
     * 添加部门
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 按照id查找部门
     * @param id 部门id
     * @return
     */
    Dept findById(Long id);

    /**
     * 查找所有部门
     * @return
     */
    List<Dept> findAll();

}
