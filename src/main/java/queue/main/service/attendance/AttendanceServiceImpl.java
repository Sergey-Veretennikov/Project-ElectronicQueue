package queue.main.service.attendance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import queue.main.db.dao.common.ICrudHibernateContainer;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService{

    private ICrudHibernateContainer<queue.main.db.entities.Service> serviceDaoHib;

    @Autowired
    @Qualifier("ServiceDaoHibImpl")
    public void setUserDaoHib(ICrudHibernateContainer<queue.main.db.entities.Service> serviceDaoHib) {
        this.serviceDaoHib = serviceDaoHib;
    }

    @Override
    @Transactional
    public List<queue.main.db.entities.Service> getAvailableAttendance()
    {
        return serviceDaoHib.getAll();
    }
}
