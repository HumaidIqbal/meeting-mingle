package com.meetingschedulerapp.MeetingMingle.pages.translate;

import com.meetingschedulerapp.MeetingMingle.controller.UserController;
import com.meetingschedulerapp.MeetingMingle.pages.model.MeetingDetails;
import com.meetingschedulerapp.MeetingMingle.repository.DAO;
import com.meetingschedulerapp.MeetingMingle.repository.entity.Location;
import com.meetingschedulerapp.MeetingMingle.repository.entity.MeetingSchedule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class PageMapper {

    private static final Logger logger = LoggerFactory.getLogger(PageMapper.class);
    @Autowired
    DAO dao;

    public List<MeetingDetails> getAllMeeting() {
        List<MeetingSchedule> meetingScheduleList = dao.getAllMeetingSchedule();
        List<MeetingDetails> details = meetingScheduleList.stream().map(meetingSchedule -> {
            MeetingDetails meeting = new MeetingDetails();
            meeting.setId(meetingSchedule.getId());
            meeting.setAgenda(meetingSchedule.getAgenda());
            meeting.setMeetingDateTime(getLocalDateTimeFromString(meetingSchedule.getMeetingDateTime()));
            meeting.setAddress(getLocationString(meetingSchedule.getLocation()));
            meeting.setParticipantNames(meetingSchedule.getParticipant().stream().map(participants -> participants.getName()).collect(Collectors.joining(",")));
            meeting.setDesignation(meetingSchedule.getInitiator().getDesignation());
            meeting.setInitiatorName(meetingSchedule.getInitiator().getName());

            return meeting;
        }).collect(Collectors.toList());


        return  details;
    }

    private String getLocalDateTimeFromString(String meetingDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        LocalDateTime dateTime = LocalDateTime.parse(meetingDateTime, formatter);
        DateTimeFormatter targetFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format the LocalDateTime to the desired string format
        String formattedDateTimeString = dateTime.format(targetFormatter);

        return formattedDateTimeString;
    }

    private String getLocationString(Location locations) {
        return locations.getRoom()+", "+locations.getFloor()+", "+locations.getBuilding();
    }
}
