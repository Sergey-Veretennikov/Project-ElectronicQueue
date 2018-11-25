package queue.main.service.availableservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import queue.main.db.dao.common.ICrudTemplateService;
import java.util.List;

@org.springframework.stereotype.Service
public class AvailableServicesList implements IAvailableServicesList {

    private ICrudTemplateService<queue.main.db.entities.Service> serviceDaoHib;

    @Autowired
    @Qualifier("ServiceDaoHibImpl")
    public void setUserDaoHib(ICrudTemplateService<queue.main.db.entities.Service> serviceDaoHib) {
        this.serviceDaoHib = serviceDaoHib;
    }

    @Override
    public List<queue.main.db.entities.Service> getAvailableServices() {
        return serviceDaoHib.getAll();
    }
}
