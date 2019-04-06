package com.zh.service;

import com.zh.pojo.Invitation;

import java.util.List;

public interface InvitationService {
    public List<Invitation> findInvitation();

    public int deleteInvitation(int id);

    public List<Invitation> findInvitationByTitle(String query);
}
