package com.zh.service;

import com.zh.mapper.InvitationMapper;
import com.zh.pojo.Invitation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InvitationServiceImpl implements InvitationService {
    @Autowired
    private InvitationMapper invitationMapper;
    @Override
    public List<Invitation> findInvitation() {
        return invitationMapper.findInvitation();
    }

    @Override
    public int deleteInvitation(int id) {
        return invitationMapper.deleteInvitation(id);
    }

    @Override
    public List<Invitation> findInvitationByTitle(String query) {
        return invitationMapper.findInvitationByTitle(query);
    }
}
