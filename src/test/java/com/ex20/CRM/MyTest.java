package com.ex20.CRM;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.ex20.CRM.utils.*;

/**
 * 创建时间: 2022-03-24 14:36<hr/>
 *
 * @author 高诚政
 * @version 1.0
 */
public class MyTest {
    @Test
    public void test01(){
        // 验证失效时间
        String expireTime = "2022-3-01 10:20:30";
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
    }
    @Test
    public void test02(){
        String expireTime = "2022-3-01 10:20:30";
        String currentTime = DateTimeUtil.getSysTime();
        int count = expireTime.compareTo(currentTime);
        System.out.println(count);
    }

    @Test
    public void test03(){
        String lockState = "0";
        if("0".equals(lockState)){
            System.out.println("账号已锁定");
        }
    }

    @Test
    public void test04(){
        String ip = "127.0.0.1";
        /*允许访问的ip地址群*/
        String allowIps="192.168.0.154，,192.168.1.2,127.0.0.1";
        if(allowIps.contains(ip)){
            System.out.println("有效的ip地址,运行访问");
        }else{
            System.out.println("IP地址受限,请联系管理员");
        }
    }

    @Test
    public void test05(){
        String pwd = "GCZ@15272888596";
        String md5Pwd = MD5Util.getMD5(pwd);
        System.out.println(md5Pwd);
    }


}
