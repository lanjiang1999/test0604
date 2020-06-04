package com.jt.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)    // 赋值时可以连续set user.setId().setName().
@TableName(value = "user")  // 表名与对象名称一致，可以省略不写
public class User {

    @TableId(type = IdType.AUTO)           // 主键自增
    private Integer id;
    //@TableField(value = "name")       此注解用于当属性与字段名字不同时，无法实现自动映射，手动配置
    private String name;
    private Integer age;
    private String sex;

}
