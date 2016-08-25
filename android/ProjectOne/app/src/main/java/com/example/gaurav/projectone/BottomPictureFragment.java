package com.example.gaurav.projectone;

/**
 * Created by gaurav on 25-08-2016.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BottomPictureFragment extends Fragment {

    private static TextView topMemeText;
    private static TextView buttomMemeText;

    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_picture_fragment, container, false);
        topMemeText = (TextView)   view.findViewById(R.id.topMemeText);
        buttomMemeText = (TextView) view.findViewById(R.id.buttomMemeText);
        return view;
    }
    public void setMemeText(String top,String buttom){
        topMemeText.setText(top);
        buttomMemeText.setText(buttom);
    }
}
