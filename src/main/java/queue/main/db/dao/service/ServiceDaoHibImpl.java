package queue.main.db.dao.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import queue.main.db.dao.common.AbstractCrudDaoHib;
import queue.main.db.entities.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Repository
@Qualifier("ServiceDaoHibImpl")
public class ServiceDaoHibImpl extends AbstractCrudDaoHib<Service> {
    private final String tableName = "service";

    public ServiceDaoHibImpl() {
        super(Service.class);
    }

    @Override
    protected String getEntityTableName() throws NotImplementedException {
        return tableName;
    }
}
