package com.epam.demo;

import java.util.List;

import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (!args.isEmpty() || args.size() > 0) {
            for (String str : args) {
                return StringUtils.isPositiveNumber(str);
            }
            return true;
        }
        return false;
    }
}