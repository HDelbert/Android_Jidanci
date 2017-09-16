/**
 * Created by Meng Hu on 2017/9/16.
 * Copyright (c) 2017 Meng Hu. All rights reserved.
 */

package com.humeng.jidanci.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.humeng.jidanci.R;
import com.humeng.jidanci.controller.JDCController;
import com.humeng.jidanci.persistent.JDCPersistent;

public class JDCMainActivity extends AppCompatActivity
{
    private JDCPersistent mPersistent = null;
    private JDCController mController = null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        mPersistent = new JDCPersistent(this);
        mController = new JDCController(this, mPersistent);

        mController.initialize();
    }
}
