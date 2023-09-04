package com.meetingschedulerapp.MeetingMingle.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "participants")
public class Participants {
    @Id
    private int id;
    private String name;
    private String designation;
    private String section;
    private String organization;
    private String contactNo;
    private String email;
}
