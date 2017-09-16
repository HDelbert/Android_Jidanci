/**
 * Created by Meng Hu on 2017/9/16.
 * Copyright (c) 2017 Meng Hu. All rights reserved.
 */

package com.humeng.jidanci;

import android.util.Log;

public class JDCLog
{
    private static String mTag = "JDC";

    public static void Debug(String msg)
    {
        Log.d(mTag, msg);
    }

    public static void Info(String msg)
    {
        Log.i(mTag, msg);
    }

    public static void Error(String msg)
    {
        Log.e(mTag, msg);
    }
}
