package shi.model;

/**
 * Created by Administrator on 2015/1/18 0018.
 */

/**
 * wangxue中user
 */

/*@Entity
@Table(schema = "wangxue",name = "user")*/
public class UserB {

    private int id;

    private String name;

    private String pwd;

    public UserB() {
    }

  /*  @Id
    @Column(name = "id")*/
    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Column(name = "pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
