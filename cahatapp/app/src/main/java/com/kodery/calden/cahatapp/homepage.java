package com.kodery.calden.cahatapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class homepage extends AppCompatActivity {

    ListView lst_chat;
    String msg="";
    public ArrayList<String> msglist = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button but_send =(Button) findViewById(R.id.but_send);
        final TextView editText=(TextView)findViewById(R.id.editText);
        but_send.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                msg=editText.getText().toString();
                editText.setText("");
                msglist.add(msg);
                lst_chat = (ListView) findViewById(R.id.lst_chat);
                CustomizedListViewnew adapter=new CustomizedListViewnew(homepage.this,msglist);
                lst_chat.setAdapter(adapter);
            }
        });

        lst_chat = (ListView) findViewById(R.id.lst_chat);
        CustomizedListViewnew adapter=new CustomizedListViewnew(homepage.this,msglist);
        lst_chat.setAdapter(adapter);
    }
}
