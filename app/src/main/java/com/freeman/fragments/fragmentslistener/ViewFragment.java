package com.freeman.fragments.fragmentslistener;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by Freeman on 17.01.2017.
 */

public class ViewFragment extends Fragment {

    private RelativeLayout mainContainer;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.view_fragment, null);
        mainContainer = (RelativeLayout) view.findViewById(R.id.main_container);
        return view;
    }

    public void changeColor(int color){
        if (mainContainer != null){
            mainContainer.setBackgroundColor(color);
        }
    }
}
