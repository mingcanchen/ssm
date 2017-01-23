package com.ming.ssm.persist.dao;

import com.ming.ssm.model.CustomerInvoiceApplyPO;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerInvoiceApplyMapper {
    int deleteByPrimaryKey(Long sn);

    int insert(CustomerInvoiceApplyPO record);

    int insertSelective(CustomerInvoiceApplyPO record);

    CustomerInvoiceApplyPO selectByPrimaryKey(Long sn);

    int updateByPrimaryKeySelective(CustomerInvoiceApplyPO record);

    int updateByPrimaryKey(CustomerInvoiceApplyPO record);
}