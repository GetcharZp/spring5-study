package cn.getcharzp.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Value("user name 2")
    private String name;
    @Autowired
    private Dog dog;

    @Override
    public String toString() {
        return "User{" +
                "naem='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
