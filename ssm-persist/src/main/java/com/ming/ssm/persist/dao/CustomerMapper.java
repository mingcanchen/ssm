package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CustomerPO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by chenmingcan on 2017/1/18.
 */
@Repository
public interface CustomerMapper {

    CustomerPO getCustomerById(@Param("id") int id);
}
