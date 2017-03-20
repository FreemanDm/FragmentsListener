package com.freeman.fragments.fragmentslistener;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Freeman on 17.01.2017.
 */

public class FragmentController extends Fragment implements View.OnClickListener {

    private Button setRedBtn, setGreenBtn, setBlueBtn;
    private FragmentControllerListener listener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        listener = (FragmentControllerListener) activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_controller, null);
        setRedBtn = (Button) view.findViewById(R.id.set_red_btn);
        setBlueBtn = (Button) view.findViewById(R.id.set_blue_btn);
        setGreenBtn = (Button) view.findViewById(R.id.set_green_btn);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setRedBtn.setOnClickListener(this);
        setBlueBtn.setOnClickListener(this);
        setGreenBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            if (v.getId() == R.id.set_red_btn) {
                listener.setColor(Color.argb(255, 255, 0, 0));
            } else if (v.getId() == R.id.set_green_btn) {
                listener.setColor(Color.argb(255, 0, 255, 0));
            } else if (v.getId() == R.id.set_blue_btn) {
                listener.setColor(Color.argb(255, 0, 0, 255));
            }
        }
    }

    public interface FragmentControllerListener{
        void setColor(int color);
    }
}
