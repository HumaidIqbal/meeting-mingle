package com.meetingschedulerapp.MeetingMingle.repository.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "Initiator")
public class Initiator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String department;
    private String organisation;
    private String email;
    private String designation;
    private String contactNo;

    @OneToMany(mappedBy = "initiator", cascade = CascadeType.ALL)
    private List<MeetingSchedule> initiator;

}
