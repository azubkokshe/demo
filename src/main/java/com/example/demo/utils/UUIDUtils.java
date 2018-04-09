package com.example.demo.utils;

import java.util.UUID;

/**
 * 业务ID生成工具类
 *
 * @author yuwanyi
 * @date 17:03 2018/3/7
 */
public class UUIDUtils {
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").substring(0,16);
    }
}
