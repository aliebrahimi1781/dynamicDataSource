package shi.model;

/**
 * Created by Administrator on 2015/1/18 0018.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 企业端数据库
 */
@Entity
@Table(schema = "NHQY",name = "PTS_DEC_HEAD")
public class AppA {

    private int seqNo;

    private String emsNo ;

    @Id
    @Column(name = "SEQ_NO")
    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    @Column(name = "MANUAL_NO")
    public String getEmsNo() {
        return emsNo;
    }

    public void setEmsNo(String emsNo) {
        this.emsNo = emsNo;
    }

    public AppA() {

    }

}
