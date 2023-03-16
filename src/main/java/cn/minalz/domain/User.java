package cn.minalz.domain;

import lombok.Data;

/**
 * @author zhouwei
 * @date 2023/3/16 16:45
 */
@Data
public class User {

    private String name;

    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
