package com.example.gaurav.starwar.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaurav on 17/10/16.
 */

public class ShipInfo implements Serializable {
    @SerializedName("name")
    private String name;

    @SerializedName("cost_in_credits")
    private int cost_in_credits;

    @SerializedName("films")
    private String films;

    @SerializedName("model")
    private String model;

    @SerializedName("manufacturer")
    private String manufacturer;

    @SerializedName("length")
    private int length;

    @SerializedName("max_atmosphering_speed")
    private int max_atmosphering_speed;

    @SerializedName("crew")
    private int crew;

    @SerializedName("passengers")
    private int passengers;

    @SerializedName("cargo_capacity")
    private int cargo_capacity;

    @SerializedName("consumables")
    private String consumables;

    @SerializedName("hyperdrive_rating")
    private double hyperdrive_rating;

    @SerializedName("MGLT")
    private int MGLT;

    @SerializedName("starship_class")
    private String starship_class;

    @SerializedName("pilots")
    private String pilots;

    @SerializedName("created")
    private String created;

    @SerializedName("edited")
    private String edited;

    @SerializedName("url")
    private String url;





    public ShipInfo(String name, int cost_in_credits,String films, String model, String manufacturer,
                    int length,int  max_atmosphering_speed, int crew, int passengers, int cargo_capacity,
                    String consumables, double hyperdrive_rating, int MGLT,
                    String starship_class, String pilots, String created, String edited, String url) {
        this.name = name;
        this.cost_in_credits = cost_in_credits;
        this.films = films;
        this.model=model;
        this.manufacturer=manufacturer;
        this.length=length;
        this.max_atmosphering_speed=max_atmosphering_speed;
        this.crew=crew;
        this.passengers=passengers;
        this.cargo_capacity=cargo_capacity;
        this.consumables=consumables;
        this.hyperdrive_rating=hyperdrive_rating;
        this.MGLT=MGLT;
        this.starship_class=starship_class;
        this.pilots=pilots;
        this.created=created;
        this.edited=edited;
        this.url=url;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost_in_credits;
    }

    public void setCost(int cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public String getFilms() {
        return films;
    }

    public void setFilms(String films) {
        this.films = films;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getPilots() {
        return pilots;
    }

    public void setPilots(String pilots) {
        this.pilots = pilots;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public int getMGLT() {
        return MGLT;
    }

    public void setMGLT(int MGLT) {
        this.MGLT = MGLT;
    }

    public double getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public void setHyperdrive_rating(double hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public int getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(int cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public void setMax_atmosphering_speed(int max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }
}
