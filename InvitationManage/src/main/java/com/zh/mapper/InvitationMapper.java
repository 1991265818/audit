package com.zh.mapper;

import com.zh.pojo.Invitation;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InvitationMapper {
    @Select("select * from invitation;")
   public List<Invitation> findInvitation();

    @Delete("delete  from invitation where id=#{id}")
    public int deleteInvitation(@Param("id")int id);

    @Select("select * from invitation  where content like %#{query}%")
    public List<Invitation> findInvitationByTitle(@Param("query")String query);
}
