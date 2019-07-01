package com.wy.springcloud.controller;

import com.wy.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author
 * @create 2019-06-27 0:25
 */
@RestController
@RequestMapping(value = "/consumer/dept")
public class DeptController_Consumer {

//    private static final String REST_URL_PERFIX = "http://localhost:8001";
    private static final String REST_URL_PERFIX = "http://microservicecloud-dept";


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PERFIX+"/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PERFIX+"/dept/get/"+id, Dept.class);
    }

    @RequestMapping(value = "/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PERFIX+"/dept/list", List.class);
    }

    @RequestMapping(value = "/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PERFIX+"/dept/discovery", Object.class);
    }
}

