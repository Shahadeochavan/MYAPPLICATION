package com.nextech.myschool.SQLite;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nextech.myschool.R;
import com.nextech.myschool.UserContact;

import java.util.List;

/**
 * Created by welcome on 8/4/2016.
 */
public class UserListMyschool extends Fragment implements View.OnClickListener {
    public UserListMyschool() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_user_list_myschool, container, false);
        SQLiteHelper sqLiteHelper = new SQLiteHelper(getContext());
        Log.d("Insert: ", "Inserting ..");
        sqLiteHelper.addUser(new UserContact(1, "Shahadeo", "9403633306"));
        sqLiteHelper.addUser(new UserContact(2, "Mahadeo", "9403633296"));
        sqLiteHelper.addUser( new UserContact(3, "Anil","4563214111" ) );
        Log.d("Reading:", "Reading all userList.");
        List<UserContact> userContacts=sqLiteHelper.getAllUserContact();
        Log.d("Insert ", "Inserting ..");
        for (UserContact userContact : userContacts) {
            String log = "Id" + userContact.getId() + "Name"+ userContact.getName() + "Number" + userContact.getNumber();
            Log.d("UserContact: : ", log);
        }
        return rootView;

    }

    @Override
    public void onClick(View v) {

    }
}