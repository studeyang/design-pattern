package designpattern.creation.factory.abstraction.access;

import designpattern.creation.factory.abstraction.IDepartmentService;
import designpattern.creation.factory.abstraction.IFactory;
import designpattern.creation.factory.abstraction.IUserService;

/**
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class AccessFactory implements IFactory {

    @Override
    public IUserService createUserService() {
        return new AccessUserService();
    }

    @Override
    public IDepartmentService createDepartmentService() {
        return new AccessDepartmentService();
    }
    
}
