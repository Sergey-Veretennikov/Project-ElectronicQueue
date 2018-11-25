package queue.main.service.availableservices;

import queue.main.db.entities.Service;

import java.util.List;

public interface IAvailableServicesList {
    List<Service> getAvailableServices();
}
