package cn.hang.crm.modules.crm.dao;

import cn.hang.crm.modules.crm.entity.po.CrmOpportunityPO;
import cn.hang.crm.modules.crm.entity.po.CrmOpportunityPOExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CrmOpportunityPOMapper {
    long countByExample(CrmOpportunityPOExample example);

    int deleteByExample(CrmOpportunityPOExample example);

    int deleteByPrimaryKey(Long opportunityId);

    int insert(CrmOpportunityPO record);

    int insertSelective(CrmOpportunityPO record);

    List<CrmOpportunityPO> selectByExample(CrmOpportunityPOExample example);

    CrmOpportunityPO selectByPrimaryKey(Long opportunityId);

    int updateByExampleSelective(@Param("record") CrmOpportunityPO record, @Param("example") CrmOpportunityPOExample example);

    int updateByExample(@Param("record") CrmOpportunityPO record, @Param("example") CrmOpportunityPOExample example);

    int updateByPrimaryKeySelective(CrmOpportunityPO record);

    int updateByPrimaryKey(CrmOpportunityPO record);
}