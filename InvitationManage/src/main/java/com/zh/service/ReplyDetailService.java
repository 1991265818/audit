package com.zh.service;

import com.zh.pojo.ReplyDetail;

import java.util.List;

public interface ReplyDetailService {
    public List<ReplyDetail> findReplyDetail(int invId);

    public int add(ReplyDetail replyDetail);
}
