package com.wy.springcloud.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author
 * @create 2019-06-26 0:07
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable { // Dept(Entity) orm mysql->Dept(table) 表映射关系

    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname){
        super();
        this.dname = dname;
    }
}
