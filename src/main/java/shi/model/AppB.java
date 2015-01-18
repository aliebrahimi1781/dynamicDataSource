package shi.model;

/**
 * Created by Administrator on 2015/1/18 0018.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ef app 数据库
 */

@Entity
@Table(schema = "EFAPP", name = "T_USER")
public class AppB {

    private String id;

    private String copTradeCode;

    @Id
    @Column(name = "MSISDN")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "COP_TRADE_CODE")
    public String getCopTradeCode() {
        return copTradeCode;
    }

    public void setCopTradeCode(String copTradeCode) {
        this.copTradeCode = copTradeCode;
    }

    public AppB() {

    }
}
