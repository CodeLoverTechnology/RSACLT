package rsa.codelovertechnology.com.rsaclt.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import rsa.codelovertechnology.com.rsaclt.R;
import rsa.codelovertechnology.com.rsaclt.UserActivity.UserLogin;

public class ProfileFragment extends Fragment {

    View v;
    Button btnLogin;
    Button btnRegistration;


    public ProfileFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.profile_fragment,container,false);

      /*  btnLogin =(Button) v.findViewById(R.id.btnLogin);
        btnRegistration= (Button) v.findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                *//*Intent homeIntent = new Intent(ProfileFragment.this,UserLogin.class);
                startActivity(homeIntent);
                finish();*//*
        });*/
        return v;
    }



}
