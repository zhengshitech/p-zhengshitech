package tech.zhengshi.test;

import tech.zhengshi.util.CipherUtil;
import tech.zhengshi.util.MD5Util;
import tech.zhengshi.util.UUIDUtil;

public class UtilTester {
    public static void main(String[] args) {
        //MD5 Test
        System.out.println(MD5Util.doMD5("郑强"));
        System.out.println(MD5Util.doMD5("郑强2222"));

        //Cipher Test
        String str = "536601e0316e1db2b026d5f6ef6d95f2";
        System.out.println(CipherUtil.doEncrypt("xxxxxxhello123$", MD5Util.doMD5(str)));
        System.out.println(CipherUtil.doEncrypt("xxxxxxhello123$", MD5Util.doMD5(str+str)));


    }
}
