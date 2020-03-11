package com.example.a3allmni.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a3allmni.LettersActivity;
import com.example.a3allmni.R;


public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";

Button fbtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1_fragment,container,false);
        fbtn = view.findViewById(R.id.fbtn);
        fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LettersActivity.class));
            }
        });

        return view;
    }
}
