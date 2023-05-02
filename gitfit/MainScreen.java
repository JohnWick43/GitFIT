package com.example.gitfit;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainScreen extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_screen, container, false);

        Button profile = view.findViewById(R.id.Profile_But);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //nav logic
                Navigation.findNavController(view).navigate(R.id.action_mainScreen_to_profile);
            }
        });
        Button workout = view.findViewById(R.id.Workout_But);
        workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //nav logic
                Navigation.findNavController(view).navigate(R.id.action_mainScreen_to_workout);
            }
        });
        Button diet = view.findViewById(R.id.Diet_But);
        diet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //nav logic
                Navigation.findNavController(view).navigate(R.id.action_mainScreen_to_dietFragment);
            }
        });


        return view;
    }
}