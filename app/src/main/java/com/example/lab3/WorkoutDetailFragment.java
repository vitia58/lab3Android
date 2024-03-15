package com.example.lab3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class WorkoutDetailFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        setWorkout(0);
    }

    public void setWorkout(long id) {
        View view = getView();
        if (view != null) {
            TextView title = view.findViewById(R.id.title);
            TextView description = view.findViewById(R.id.text);
            Workout workout = Workout.workouts[(int) id];
            title.setText(workout.getTitle());
            description.setText(workout.getText());
        }
    }
}