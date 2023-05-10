package designpattern.creation.factory.abstraction;

/**
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public interface IFactory {

    IUserService createUserService();

    IDepartmentService createDepartmentService();

}
