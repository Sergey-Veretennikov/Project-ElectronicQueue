package queue.main.db.dao.role;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import queue.main.db.dao.common.AbstractCrudTemplateService;
import queue.main.db.entities.Role;
import queue.main.db.entities.Users;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Repository
@Qualifier("RoleDaoHibImpl")
public class RoleDaoHibImpl extends AbstractCrudTemplateService<Role> {
    private final String tableName = "role";

    public RoleDaoHibImpl() {
        super(Role.class);
    }

    @Override
    protected String getEntityTableName() throws NotImplementedException {
        return tableName;
    }
}

