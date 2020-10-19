package com.vincent.service;

import com.vincent.model.UserDetail;
import com.vincent.param.UserDetailParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserDetailService {

    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);
}
