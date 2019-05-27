package com.briup.apps.tb_app01.utils;

import java.util.Date;

/**
 * @program: tb_app01
 * @description: 消息工具类
 * @author: charles
 * @create: 2019-04-30 15:30
 **/

public class MessageUtil {
    public static Message success(String msg){
        return new Message(200,msg,null,new Date().getTime());
    }
    public static Message success(String msg,Object data){
        return new Message(200,msg,data,new Date().getTime());
    }
    public static Message success(Object data){
        return new Message(200,"success",data,new Date().getTime());
    }
    public static Message error(String msg){
        return new Message(500,msg,null,new Date().getTime());
    }
}
