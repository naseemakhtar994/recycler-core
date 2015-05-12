package com.carrotcreative.recyclercore.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public abstract class RecyclerCoreModel {

    public String getViewType()
    {
        return getClass().getCanonicalName();
    }

    public abstract RecyclerCoreController buildController(LayoutInflater inflater, ViewGroup parent, Activity activity);

}