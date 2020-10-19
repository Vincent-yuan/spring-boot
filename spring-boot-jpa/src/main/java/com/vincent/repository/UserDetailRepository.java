package com.vincent.repository;

import com.vincent.model.UserDetail;
import com.vincent.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDetailRepository extends JpaSpecificationExecutor,JpaRepository<UserDetail,Long> {

    UserDetail findByHobby(String hobby);

    @Query("select u.userName as userName,u.email as email,d.introduction as introduction,d.hobby as hobby from User u ,UserDetail d " +
            "where u.id=d.id and d.hobby=?1 ")
    List<UserInfo> findUserInfo(String hobby);
}
