package com.sasha.mylearning;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Lena on 10.10.2016.
 */
public class MyFragment extends Fragment {
    private TextView screen;
    private String display = "";
    private String currentOperator = "";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment, container, false);
         screen = (TextView) rootView.findViewById(R.id.input);

        return rootView;
    }
    private void updateScreen(){
        screen.setText(display);
    }
    public void onClickNumber(View v) {
        Button b = (Button) v;
        display += b.getText();
        updateScreen();
    }
}
