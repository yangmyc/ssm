package com.myc.dao;

import com.myc.bean.Emplyee;
import com.myc.bean.EmplyeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmplyeeMapper {
    long countByExample(EmplyeeExample example);

    int deleteByExample(EmplyeeExample example);

    int deleteByPrimaryKey(Integer empId);

    int insert(Emplyee record);

    int insertSelective(Emplyee record);

    List<Emplyee> selectByExample(EmplyeeExample example);

    Emplyee selectByPrimaryKey(Integer empId);

    int updateByExampleSelective(@Param("record") Emplyee record, @Param("example") EmplyeeExample example);

    int updateByExample(@Param("record") Emplyee record, @Param("example") EmplyeeExample example);

    int updateByPrimaryKeySelective(Emplyee record);

    int updateByPrimaryKey(Emplyee record);
}