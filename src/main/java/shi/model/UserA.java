package shi.model;

/**
 * Created by Administrator on 2015/1/18 0018.
 */

/**
 * ibatis中user
 */

/*@Entity
@Table(schema = "ibatis",name = "person")*/
public class UserA {
    private int id;

    private String name;

    private int sex;

    public UserA() {
    }

  /*  @Id
    @Column(name = "id")*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  /*  @Column(name = "name")*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 /*   @Column(name = "sex")*/
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
