package com.meetingschedulerapp.MeetingMingle.controller;

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


    @GetMapping("/home")
    public String homePage(Model model){
        List<MeetingSchedule> meetingSchedule = dao.getAllMeetingSchedule();
        logger.info("MEETING SCHEDULE: "+ meetingSchedule.toString());
    model.addAttribute("meetingSchedule", meetingSchedule);
    return "index";

}

@GetMapping("create-meeting")
public String goToCreateMeeting(Model model){
    model.addAttribute("meeting", new MeetingSchedule());
        return "/create";
}

@PostMapping("/meetings/create")
public String createMeeting(MeetingSchedule meetingSchedule){
        logger.info("NEW MEETING: "+ meetingSchedule.toString());
        dao.saveNewMeetingSchedule(meetingSchedule);
        return "redirect:/home";
    }


}
