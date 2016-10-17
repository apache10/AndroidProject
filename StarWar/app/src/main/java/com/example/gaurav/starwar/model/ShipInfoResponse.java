package com.example.gaurav.starwar.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by gaurav on 17/10/16.
 */

public class ShipInfoResponse {
    @SerializedName("count")
    private int count;

    @SerializedName("results")
    private List<ShipInfo> results;

    @SerializedName("next")
    private int next;

    @SerializedName("previous")
    private int previous;

    public int getCount(){
        return count;
    }

    public void setCount(int count){
        this.count=count;
    }

    public List<ShipInfo> getResults(){
        return results;
    }
    public void setResults(List<ShipInfo> results){
        this.results=results;
    }

    public int getNext(){
        return next;
    }

    public void setNext(int next){
        this.next=next;
    }

    public int getPrevious(){
        return previous;
    }

    public void setPrevious(int previous){
        this.previous=previous;
    }
}
