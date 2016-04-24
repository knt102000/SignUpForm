package com.example.chiutsui.signupform;

import java.io.Serializable;

/**
 * Created by chiutsui on 4/24/16.
 */
public class User implements Serializable {
    private String mUsername;
    private String mPassword;

    User(String username, String password) {
        this.mUsername = username;
        this.mPassword = password;
    }

    public String getUsername() {
        return mUsername;
    }

}
