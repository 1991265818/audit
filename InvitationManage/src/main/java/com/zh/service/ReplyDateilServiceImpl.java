package com.zh.service;

import com.zh.mapper.ReplyDetailMapper;
import com.zh.pojo.ReplyDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReplyDateilServiceImpl implements ReplyDetailService {
    @Autowired
    private ReplyDetailMapper replyDetailMapper;
    @Override
    public List<ReplyDetail> findReplyDetail(int invId) {
        return replyDetailMapper.findReplyDetail(invId);
    }

    @Override
    public int add(ReplyDetail replyDetail) {
        return replyDetailMapper.add(replyDetail);
    }
}
