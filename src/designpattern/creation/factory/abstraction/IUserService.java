package designpattern.creation.factory.abstraction;

/**
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public interface IUserService {

    void insert(User user);

    User getUser(int id);

}
