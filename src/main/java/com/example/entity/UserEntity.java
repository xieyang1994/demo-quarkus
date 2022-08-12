package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "table_user")
public class UserEntity {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    /**
     * 姓名
     */
    public String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserBaseEntity{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
