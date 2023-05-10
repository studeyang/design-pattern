package designpattern.creation.factory.abstraction;

/**
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public interface IDepartmentService {

    void insert(Department department);

    Department getDepartment(int id);

}
