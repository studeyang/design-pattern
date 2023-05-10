package designpattern.creation.factory.abstraction.sqlserver;

import designpattern.creation.factory.abstraction.Department;
import designpattern.creation.factory.abstraction.IDepartmentService;

/**
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class SqlserverDepartmentService implements IDepartmentService {

    @Override
    public void insert(Department department) {
        System.out.println("在 SQL Server 中给 department 表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在 SQL Server 中根据 ID 得到 department 表一条记录");
        return null;
    }

}
