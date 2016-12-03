package com.example.hp.exercise6_mvc;

/**
 * Created by hp on 12/03/2016.
 */

public class UserController {
    public boolean Login(User myuser){
        if(myuser.username.equals("admin") && myuser.password.equals("admin"))
            return true;
        else
            return false;

    }
}
