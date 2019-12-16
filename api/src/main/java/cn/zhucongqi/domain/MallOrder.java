package cn.zhucongqi.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`mall_order`")
public class MallOrder {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "`uid`")
    private Integer uid;

    @Column(name = "`date`")
    private Date date;

    @Column(name = "`descr`")
    private String descr;

    public MallOrder(Integer id, Integer uid, Date date, String descr) {
        this.id = id;
        this.uid = uid;
        this.date = date;
        this.descr = descr;
    }

    public MallOrder() {
        super();
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return descr
     */
    public String getDescr() {
        return descr;
    }

    /**
     * @param descr
     */
    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }
}