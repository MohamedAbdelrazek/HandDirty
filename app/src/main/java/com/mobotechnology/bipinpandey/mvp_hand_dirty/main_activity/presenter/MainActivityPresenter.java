package com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.presenter;

import com.mobotechnology.bipinpandey.mvp_hand_dirty.main_activity.model.User;


public class MainActivityPresenter {

    private User user;
    private View view;

    public MainActivityPresenter(View view) {
        this.user = new User();
        this.view = view;
    }

    public void updateFullName(String fullName){
        user.setFullName(fullName);
       view.updateUserInfoTextView(user.toString());


    }

    public void updateEmail(String email){

        user.setEmail(email);
        view.updateUserInfoTextView(user.toString());

    }
    public void show(){

        view.showProgressBar();

    }
    public void hide(){

        view.hideProgressBar();

    }


    public interface View {
        void updateUserInfoTextView(String info);
        void showProgressBar();
        void hideProgressBar();

    }
}
