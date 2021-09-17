package com.example.demo;

import com.example.demo.Dog;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Map;

@Component
//整个使用配置文件
@ConfigurationProperties(prefix = "person")
//数据效验

public class Person {


    private String name;
    private Integer age;
    private Dog dog;
    private Map<Integer, Object> map;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", map=" + map +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Map<Integer, Object> getMap() {
        return map;
    }

    public void setMap(Map<Integer, Object> map) {
        this.map = map;
    }
}
