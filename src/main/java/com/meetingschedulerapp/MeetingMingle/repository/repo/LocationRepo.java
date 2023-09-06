package com.meetingschedulerapp.MeetingMingle.repository.repo;

import com.meetingschedulerapp.MeetingMingle.repository.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepo extends JpaRepository<Location,Integer> {
}
