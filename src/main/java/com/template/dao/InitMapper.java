package com.template.dao;

import com.template.bean.Init;
import com.template.bean.InitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InitMapper {
    long countByExample(InitExample example);

    int deleteByExample(InitExample example);

    int deleteByPrimaryKey(Integer initId);

    int insert(Init record);

    int insertSelective(Init record);

    List<Init> selectByExample(InitExample example);

    Init selectByPrimaryKey(Integer initId);

    int updateByExampleSelective(@Param("record") Init record, @Param("example") InitExample example);

    int updateByExample(@Param("record") Init record, @Param("example") InitExample example);

    int updateByPrimaryKeySelective(Init record);

    int updateByPrimaryKey(Init record);
}