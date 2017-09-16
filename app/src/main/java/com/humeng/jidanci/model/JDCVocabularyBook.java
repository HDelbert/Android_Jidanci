/**
 * Created by Meng Hu on 2017/9/16.
 * Copyright (c) 2017 Meng Hu. All rights reserved.
 */

package com.humeng.jidanci.model;

import java.util.ArrayList;

public class JDCVocabularyBook
{
    private String mName;
    private ArrayList<JDCVocabulary> mVocabularies = null;

    public JDCVocabularyBook(String name)
    {
        mName = name;
        mVocabularies = new ArrayList<>();
    }

    public String getName()
    {
        return mName;
    }

    public void addVocabulary(JDCVocabulary vocabulary)
    {
        mVocabularies.add(vocabulary);
    }

    public ArrayList<JDCVocabulary> getVocabularies()
    {
        return mVocabularies;
    }
}
