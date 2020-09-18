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
public class Hair extends Fragment {


    public Hair() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        return inflater.inflate(R.layout.fragment_hair, container, false);

    }
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        ImageView imgv1=(ImageView)getView().findViewById(R.id.imageViewdandruff);
        ImageView imgv2=(ImageView)getView().findViewById(R.id.imageViewhcond);
        ImageView imgv3=(ImageView)getView().findViewById(R.id.imageViewpatchybald);
        ImageView imgv4=(ImageView)getView().findViewById(R.id.imageViewgreyhair);
        ImageView imgv5=(ImageView)getView().findViewById(R.id.imageViewhairdye);
        ImageView imgv6=(ImageView)getView().findViewById(R.id.imageViewhairshampoo);

        imgv1.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), Dandruff.class);
                startActivity(mainIntent);
            }
        });
        imgv2.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), HairConditioner.class);
                startActivity(mainIntent);
            }
        });
        imgv3.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), PatchyBaldness.class);
                startActivity(mainIntent);
            }
        });
        imgv4.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), GreyingHair.class);
                startActivity(mainIntent);
            }
        });
        imgv5.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), HairDye.class);
                startActivity(mainIntent);
            }
        });
        imgv6.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), HairSetting.class);
                startActivity(mainIntent);
            }
        });
    }

}
