package com.meetingschedulerapp.MeetingMingle.repository.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity(name = "participants")
public class Participants {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String designation;
    private String section;
    private String organization;
    private String contactNo;
    private String email;

    @OneToMany(mappedBy = "participant", cascade = CascadeType.ALL)
    private List<MeetingSchedule> participant;
}
