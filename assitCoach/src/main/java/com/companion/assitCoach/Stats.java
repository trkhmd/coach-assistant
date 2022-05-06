package com.companion.assitCoach;

import lombok.Data;

@Data
public class Stats {
    private int id;
    private int userId;
    private int dribbles;
    private int passes;
    private int finitions;
    private int shots;
    private int center;
    private int ballControl;
    private int placement;
    private int gameSense;
    private int gameVolume;
    private int  anticipation;
    private int acceleration;
    private int agility;
    private int pace;
    private int strength;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getDribbles() {
        return dribbles;
    }

    public void setDribbles(int dribbles) {
        this.dribbles = dribbles;
    }

    public int getPasses() {
        return passes;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }

    public int getFinitions() {
        return finitions;
    }

    public void setFinitions(int finitions) {
        this.finitions = finitions;
    }

    public int getShots() {
        return shots;
    }

    public void setShots(int shots) {
        this.shots = shots;
    }

    public int getCenter() {
        return center;
    }

    public void setCenter(int center) {
        this.center = center;
    }

    public int getBallControl() {
        return ballControl;
    }

    public void setBallControl(int ballControl) {
        this.ballControl = ballControl;
    }

    public int getPlacement() {
        return placement;
    }

    public void setPlacement(int placement) {
        this.placement = placement;
    }

    public int getGameSense() {
        return gameSense;
    }

    public void setGameSense(int gameSense) {
        this.gameSense = gameSense;
    }

    public int getGameVolume() {
        return gameVolume;
    }

    public void setGameVolume(int gameVolume) {
        this.gameVolume = gameVolume;
    }

    public int getAnticipation() {
        return anticipation;
    }

    public void setAnticipation(int anticipation) {
        this.anticipation = anticipation;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getPace() {
        return pace;
    }

    public void setPace(int pace) {
        this.pace = pace;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
