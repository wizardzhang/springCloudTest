package com.wizard.springcloud.test.controller;

import com.wizard.springcloud.test.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consumer")
public class DeptConsumerController {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @Autowired
    private RestTemplate rest;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean addDept(Dept dept) {
        return rest.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept getById(@PathVariable Long id) {
        return rest.getForObject(REST_URL_PREFIX + "/dept/findById/" + id, Dept.class);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return rest.getForObject(REST_URL_PREFIX + "/dept/findAll", List.class);
    }
}
