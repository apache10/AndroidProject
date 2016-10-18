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
    private String cost_in_credits;

    @SerializedName("films")
    private List<String> films;

    @SerializedName("model")
    private String model;

    @SerializedName("manufacturer")
    private String manufacturer;

    @SerializedName("length")
    private String length;

    @SerializedName("max_atmosphering_speed")
    private String max_atmosphering_speed;

    @SerializedName("crew")
    private String crew;

    @SerializedName("passengers")
    private String passengers;

    @SerializedName("cargo_capacity")
    private String cargo_capacity;

    @SerializedName("consumables")
    private String consumables;

    @SerializedName("hyperdrive_rating")
    private String hyperdrive_rating;

    @SerializedName("MGLT")
    private String MGLT;

    @SerializedName("starship_class")
    private String starship_class;

    @SerializedName("pilots")
    private List<String> pilots;

    @SerializedName("created")
    private String created;

    @SerializedName("edited")
    private String edited;

    @SerializedName("url")
    private String url;





    public ShipInfo(String name, String cost_in_credits,List<String> films, String model, String manufacturer,
                    String length,String  max_atmosphering_speed, String crew, String passengers, String cargo_capacity,
                    String consumables, String hyperdrive_rating, String MGLT,
                    String starship_class, List<String> pilots, String created, String edited, String url) {
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

    public String getCost() {
        return cost_in_credits;
    }

    public void setCost(String cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
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

    public List<String> getPilots() {
        return pilots;
    }

    public void setPilots(List<String> pilots) {
        this.pilots = pilots;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }

    public String getMGLT() {
        return MGLT;
    }

    public void setMGLT(String MGLT) {
        this.MGLT = MGLT;
    }

    public String getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public void setHyperdrive_rating(String hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public String getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(String cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public void setMax_atmosphering_speed(String max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
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
