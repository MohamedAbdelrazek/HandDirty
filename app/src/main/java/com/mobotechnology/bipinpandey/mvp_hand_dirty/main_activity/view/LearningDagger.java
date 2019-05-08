package com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mobotechnology.bipinpandey.mvp_hand_dirty.R;
import com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.dagger.Car;
import com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.dagger.CarComponent;
import com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class LearningDagger extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_dagger);
        CarComponent component = DaggerCarComponent.create();
        component.inject(this);
        car.drive();
    }

}
