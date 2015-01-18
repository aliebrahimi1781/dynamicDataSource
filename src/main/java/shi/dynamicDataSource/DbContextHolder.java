package shi.dynamicDataSource;

/**
 * Created by Administrator on 2015/1/18 0018.
 */
public class DbContextHolder {

    public static final String dataSourceA = "dataSourceA";
    public static final String dataSourceB = "dataSourceB";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();

    public static void setCustomerType(String dbType){
        contextHolder.set(dbType);
    }

    public static String getCustomerType(){
        return contextHolder.get();
    }

    public static void clearDbType(){
        contextHolder.remove();
    }


}
