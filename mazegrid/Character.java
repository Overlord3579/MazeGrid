package com.example.a203241.mazegrid;

public class Character
{

    float x;
    float y;
    float oldx; //these are for covering up the player's last position  with a white square
    float oldy;

    boolean badx;
    boolean bady;

    public Character()
    {
        x = 10f;
        y = 20f;
        oldx = 10f;
        oldy = 20f;
    }

    public void resetCharacter()
    {
        x = 20f;
        y = 20f;
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public float getOldx()
    {
        return oldx;
    }

    public float getOldy()
    {
        return oldy;
    }

}
