package com.faisal.herukun.listview01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class PlayerAdapter extends BaseAdapter {

    Context context;
    ArrayList<Player> players;
    int layoutId;

    public PlayerAdapter(Context context, ArrayList<Player> players, int layoutId) {
        this.context = context;
        this.players = players;
        this.layoutId = layoutId;
    }

    @Override
    public int getCount() {
        return players.size();
    }

    @Override
    public Object getItem(int position) {
        return players.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(layoutId,null);
        Player p = players.get(position);

        ImageView photoId = view.findViewById(R.id.image_tv);
        TextView nameTv = view.findViewById(R.id.name_tv);
        TextView ageTv = view.findViewById(R.id.age_tv);

        photoId.setImageResource(p.getPhoto());
        nameTv.setText(p.getName());
        ageTv.setText(p.getAge()+"");


        return view;
    }
}