/**
 * Created by Meng Hu on 2017/9/16.
 * Copyright (c) 2017 Meng Hu. All rights reserved.
 */

package com.humeng.jidanci.controller;

import android.content.Context;

import com.humeng.jidanci.model.JDCModel;
import com.humeng.jidanci.model.JDCVocabularyBook;
import com.humeng.jidanci.persistent.JDCPersistent;

public class JDCController
{
    private Context mContext = null;
    private JDCPersistent mPersistent = null;
    private JDCModel mModel = null;

    public JDCController(Context context, JDCPersistent persistent)
    {
        mContext = context;
        mPersistent = persistent;

        mModel = new JDCModel();
    }

    public void initialize()
    {
        // TODO
        mModel.addBook(new JDCVocabularyBook("SiJi"));
    }
}
