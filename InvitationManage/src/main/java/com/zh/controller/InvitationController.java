package com.zh.controller;

import com.zh.pojo.ReplyDetail;
import com.zh.service.InvitationService;
import com.zh.service.ReplyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inv")
public class InvitationController {
    @Autowired
    private InvitationService invitationService;
    @Autowired
    private ReplyDetailService replyDetailService;

    @RequestMapping("/main")
    public String findInvitation(Model model) {
        model.addAttribute("invitationis", invitationService.findInvitation());
        return "../main";
    }

    @RequestMapping("/delete")
    public String deleteInvitation(int id, Model model) {
        model.addAttribute("invitationis", invitationService.findInvitation());
        if (invitationService.deleteInvitation(id) > 0) {
            model.addAttribute("result", "删除成功");
        } else {
            model.addAttribute("result", "删除失败");
        }
        return "../main";
    }

    @RequestMapping("/queryInfor")
    public String quer(String query, Model model) {
        model.addAttribute("invitationis", invitationService.findInvitationByTitle(query));
        return "../main";
    }

    @RequestMapping("/repd")
    public String findReplyDetail(int invId, Model model) {
        model.addAttribute("reps",replyDetailService.findReplyDetail(invId) );
        return "../index";
    }
    @RequestMapping("/add")
    public String add(ReplyDetail replyDetail, Model model) {
        if (replyDetailService.add(replyDetail)>0) {
            model.addAttribute("result", "添加成功");
        } else {
            model.addAttribute("result", "添加失败");
        }
        return "../index";
    }
}
