package queue.main.service.attendance;

import queue.main.db.entities.Service;

import java.util.List;

public interface AttendanceService {
    List<Service> getAvailableAttendance();
}
