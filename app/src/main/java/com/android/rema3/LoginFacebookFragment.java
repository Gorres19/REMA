package com.android.rema3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class LoginFacebookFragment extends LoginActivity {

    TextView FullName,Gender,Facebook_ID,Email,Facebook_Link;
    ImageView Image;
    String facebook_id, facebook_link, f_name, m_name, l_name, gender, profile_image, full_name, email_id;
    @Override
    public void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
        setContentView(R.layout.facebook_credentials);

        Facebook_ID = (TextView)findViewById(R.id.FacebookID);
        Facebook_Link = (TextView) findViewById(R.id.facebookLink);
        FullName = (TextView)findViewById(R.id.Fullname);
        Gender = (TextView)findViewById(R.id.gender);
        Email = (TextView)findViewById(R.id.email);


        Intent i = getIntent();
        Bundle creds = i.getExtras();

        if(creds != null)
        {
            facebook_id = (String) creds.get("facebook_id");
            Facebook_ID.setText(facebook_id);

            facebook_link = (String) creds.get("facebook_link");
            Facebook_Link.setText(facebook_link);

            full_name = (String) creds.get("full_name");
            FullName.setText(full_name);

            gender = (String) creds.get("gender");
            Gender.setText(gender);

            email_id = (String) creds.get("email_id");
            Email.setText(email_id);
        }

//        i.getStringExtra("type");
//        i.getStringExtra("facebook_id");
//        i.getStringExtra("f_name");
//        i.getStringExtra("m_name");
//        i.getStringExtra("l_name");
//        i.getStringExtra("full_name");
//        i.getStringExtra("profile_image");
//        i.getStringExtra("email_id");
//        i.getStringExtra("gender");
    }

}
