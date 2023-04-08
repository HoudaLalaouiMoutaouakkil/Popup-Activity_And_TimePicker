package com.example.popupactivity_and_time_picker;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TimePicker;

import androidx.fragment.app.DialogFragment;

class popActivity extends DialogFragment implements View.OnClickListener {
    View view;
    TimePicker tp;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        view=inflater.inflate(R.layout.activity_popup,container,false);
        Button buDone=(Button)view.findViewById(R.id.button);
        tp=(TimePicker)view.findViewById(R.id.timePicker);
        buDone.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        this.dismiss();
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            String myTime=tp.getHour()+":"+tp.getMinute();
            MainActivity ma =(MainActivity) getActivity();
            ma.SetDate(myTime);
        }
    }
}