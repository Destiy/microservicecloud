package com.wy.springcloud.service;

import com.wy.springcloud.entities.Dept;

import java.util.List;

/**
 * @author
 * @create 2019-06-26 0:57
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
