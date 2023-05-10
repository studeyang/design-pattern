package designpattern.creation.factory.abstraction;

import designpattern.creation.factory.abstraction.sqlserver.SqlserverFactory;

/**
 * 客户端
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class Client {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        IFactory factory = new SqlserverFactory();

        IUserService userService = factory.createUserService();
        userService.insert(new User());
        User user = userService.getUser(1);

        IDepartmentService departmentService = factory.createDepartmentService();
        departmentService.insert(new Department());
        Department department = departmentService.getDepartment(1);
    }

}
