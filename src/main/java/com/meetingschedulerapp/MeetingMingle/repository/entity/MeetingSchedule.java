package com.meetingschedulerapp.MeetingMingle.repository.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

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

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "initiator_id")
    private Initiator initiator;

    @ManyToMany
    @JoinColumn(name = "participant_id")
    private List<Participants> participant;

}
