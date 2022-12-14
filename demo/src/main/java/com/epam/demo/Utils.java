package com.epam.demo;

import java.util.Iterator;
import java.util.List;

import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        if (!args.isEmpty() || args.size() > 0) {
            for (int i = 0; i < args.size(); i++) {
                if (StringUtils.isPositiveNumber(args.get(i)) == false) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}