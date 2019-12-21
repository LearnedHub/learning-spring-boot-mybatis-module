package cn.zhucongqi.domain;

import javax.persistence.*;

@Table(name = "`mall_user`")
public class MallUser {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`addr`")
    private String addr;

    @Column(name = "`version`")
    private Integer version;

    public MallUser(Integer id, String name, String addr, Integer version) {
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.version = version;
    }

    public MallUser() {
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
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    /**
     * @param addr
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}