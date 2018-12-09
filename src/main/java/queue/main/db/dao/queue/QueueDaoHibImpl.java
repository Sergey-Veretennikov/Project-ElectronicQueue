package queue.main.db.dao.queue;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import queue.main.db.dao.common.AbstractCrudDaoHib;
import queue.main.db.entities.Queue;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Repository
@Qualifier("QueueDaoHibImpl")
public class QueueDaoHibImpl extends AbstractCrudDaoHib<Queue>{
    private final String tableName = "queue";

    public QueueDaoHibImpl() {
        super(Queue.class);
    }
    @Override
    protected String getEntityTableName() throws NotImplementedException {
        return tableName;
    }
}
