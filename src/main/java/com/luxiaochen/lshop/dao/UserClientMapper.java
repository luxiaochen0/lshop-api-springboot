package com.luxiaochen.lshop.dao;

import com.luxiaochen.lshop.entity.UserClient;
import com.luxiaochen.lshop.entity.UserClientExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserClientMapper {
    long countByExample(UserClientExample example);

    int deleteByExample(UserClientExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserClient record);

    int insertSelective(UserClient record);

    List<UserClient> selectByExample(UserClientExample example);

    UserClient selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserClient record, @Param("example") UserClientExample example);

    int updateByExample(@Param("record") UserClient record, @Param("example") UserClientExample example);

    int updateByPrimaryKeySelective(UserClient record);

    int updateByPrimaryKey(UserClient record);
}