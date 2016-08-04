package com.nextech.myschool;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
public class CustomAdapter extends BaseAdapter{
    private static ArrayList<UserContact> listContact;

    private LayoutInflater mInflater;

    public CustomAdapter(Context context, ArrayList<UserContact> results){
        listContact = results;
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return listContact.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return listContact.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder holder;
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.fragment_user_list, null);
            holder = new ViewHolder();
            holder.txtname = (TextView) convertView.findViewById(R.id.contact_name);
            holder.txtphone = (TextView) convertView.findViewById(R.id.phone_number);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtname.setText(listContact.get(position).getName());
        holder.txtphone.setText(listContact.get(position).getNumber());

        return convertView;
    }

    static class ViewHolder{
        TextView txtname, txtphone;
    }
}