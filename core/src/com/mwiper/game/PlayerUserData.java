package com.mwiper.game;

import com.badlogic.gdx.math.Vector2;
import com.mwiper.game.utils.Constants;

/**
 * Created by Matt on 11/8/2015.
 */
public class PlayerUserData extends UserData {

    private Vector2 jumpingLinearImpluse;

    public PlayerUserData(){
        super();
        jumpingLinearImpluse = Constants.PLAYER_JUMPING_IMPLUSE;
        userDataType = enums.UserDataType.PLAYER;
    }

    public Vector2 getJumpingLinearImpluse(){
        return jumpingLinearImpluse;
    }

    public void setJumpingLinearImpluse(Vector2 jumpingLinearImpluse){
        this.jumpingLinearImpluse = jumpingLinearImpluse;
    }
}
