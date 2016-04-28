package com.login;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaldaeej on 4/28/2016.
 */
public class ListDataAdapter extends ArrayAdapter {
    List list = new ArrayList();
    public ListDataAdapter(Context context, int resource) {
        super(context, resource);
    }
    static class LayoutHandeler {

        TextView type, name, price;
    }

    @Override
    public void add(Object object){
        super.add(object);
        list.add(object);
    }
    @Override
    public int getCount(){
        return list.size();
    }
    @Override
    public Object getItem(int position){
        return list.get(position);
    }
    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        View row = convertView;
        LayoutHandeler layoutHandeler;
        if(row == null){
            LayoutInflater layoutInflater = (LayoutInflater)this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.row_layout, parent,false);
            layoutHandeler = new LayoutHandeler();
            layoutHandeler.type = (TextView)row.findViewById(R.id.Type);
            layoutHandeler.name = (TextView)row.findViewById(R.id.Name);
            layoutHandeler.price = (TextView)row.findViewById(R.id.Price);
            row.setTag(layoutHandeler);
        }
        else {
            layoutHandeler = (LayoutHandeler)row.getTag();
        }
        DataProvider dataProvider = (DataProvider)this.getItem(position);
        layoutHandeler.type.setText(dataProvider.getType());
        layoutHandeler.name.setText(dataProvider.getName());
        layoutHandeler.price.setText(dataProvider.getPrice());

        return row;
    }
}
