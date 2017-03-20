package com.freeman.fragments.fragmentslistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentController.FragmentControllerListener{

    private ViewFragment viewFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFragment = (ViewFragment) getFragmentManager().findFragmentById(R.id.fragment_view);
    }

    @Override
    public void setColor(int color) {
        if (viewFragment != null){
            viewFragment.changeColor(color);
        }
    }
}
