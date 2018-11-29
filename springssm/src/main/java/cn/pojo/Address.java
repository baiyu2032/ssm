/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Address
 * Author:   13654
 * Date:     2018/11/1 11:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.pojo;

/**
 * 功能描述: <br>
 * 〈〉
 *
 * @param地址实体类
 * @since: 1.0.0
 * @Author:13654
 * @Date: 2018/11/1 11:33
 */
public class Address {
    /**
     *地址id
     */
    private Integer aid;
    /**
     *联系人
     */
    private String aname;
    /**
     *手机号
     */
    private String phone;
    /**
     *邮政编码
     */
    private String postcode;
    /**
     *地址
     */
    private String local;
    /**
     *用户id
     */
    private Integer uid;


    /**
     *默认地址标记(1默认地址 0不是默认地址)
     */
    private Integer adefault;


    public Integer getAdefault() {
        return this.adefault;
    }

    public void setAdefault(Integer adefault) {
        this.adefault = adefault;
    }

    public Integer getAid() {
        return this.aid;
    }


    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return this.aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostcode() {
        return this.postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLocal() {
        return this.local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getUid() {
        return this.uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}
