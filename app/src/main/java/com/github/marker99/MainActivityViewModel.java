package com.github.marker99;

import androidx.lifecycle.LiveData;

import com.google.firebase.auth.FirebaseUser;

public interface MainActivityViewModel {
    LiveData<FirebaseUser> getCurrentUser();
    //Fixme: Signout her bliver vidst aldrig brugt?
    void signOut();
}
