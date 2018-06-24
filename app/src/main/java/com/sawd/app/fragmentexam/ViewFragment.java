package com.sawd.app.fragmentexam;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ViewFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View parentView = inflater.inflate(R.layout.view_fragment, container, false);
        parentView.setBackgroundColor(0xFF0000);
        // Inflate the layout for this fragment
        return parentView;
    }
}