package rsa.codelovertechnology.com.rsaclt.UserActivity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rsa.codelovertechnology.com.rsaclt.R;

public class UserLogin extends Fragment {
    View v;


    public UserLogin()
    {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.user_login,container,false);
        return v;
    }

}
