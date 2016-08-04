package com.nextech.myschool;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class UserList extends Fragment {

    public UserList(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_user_list, container, false);

        ArrayList<UserContact> listContact = getContactList();
        ListView lv = (ListView)rootView.findViewById(R.id.list_item);
        lv.setAdapter(new CustomAdapter(getActivity(), listContact));

        return rootView;
    }

    private ArrayList<UserContact> getContactList(){
        ArrayList<UserContact> contactlist = new ArrayList<UserContact>();

       UserContact contact = new UserContact();

        contact.setName("Shahadeo");
        contact.setNumber("9403633306");
        contactlist.add(contact);

        contact = new UserContact();
        contact.setName("Ankush");
        contact.setNumber("01213869102");
        contactlist.add(contact);

        contact = new UserContact();
        contact.setName("Abhishek");
        contact.setNumber("01213123985");
        contactlist.add(contact);
        contact = new UserContact();

        contact.setName("Mahesh");
        contact.setNumber("21323444444");
        contactlist.add(contact);

        contact = new UserContact();
        contact.setName("Lahu");
        contact.setNumber("122254565656");
        contactlist.add(contact);

        contact = new UserContact();
        contact.setName("Anil");
        contact.setNumber("33332143434");
        contactlist.add(contact);

        contact = new UserContact();
        contact.setName("Sunli");
        contact.setNumber("5656463664");
        contactlist.add(contact);

        return contactlist;
    }
}