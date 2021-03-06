package com.kpgn.androidtemplate.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kpgn.androidtemplate.R;

import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

    public BaseFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), null, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        if (getTitleId() >= 0) {
            getActivity().setTitle(getTitleId());
        } else {
            getActivity().setTitle(R.string.app_name);
        }
    }

    protected abstract int getTitleId();

    protected abstract int getLayoutId();
}