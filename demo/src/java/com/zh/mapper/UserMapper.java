package com.zh.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where username=#{username} and password=#{password}")
    public int login(@Param("username")String username,@Param("password")String password);

    @Insert("insert into user values(1,#{username},#{password},#{card},#{add})")
    public int add(@Param("username")String username,@Param("password")String password,@Param("card")String card,@Param("add")String add);
}
