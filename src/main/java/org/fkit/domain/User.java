package org.fkit.domain;

/**
 * Created by tao on 2017/7/28.
 */
public class User {
    //用户标识
    private Integer id;
    //用户姓名
    private String name;
    //用户性别
    private String sex;
    //用户年龄
    private Integer age;
    //无参数构造器
    public User(){
        super();
    }
    //有参数构造器
    public User(String name,String sex,Integer age){
        super();
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
