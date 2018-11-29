package cn.service;

import cn.pojo.Address;

/**
 * 功能描述: <br>
 * 〈地址管理模块〉
 *
 * @return:
 * @since: 1.0.0
 * @Author:13654
 * @Date: 2018/11/1 15:32
 */
public interface AddressmanageService {

    /**
     * 功能描述: <br>
     * 〈增加地址〉
     *
     * @param address
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 15:53
     */
    String addLocal(Address address);


    /**
     * 功能描述: <br>
     * 〈修改地址〉
     *
     * @param address
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/2 11:59
     */
    String updateLocal(Address address);


    /**
     * 功能描述: <br>
     * 〈删除地址〉
     *
     * @param uid,aid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/2 14:33
     */
    String delLocal(int uid, int aid);


    /**
     * 功能描述: <br>
     * 〈查询该用户全部收货地址〉
     *
     * @param uid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/2 16:18
     */
    String selLocal(int uid);

    /**
     * 功能描述: <br>
     * 〈查询单条用户地址〉
     *
     * @param uid,aid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/6 13:15
     */
    String selLoncalinfo(int aid, int uid);
}
