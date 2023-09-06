package com.meetingschedulerapp.MeetingMingle.repository.repo;

import com.meetingschedulerapp.MeetingMingle.repository.entity.Initiator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InitiatorRepo extends JpaRepository<Initiator,Integer> {
}
