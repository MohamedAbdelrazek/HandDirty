package com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.dagger;

import com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.view.LearningDagger;

import dagger.Component;

@Component
public interface CarComponent {

    //Car getCar();

    void inject(LearningDagger learningDagger);

}
