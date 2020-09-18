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
public class bath extends Fragment {


    public bath() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        return inflater.inflate(R.layout.fragment_bath, container, false);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        // get the button view
        ImageView imgv1 = (ImageView) getView().findViewById(R.id.imageViewbath);
        ImageView imgv2=(ImageView)getView().findViewById(R.id.imageViewbodylotion);
        // set a onclick listener for when the button gets clicked
        imgv1.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        ScrollingActivityscrub.class);
                startActivity(mainIntent);
            }
        });
        imgv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(getActivity(),HerbalBodyLotion.class);
                startActivity(intent2);
            }
        });
    }

}
