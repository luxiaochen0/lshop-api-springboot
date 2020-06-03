package com.luxiaochen.demo.dao;

import com.luxiaochen.demo.entity.Point;
import com.luxiaochen.demo.entity.PointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PointMapper {
    long countByExample(PointExample example);

    int deleteByExample(PointExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Point record);

    int insertSelective(Point record);

    List<Point> selectByExample(PointExample example);

    Point selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Point record, @Param("example") PointExample example);

    int updateByExample(@Param("record") Point record, @Param("example") PointExample example);

    int updateByPrimaryKeySelective(Point record);

    int updateByPrimaryKey(Point record);
}