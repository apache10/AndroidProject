package com.hpj.gaurav.myshop.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hpj.gaurav.myshop.R;

/**
 * Created by gaurav on 19/12/16.
 */

public class AboutUsFragment extends BaseFragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_about, container, false);
        return view;
    }
}
