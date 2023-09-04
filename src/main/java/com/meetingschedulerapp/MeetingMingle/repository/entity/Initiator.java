package com.meetingschedulerapp.MeetingMingle.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Initiator")
public class Initiator {
    @Id
    private int id;
    private String name;
    private String department;
    private String organisation;
    private String email;
    private String designation;
    private String contactNo;

}
