package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CustomerPO;
import com.ming.ssm.model.CustomerVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenmingcan on 2017/1/18.
 */
@Repository
public interface CustomerMapper {

    CustomerPO getCustomerById(@Param("id") String id);

    List<CustomerPO> getCustomerList( CustomerVO customerVO);

}
