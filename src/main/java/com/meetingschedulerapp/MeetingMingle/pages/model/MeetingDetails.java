package com.meetingschedulerapp.MeetingMingle.pages.model;

import com.meetingschedulerapp.MeetingMingle.repository.entity.MeetingSchedule;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class MeetingDetails extends MeetingSchedule {

    private String initiatorName;
    private String designation;
    private String address;
    private String participantNames;




}
