package com.epam.demo;

import java.util.Iterator;
import java.util.List;

import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        Iterator<String> iterator = args.iterator();
        while (iterator.hasNext()) {
            if (StringUtils.isPositiveNumber(iterator.next()) == false) {
               return false;
            }
        }
        return true;
    }
}