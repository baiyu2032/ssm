package cn.dao;

import cn.pojo.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 功能描述: <br>
 * 〈地址〉
 * @since: 1.0.0
 * @Author:13654
 * @Date: 2018/11/1 10:07
 */
@Repository("local")
public interface AddressDao {

    /**
     * 功能描述: <br>
     * 〈增加地址〉
     *
     * @param address
     * @return:int
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 14:08
     */
    int addLocal(Address address);


    /**
     * 功能描述: <br>
     * 〈修改地址〉
     *
     * @param address
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 14:10
     */
    int updateLocal(Address address);

    /**
     * 功能描述: <br>
     * 〈删除地址〉
     *
     * @param uid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 14:25
     */
    int delLocal(@Param("uid") int uid, @Param("aid") int aid);

    /**
     * 功能描述: <br>
     * 〈查询用户的地址条数〉
     *
     * @param uid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/1 14:25
     */
    int localCount(@Param("uid") int uid);

    /**
     * 功能描述: <br>
     * 〈查询用户的地址信息〉
     *
     * @param uid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/2 16:11
     */
    List<Address> selectlocal(@Param("uid") int uid);

    /**
     * 功能描述: <br>
     * 〈查询用户单条地址信息〉
     *
     * @param uid,aid
     * @return:
     * @since: 1.0.0
     * @Author:13654
     * @Date: 2018/11/6 12:30
     */
    Address selLocal(@Param("aid") int aid, @Param("uid") int uid);

}
