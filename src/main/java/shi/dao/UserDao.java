package shi.dao;

import shi.model.AppA;
import shi.model.AppB;
import shi.model.UserA;
import shi.model.UserB;

import java.util.List;

/**
 * Created by Administrator on 2015/1/18 0018.
 */
public interface UserDao {

    public List<UserA> queryUserA();

    public List<UserB> queryUserB();

    public List<AppA> queryAppA();

    public List<AppB> queryAppB();

}
