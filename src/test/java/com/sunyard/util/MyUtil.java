package com.sunyard.util;

import java.util.Collection;
import java.util.Map;

public class MyUtil {

    public static boolean isEmpty(Collection<?> collection){
        return (collection == null || collection.isEmpty());
    }

    public static boolean isEmpty(Map<?,?> map){
        return (map==null || map.isEmpty());
    }

}
