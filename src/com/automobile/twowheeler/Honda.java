package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
    public String getModelName() {
        return "Honda Shine";
    }

    public String getRegistrationNumber() {
        return "MH12CD5678";
    }

    public String getOwnerName() {
        return "Anita Desai";
    }

    public int getSpeed() {
        return 90;
    }

    public void cdplayer() {
        System.out.println("CD Player is running in Honda bike");
    }
}
