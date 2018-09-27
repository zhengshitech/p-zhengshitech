package tech.zhengshi.util;

import org.springframework.util.StringUtils;

import java.util.regex.Pattern;

/**
 * 验证工具类
 *
 * @author H
 */
public class ValidationUtil {

    /**
     * 大写字母+数字
     */
    public static final String PATTERN_UPPER_CASE = "^[A-Z0-9]+$";

    /**
     * 大写字母+数字+下划线
     */
    public static final String PATTERN_UPPER_NUMBER_UNDERLINE_CASE = "^[A-Z0-9_]+$";
    /**
     * 正则表达式：验证用户名
     */
    public static final String PATTERN_USERNAME = "^[a-zA-Z]\\w{5,17}$";

    /**
     * 正则表达式：验证密码
     */
    public static final String PATTERN_PASSWORD = "^[a-zA-Z0-9]{6,16}$";

    /**
     * 正则表达式：验证手机号
     */
    public static final String PATTERN_MOBILE = "^(1[23456789]\\d{9})$";

    /**
     * 正则表达式：验证邮箱
     */
    public static final String PATTERN_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

    /**
     * 正则表达式：验证汉字
     */
    public static final String PATTERN_CHINESE = "^[\u4e00-\u9fa5],*$";

    /**
     * 正则表达式：验证18位身份证
     */
    public static final String PATTERN_ID = "(^[1-9]([0-9]{16})[xX0-9]$)";

    /**
     * 正则表达式：验证URL
     */
    public static final String PATTERN_URL = "http(s)?://([\\w-]+\\.)+[\\w-]+(/[\\w -./?%&=]*)?";

    /**
     * 正则表达式：验证IP地址
     */
    public static final String PATTERN_IP_ADDR = "(25[0-5]|2[0-4]\\d|[0-1]\\d{2}|[1-9]?\\d)";

    /**
     * 正则表达式：验证字符串只能包含字母和数字
     */
    public static final String PATTERN_NUMBER_ALPHABET = "^[0-9a-zA-Z]*$";


    public static boolean isIP(String ip) {
        return match(PATTERN_IP_ADDR, ip);
    }

    public static boolean match(String regex, String targetStr) {
        if (StringUtils.isEmpty(targetStr)) {
            return false;
        }
        return Pattern.matches(regex, targetStr);
    }

    public static boolean isID(String ID) {
        return match(PATTERN_ID, ID);
    }

    public static boolean isURL(String url) {
        return match(PATTERN_URL, url);
    }

    public static boolean isEmail(String email) {
        return match(PATTERN_EMAIL, email);
    }

    public static boolean isMobile(String mobile) {
        return match(PATTERN_MOBILE, mobile);
    }


}
