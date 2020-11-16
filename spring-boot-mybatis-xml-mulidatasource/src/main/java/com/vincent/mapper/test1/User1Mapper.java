package com.vincent.mapper.test1;

import com.vincent.model.User;

import java.util.List;

public interface User1Mapper {
    List<User> getAll();

    User getOne(Long id);

    void insert(User user);

    void update(User user);

    void delete(Long id);
}
