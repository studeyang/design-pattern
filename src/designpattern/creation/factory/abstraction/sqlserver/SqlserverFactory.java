package designpattern.creation.factory.abstraction.sqlserver;

import designpattern.creation.factory.abstraction.IDepartmentService;
import designpattern.creation.factory.abstraction.IFactory;
import designpattern.creation.factory.abstraction.IUserService;

/**
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class SqlserverFactory implements IFactory {

    @Override
    public IUserService createUserService() {
        return new SqlserverUserService();
    }

    @Override
    public IDepartmentService createDepartmentService() {
        return new SqlserverDepartmentService();
    }

}
