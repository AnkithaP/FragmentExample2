package com.aryaan.ankitha.fragmentexample2;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ankitha on 10/21/2016.
 */
public class FragmentB extends Fragment {

    TextView text;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        text = (TextView) getActivity().findViewById(R.id.textView);
    }

    public void changeData(int i){
        Resources res = getResources();
        String[] description = res.getStringArray(R.array.description);
        text.setText(description[i]);
    }
}
