package com.zh.mapper;

import com.zh.pojo.ReplyDetail;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReplyDetailMapper {
    @Select("select * from replyDeail where invId=#{invId}")
    public List<ReplyDetail> findReplyDetail(int invId);

    @Insert("insert into replyDeail values(#{invId},#{content},#{author},#{createDate})")
    public int add(ReplyDetail replyDetail);
}
