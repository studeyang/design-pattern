package designpattern.creation.factory.abstraction.sqlserver;

import designpattern.creation.factory.abstraction.IUserService;
import designpattern.creation.factory.abstraction.User;

/**
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class SqlserverUserService implements IUserService {

    @Override
    public void insert(User user) {
        System.out.println("在 SQL Server 中给 user 表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在 SQL Server 中根据 ID 得到 user 表一条记录");
        return null;
    }

}
