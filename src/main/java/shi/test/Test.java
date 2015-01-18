package shi.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import shi.dao.UserDao;
import shi.dynamicDataSource.DbContextHolder;
import shi.model.AppA;
import shi.model.AppB;

import java.util.List;

/**
 * Created by Administrator on 2015/1/18 0018.
 */
public class Test {

    public static void main(String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-jdbc.xml");
        UserDao dao = (UserDao) context.getBean("userDao");
        List<AppA> A = dao.queryAppA();
        System.out.println(A.size());

        DbContextHolder.setCustomerType(DbContextHolder.dataSourceB);
        System.out.println(DbContextHolder.getCustomerType());
        UserDao dao1 = (UserDao) context.getBean("userDao");
        List<AppB> B = dao1.queryAppB();
        System.out.println(B.size());

    }

}
