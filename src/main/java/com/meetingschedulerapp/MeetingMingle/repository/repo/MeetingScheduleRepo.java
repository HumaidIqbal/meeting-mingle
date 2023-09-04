package com.meetingschedulerapp.MeetingMingle.repository.repo;

import com.meetingschedulerapp.MeetingMingle.repository.entity.MeetingSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingScheduleRepo extends JpaRepository<MeetingSchedule,Integer> {
}
