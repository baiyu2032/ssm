/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: RedisServiceImpl
 * Author:   13654
 * Date:     2018/11/30 10:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.service.impl;

import cn.service.RedisService;

import org.springframework.stereotype.Service;

@Service
public class RedisServiceImpl implements RedisService {
    @Override
    public Boolean set(String redis, String ob) {

        return true;
    }
}
