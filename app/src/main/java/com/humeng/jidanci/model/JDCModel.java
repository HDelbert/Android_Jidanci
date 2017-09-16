/**
 * Created by Meng Hu on 2017/9/16.
 * Copyright (c) 2017 Meng Hu. All rights reserved.
 */

package com.humeng.jidanci.model;

import java.util.HashMap;

public class JDCModel
{
    private HashMap<String, JDCVocabularyBook> mBooks = null;

    public JDCModel()
    {
        mBooks = new HashMap<>();
    }

    public void addBook(JDCVocabularyBook book)
    {
        mBooks.put(book.getName(), book);
    }

    public JDCVocabularyBook getBook(String name)
    {
        return mBooks.get(name);
    }
}
