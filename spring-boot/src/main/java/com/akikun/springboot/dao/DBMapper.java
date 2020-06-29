package com.akikun.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DBMapper {

    @Select("select table_name from information_schema.tables")
    List<String> selectAllTableNames();

}
