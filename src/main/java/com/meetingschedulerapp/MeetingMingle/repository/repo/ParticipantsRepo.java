package com.meetingschedulerapp.MeetingMingle.repository.repo;

import com.meetingschedulerapp.MeetingMingle.repository.entity.Participants;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantsRepo extends JpaRepository<Participants,Integer> {
}
