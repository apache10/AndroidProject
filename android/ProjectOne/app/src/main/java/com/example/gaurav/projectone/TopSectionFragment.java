package com.example.gaurav.projectone;

/**
 * Created by gaurav on 25-08-2016.
 */
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment {

    private static EditText topTextInput;
    private static EditText bottonTextInput;

    TopSectionListener activitycommander;

    public interface TopSectionListener{
        public void createMeme(String top, String botton);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            activitycommander =    (TopSectionListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment, container, false);

        topTextInput = (EditText) view.findViewById(R.id.topTextInput);
        bottonTextInput = (EditText) view.findViewById(R.id.bottomTextInput);
        final Button button = (Button) view.findViewById(R.id.button);
        final Button button2 = (Button) view.findViewById(R.id.button2);

        button.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        buttonClicked(v);
                    }
                }
        );


        button2.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        button2Clicked(v);
                    }
                }
        );

        return view;
    }
    //call this method when button is clicked
    public void buttonClicked(View view){
        activitycommander.createMeme(topTextInput.getText().toString(), bottonTextInput.getText().toString());

    }

    //call this method when button2 is clicked
    public void button2Clicked(View view){
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("file/*");
        startActivityForResult(intent, PICKFILE_RESULT_CODE);

    }
    private static final int PICKFILE_RESULT_CODE = 1;



    //TextView textFile;
   /* @Override
    public onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        switch(requestCode){
            //case PICKFILE_RESULT_CODE:
               if(resultCode==RESULT_OK){
                    String FilePath = data.getData().getPath();
                    textFile.setText(FilePath);
                }
                break;

        }
    }*/
}
