/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AddressmanageServiceImpl
 * Author:   13654
 * Date:     2018/11/1 16:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.service.impl;




import cn.dao.AddressDao;
import cn.pojo.Address;
import cn.service.AddressmanageService;
import cn.util.VerifyUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("localser")
public class AddressmanageServiceImpl implements AddressmanageService {

    @Autowired
    @Qualifier("local")
    private AddressDao addressDao;

    public AddressDao getAddressDao() {
        return this.addressDao;
    }

    public void setAddressDao(AddressDao addressDao) {
        this.addressDao = addressDao;
    }

    @Autowired
    @Qualifier("util")
    private VerifyUtil util;

    public VerifyUtil getUtil() {
        return this.util;
    }
    public void setUtil(VerifyUtil util) {
        this.util = util;
    }

    /**
     * 功能描述: <br>
     * 〈添加地址〉
     *
     * @param address
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 20:40
     */
    @Override
    public String addLocal(Address address) {
        Map<String,Object> map = new HashMap<String, Object>();
        String retinfo=null;
        String na = address.getAname();
        String loc = address.getLocal();
        String pho = address.getPhone();
        String post = address.getPostcode();
        Integer uid = address.getUid();
        if (util.name(na)==null&&util.Phone(pho)==null&&util.address(loc)==null&&util.postcode(post)==null) {
            if (addressDao.localCount(uid)>=3){
                map.put("code","1");
                map.put("errmsg","地址添加达到上限！请删除地址后重试！");
                return JSON.toJSONString(map);
            }
            if(addressDao.localCount(uid)==0){
                address.setAdefault(1);
            }else{
                address.setAdefault(0);
            }
            int addlocal = addressDao.addLocal(address);
            if(addlocal != 0){
                map.put("code","0");
                map.put("errmsg","添加成功");
            }else{
                map.put("code","1");
                map.put("errmsg","添加失败");
            }
        }else{
            map.put("code","1");
            map.put("errmsg","添加失败格式有误");
        }
        return JSON.toJSONString(map);
    }


    @Override
    public String updateLocal(Address address) {
        String retinfo = null;
        Map<String,Object> map = new HashMap<String, Object>();
        String na = address.getAname();
        String loc = address.getLocal();
        String pho = address.getPhone();
        String post = address.getPostcode();
        if (util.name(na)==null&&util.Phone(pho)==null&&util.address(loc)==null&&util.postcode(post)==null) {
            int fleg = addressDao.updateLocal(address);
            if (fleg!=0){
                map.put("code","0");
                map.put("errmsg","修改成功");

            }else{
                map.put("code","1");
                map.put("errmsg","修改失败");
            }
        }else{
            map.put("code","1");
            map.put("errmsg","修改失败格式有误");
        }
        return JSON.toJSONString(map);
    }

    @Override
    public String delLocal(int uid,int aid) {
        String retinfo = null;
        if(addressDao.localCount(uid)==0){
            return "该用户没有地址无法删除请先添加地址";
        }else{
            int fleg = addressDao.delLocal(uid, aid);
            if (fleg!=0){
                retinfo="删除成功！";
            }else{
                retinfo="删除失败！";
            }
        }

        return retinfo;
    }

    @Override
        public String selLocal(int uid) {
        List<Address> list = null;
        Map<String,Object> map = new HashMap<String, Object>();
        list=addressDao.selectlocal(uid);
        if (list != null&&!list.isEmpty()){
            map.put("errmsg","查找成功");
            map.put("data",list);
        }else{
            map.put("errmsg","当前没有地址请添加");
        }

        return  JSON.toJSONString(map) ;
    }

    @Override
    public String selLoncalinfo(int aid, int uid) {
        Map<String,Object> map = new HashMap<String, Object>();
        Address address = addressDao.selLocal(aid, uid);
        if (address != null){
            map.put("code","0");
            map.put("errmsg","查找成功");
            map.put("data",address);
        }else{
            map.put("errmsg","当前没有地址请添加");
            map.put("code","1");
        }
        return  JSON.toJSONString(map);
    }
}
