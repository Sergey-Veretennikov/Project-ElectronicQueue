package queue.main.db.dao.service;

import queue.main.db.entities.Service;

import java.util.List;

public interface ServiceDao {
    List<Service> getAllServices();
}
