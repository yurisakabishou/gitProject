package com.sunyard.util;

import java.util.Collection;

public class MyUtil {

    public static boolean isEmpty(Collection<?> collection){
        return (collection == null || collection.isEmpty());
    }

}
