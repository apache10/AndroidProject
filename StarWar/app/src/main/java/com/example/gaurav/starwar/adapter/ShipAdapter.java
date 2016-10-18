package com.example.gaurav.starwar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gaurav.starwar.R;
import com.example.gaurav.starwar.model.ShipInfo;

import java.util.List;

/**
 * Created by gaurav on 18/10/16.
 */

public class ShipAdapter extends RecyclerView.Adapter<ShipAdapter.MyViewHolder> {

    private List<ShipInfo> ShipList;

    public ShipAdapter(List<ShipInfo> shipList) {
        ShipList = shipList;
    }

    @Override

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.ship_list_name,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ShipInfo shipInfo= ShipList.get(position);
        holder.pname.setText(shipInfo.getName());
        holder.run.setText(shipInfo.getCost());
        holder.age.setText(shipInfo.getFilms().get(0));
    }

    @Override
    public int getItemCount() {
        return ShipList.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        public TextView pname,run,age;

        public MyViewHolder(View view){
            super(view);
            pname=(TextView)view.findViewById(R.id.name);
            run=(TextView)view.findViewById(R.id.run);
            age=(TextView)view.findViewById(R.id.age);
        }

    }
}