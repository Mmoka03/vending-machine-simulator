package com.spring.vendingmachine.database.util;

import java.math.BigDecimal;

public class Caster {
    public static Long bigDecimalObjToLong(Object obj) {
        return ((BigDecimal)obj).longValue();
    }
}
