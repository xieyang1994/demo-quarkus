package com.example.dao;

import com.example.entity.UserEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserBaseRepository implements PanacheRepository<UserEntity> {
}
