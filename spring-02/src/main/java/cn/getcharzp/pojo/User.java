package cn.getcharzp.pojo;

import java.util.*;

public class User {
    private Integer id;
    private String name;
    private String[] arr;
    private List<String> list;
    private Set<String> set;
    private Map<String, String> map;
    private Other other;
    private Properties properties;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", arr=" + Arrays.toString(arr) +
                ", list=" + list +
                ", set=" + set +
                ", map=" + map +
                ", other=" + other +
                ", properties=" + properties +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
