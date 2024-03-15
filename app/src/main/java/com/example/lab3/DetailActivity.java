package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_WORKOUT_ID = "workout_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WorkoutDetailFragment workoutDetailFragment = (WorkoutDetailFragment) Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.detail_frag));

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Object workoutId = extras.get(EXTRA_WORKOUT_ID);
            if (workoutId != null) {
                workoutDetailFragment.setWorkout((int) workoutId);
                return;
            }
        }
        workoutDetailFragment.setWorkout(0);
    }
}