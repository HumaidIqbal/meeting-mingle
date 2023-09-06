package com.meetingschedulerapp.MeetingMingle.repository;

import com.meetingschedulerapp.MeetingMingle.repository.entity.Initiator;
import com.meetingschedulerapp.MeetingMingle.repository.entity.Location;
import com.meetingschedulerapp.MeetingMingle.repository.entity.MeetingSchedule;
import com.meetingschedulerapp.MeetingMingle.repository.entity.Participants;
import com.meetingschedulerapp.MeetingMingle.repository.repo.InitiatorRepo;
import com.meetingschedulerapp.MeetingMingle.repository.repo.LocationRepo;
import com.meetingschedulerapp.MeetingMingle.repository.repo.MeetingScheduleRepo;
import com.meetingschedulerapp.MeetingMingle.repository.repo.ParticipantsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DAO {

    @Autowired
    MeetingScheduleRepo meetingScheduleRepo;
    @Autowired
    ParticipantsRepo participantsRepo;
    @Autowired
    LocationRepo locationRepo;
    @Autowired
    InitiatorRepo initiatorRepo;


    public List<MeetingSchedule> getAllMeetingSchedule() {
        return  meetingScheduleRepo.findAll();
    }

    public void saveNewMeetingSchedule(MeetingSchedule meetingSchedule){
        meetingScheduleRepo.saveAndFlush(meetingSchedule);
    }

    public List<Participants> getAllParticipants() {
        return participantsRepo.findAll();
    }

    public List<Initiator> getAllInitiatior() {
        return initiatorRepo.findAll();
    }

    public List<Location> getAllLocation() {
        return locationRepo.findAll();
    }
}
