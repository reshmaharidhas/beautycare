package com.reshmaharidhas.reshma.beautycare;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class skin extends Fragment{


    public skin() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        return inflater.inflate(R.layout.fragment_skin, container, false);


    }

    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        // get the button view
        ImageView imgv1 = (ImageView) getView().findViewById(R.id.cleansing);
        ImageView imgv2=(ImageView)getView().findViewById(R.id.moisturising);
        ImageView imgv3=(ImageView)getView().findViewById(R.id.nourishing);
        ImageView imgv4=(ImageView)getView().findViewById(R.id.toning);
        ImageView imgv5=(ImageView)getView().findViewById(R.id.astringent);
        // set a onclick listener for when the button gets clicked
        imgv1.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), Cleansing.class);
                startActivity(mainIntent);
            }
        });
        imgv2.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), Moisturising.class);
                startActivity(mainIntent);
            }
        });
        imgv3.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), Nourishing.class);
                startActivity(mainIntent);
            }
        });
        imgv4.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), Toning.class);
                startActivity(mainIntent);
            }
        });
        imgv5.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), Astringent.class);
                startActivity(mainIntent);
            }
        });

    }
}
