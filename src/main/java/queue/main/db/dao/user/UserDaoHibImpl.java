package queue.main.db.dao.user;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import queue.main.db.dao.common.AbstractCrudTemplateService;
import queue.main.db.entities.Users;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

@Repository
@Qualifier("UserDaoHibImpl")
public class UserDaoHibImpl extends AbstractCrudTemplateService<Users> {
    private final String tableName = "users";

    public UserDaoHibImpl() {
        super(Users.class);
    }

    @Override
    protected String getEntityTableName() throws NotImplementedException {
        return tableName;
    }

}