package com.meetingschedulerapp.MeetingMingle.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity(name = "meeting_schedule")
@ToString
public class MeetingSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String initiateDate;
    private String meetingDateTime;
    private String agenda;
    private String type;
    private String link;
    private String letterNo;
}
