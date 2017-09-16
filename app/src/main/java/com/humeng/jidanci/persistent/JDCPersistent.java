/**
 * Created by Meng Hu on 2017/9/16.
 * Copyright (c) 2017 Meng Hu. All rights reserved.
 */

package com.humeng.jidanci.persistent;

import android.content.Context;

public class JDCPersistent
{
    private JDCDatabaseHelper mDatabaseHelper = null;

    public JDCPersistent(Context context)
    {
        mDatabaseHelper = new JDCDatabaseHelper(context, "Jidanci.db", null, 1);
    }
}
