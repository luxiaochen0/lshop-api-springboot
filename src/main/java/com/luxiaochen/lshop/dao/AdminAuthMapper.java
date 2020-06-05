package com.luxiaochen.lshop.dao;

import com.luxiaochen.lshop.entity.AdminAuth;
import com.luxiaochen.lshop.entity.AdminAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminAuthMapper {
    long countByExample(AdminAuthExample example);

    int deleteByExample(AdminAuthExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminAuth record);

    int insertSelective(AdminAuth record);

    List<AdminAuth> selectByExample(AdminAuthExample example);

    AdminAuth selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminAuth record, @Param("example") AdminAuthExample example);

    int updateByExample(@Param("record") AdminAuth record, @Param("example") AdminAuthExample example);

    int updateByPrimaryKeySelective(AdminAuth record);

    int updateByPrimaryKey(AdminAuth record);
}