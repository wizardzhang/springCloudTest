package com.wizard.springcloud.test.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    /**
     * 部门编号,主键
     */
    private Long deptno;

    /***
     * 部门名称
     */
    private String dname;

    /**
     * 部门所在位置
     */
    private String loc;

    /**
     * 来自哪个数据库，应为微服务架构可以一个服务一个数据库
     */
    private String db_source;
}
