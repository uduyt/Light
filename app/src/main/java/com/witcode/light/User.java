package com.witcode.light;

/**
 * Created by carlo on 07/11/2016.
 */

public class User {
    static private int mUserId;

    static public int getUserId() {
        return mUserId;
    }

    static public void setUserId(int userId) {
        mUserId = userId;
    }
}
