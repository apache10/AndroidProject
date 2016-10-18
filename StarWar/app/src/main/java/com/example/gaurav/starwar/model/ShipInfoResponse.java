package com.example.gaurav.starwar.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by gaurav on 17/10/16.
 */

public class ShipInfoResponse {
    @SerializedName("count")
    private String count;

    @SerializedName("results")
    private List<ShipInfo> results;

    @SerializedName("next")
    private String next;

    @SerializedName("previous")
    private String previous;

    public ShipInfoResponse(String count, List<ShipInfo> results, String next, String previous){
        this.results=results;
        this.count=count;
        this.next=next;
        this.previous=previous;
    }

    public String getCount(){
        return count;
    }

    public void setCount(String count){
        this.count=count;
    }

    public List<ShipInfo> getResults(){
        return results;
    }
    public void setResults(List<ShipInfo> results){
        this.results=results;
    }

    public String getNext(){
        return next;
    }

    public void setNext(String next){
        this.next=next;
    }

    public String getPrevious(){
        return previous;
    }

    public void setPrevious(String previous){
        this.previous=previous;
    }
}
