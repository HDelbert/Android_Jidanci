/**
 * Created by Meng Hu on 2017/9/16.
 * Copyright (c) 2017 Meng Hu. All rights reserved.
 */

package com.humeng.jidanci.model;

public class JDCVocabulary
{
    private String mEnglish;
    private String mChinese;
    private String mAlphabet;

    public JDCVocabulary(String english)
    {
        mEnglish = english;
    }

    public String getEnglish()
    {
        return mEnglish;
    }

    public void setChinese(String chinese)
    {
        mChinese = chinese;
    }

    public String getChinese()
    {
        return mChinese;
    }

    public void setAlphabet(String alphabet)
    {
        mAlphabet = alphabet;
    }

    public String getAlphabet()
    {
        return mAlphabet;
    }
}
