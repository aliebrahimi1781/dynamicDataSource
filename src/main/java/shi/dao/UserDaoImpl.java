package shi.dao;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import shi.model.AppA;
import shi.model.AppB;
import shi.model.UserA;
import shi.model.UserB;

import java.util.List;

/**
 * Created by Administrator on 2015/1/18 0018.
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    @Transactional
    public List<UserA> queryUserA() {
        Session session = this.getSessionFactory().getCurrentSession();
        String hql = " from UserA ";
        List<UserA> list = session.createQuery(hql).list();
        return list;
    }

    @Override
    @Transactional
    public List<UserB> queryUserB() {
        Session session = this.getSessionFactory().getCurrentSession();
        String hql = " from UserB ";
        List<UserB> list = session.createQuery(hql).list();
        return list;
    }

    @Override
    @Transactional
    public List<AppA> queryAppA() {
        Session session = this.getSessionFactory().getCurrentSession();
        String hql = " from AppA ";
        List<AppA> list = session.createQuery(hql).list();
        return list;
    }

    @Override
    @Transactional
    public List<AppB> queryAppB() {
        Session session = this.getSessionFactory().getCurrentSession();
        String hql = " from AppB ";
        List<AppB> list = session.createQuery(hql).list();
        return list;
    }
}
