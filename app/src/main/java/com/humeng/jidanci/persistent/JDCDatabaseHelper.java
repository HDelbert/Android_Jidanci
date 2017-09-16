/**
 * Created by Meng Hu on 2017/9/16.
 * Copyright (c) 2017 Meng Hu. All rights reserved.
 */

package com.humeng.jidanci.persistent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

import com.humeng.jidanci.JDCLog;

class JDCDatabaseHelper extends SQLiteOpenHelper
{
    JDCDatabaseHelper(Context context, String name, CursorFactory factory, int version)
    {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        JDCLog.Debug("Database Helper: onCreate");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion)
    {
        JDCLog.Debug("Database Helper: onUpgrade " + oldVersion + " -> " + newVersion);

        switch (oldVersion)
        {
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
    }
}
