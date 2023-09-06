package com.meetingschedulerapp.MeetingMingle.repository.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String building;
    private String floor;
    private String room;

    @OneToMany(mappedBy = "location", cascade = CascadeType.ALL)
    private List<MeetingSchedule> locations;
}
