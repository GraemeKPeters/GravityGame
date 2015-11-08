package com.mwiper.game;

/**
 * Created by Matt on 11/8/2015.
 */
public abstract class UserData {
    protected enums.UserDataType userDataType;

    public UserData(){

    }

    public enums.UserDataType getUserDataType(){
        return userDataType;
    }
}
