package tech.zhengshi.util;

import java.util.UUID;

/**
 * @author H
 */
public class UUIDUtil {
    public static String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}
