package com.luxiaochen.demo.dao;

import com.luxiaochen.demo.entity.AdminClient;
import com.luxiaochen.demo.entity.AdminClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminClientMapper {
    long countByExample(AdminClientExample example);

    int deleteByExample(AdminClientExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminClient record);

    int insertSelective(AdminClient record);

    List<AdminClient> selectByExample(AdminClientExample example);

    AdminClient selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminClient record, @Param("example") AdminClientExample example);

    int updateByExample(@Param("record") AdminClient record, @Param("example") AdminClientExample example);

    int updateByPrimaryKeySelective(AdminClient record);

    int updateByPrimaryKey(AdminClient record);
}