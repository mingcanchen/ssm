package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CustomerInvoicePO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerInvoiceMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(CustomerInvoicePO record);

    int insertSelective(CustomerInvoicePO record);

    CustomerInvoicePO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(CustomerInvoicePO record);

    int updateByPrimaryKey(CustomerInvoicePO record);
}