package com.example.mymusik;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.Objects;

public class Home extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.activity_home, container, false);
    }

    SharedPreferences sharedPreferences;
    private static final String SHARED_PREF_NAME = "my_pref";
    private static final String KEY_USERNAME = "username";

    Button btnLogout;
    TextView Homeusername;
    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sharedPreferences = getActivity().getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        String user = sharedPreferences.getString(KEY_USERNAME,"Null");
        Homeusername = view.findViewById(R.id.home_username);
        Homeusername.setText(user);
        btnLogout = view.findViewById(R.id.buttonLogOut);
        sharedPreferences = getActivity().getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"Terimakasih " + sharedPreferences.getString(KEY_USERNAME,"None"), Toast.LENGTH_LONG).show();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear(); editor.apply();
                Intent i = new Intent(getContext(), MainActivity.class);
                Objects.requireNonNull(getActivity()).finish();
                Objects.requireNonNull(getContext()).startActivity(i);

            }
        });
    }

}