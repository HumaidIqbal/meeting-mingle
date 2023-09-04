package com.meetingschedulerapp.MeetingMingle.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "location")
public class Location {
    @Id
    private int id;
    private String building;
    private String floor;
    private String room;

}
