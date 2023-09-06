package com.meetingschedulerapp.MeetingMingle.controller;

import com.meetingschedulerapp.MeetingMingle.pages.model.MeetingDetails;
import com.meetingschedulerapp.MeetingMingle.pages.translate.PageMapper;
import com.meetingschedulerapp.MeetingMingle.repository.DAO;
import com.meetingschedulerapp.MeetingMingle.repository.entity.MeetingSchedule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;


@Controller
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    DAO dao;

    @Autowired
    PageMapper mapper;


    @GetMapping("/home")
    public String homePage(Model model){
        List<MeetingDetails> meetingDetails = mapper.getAllMeeting();
        logger.info("MEETING SCHEDULE: "+ meetingDetails.toString());
    model.addAttribute("meetingSchedule", meetingDetails);
    return "index";

}

@GetMapping("create-meeting")
public String goToCreateMeeting(Model model){
    model.addAttribute("meeting", new MeetingSchedule());
    model.addAttribute("locations", dao.getAllLocation());
    model.addAttribute("initiators", dao.getAllInitiatior());
    model.addAttribute("participants", dao.getAllParticipants());
        return "/create";
}

@PostMapping("/meetings/create")
public String createMeeting(MeetingSchedule meetingSchedule){
        logger.info("NEW MEETING: "+ meetingSchedule.toString());
        dao.saveNewMeetingSchedule(meetingSchedule);
        return "redirect:/home";
    }


}
