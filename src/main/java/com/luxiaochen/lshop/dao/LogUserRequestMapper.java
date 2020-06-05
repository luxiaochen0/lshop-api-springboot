package com.luxiaochen.lshop.dao;

import com.luxiaochen.lshop.entity.LogUserRequest;
import com.luxiaochen.lshop.entity.LogUserRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogUserRequestMapper {
    long countByExample(LogUserRequestExample example);

    int deleteByExample(LogUserRequestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LogUserRequest record);

    int insertSelective(LogUserRequest record);

    List<LogUserRequest> selectByExample(LogUserRequestExample example);

    LogUserRequest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogUserRequest record, @Param("example") LogUserRequestExample example);

    int updateByExample(@Param("record") LogUserRequest record, @Param("example") LogUserRequestExample example);

    int updateByPrimaryKeySelective(LogUserRequest record);

    int updateByPrimaryKey(LogUserRequest record);
}