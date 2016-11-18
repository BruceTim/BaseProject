package com.timBruce.base.web.enums;

import com.timBruce.base.core.generic.GenericEnum;

/**
 * 用户账号状态枚举类型
 * Created by BruceTim on 2016/11/18.
 */
public enum UserState implements GenericEnum {
    AVAILABLE("账号可用", 1), LOCKED("账号已锁定", -1), EXPIRED("账号已过期", -2),;

    private String state;
    private int index;

    UserState (String state, int index) {
        this.state = state;
        this.index = index;
    }

    @Override
    public int getValue () {
        return index;
    }

    @Override
    public String getText () {
        return state;
    }
}
