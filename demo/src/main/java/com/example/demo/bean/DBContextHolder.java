package com.example.demo.bean;

import com.example.demo.enums.DBTypeEnum;

import java.util.concurrent.atomic.AtomicInteger;

public class DBContextHolder {

    private static final ThreadLocal<DBTypeEnum> contextHolder = new ThreadLocal<>();

    private static final AtomicInteger counter = new AtomicInteger(-1);

    public static void set(DBTypeEnum dbType) {
        contextHolder.set(dbType);
    }

    public static DBTypeEnum get() {
        return contextHolder.get();
    }

    public static void master() {
        System.out.println("change to master");
        set(DBTypeEnum.MASTER);
    }

    public static void slave() {
        System.out.println("change to slave1");
        set(DBTypeEnum.SLAVE1);
    }

}