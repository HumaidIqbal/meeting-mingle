package com.meetingschedulerapp.MeetingMingle.repository;

import com.meetingschedulerapp.MeetingMingle.repository.entity.MeetingSchedule;
import com.meetingschedulerapp.MeetingMingle.repository.repo.MeetingScheduleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DAO {

    @Autowired
    MeetingScheduleRepo meetingScheduleRepo;


    public List<MeetingSchedule> getAllMeetingSchedule() {
        return  meetingScheduleRepo.findAll();
    }

    public void saveNewMeetingSchedule(MeetingSchedule meetingSchedule){
        meetingScheduleRepo.saveAndFlush(meetingSchedule);
    }
}
