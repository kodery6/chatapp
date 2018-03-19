package com.kodery.kyle.maybefinal;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kyle on 18/3/18.
 */

public class CustomizedListViewnew extends BaseAdapter{

    Context context;
    LayoutInflater layoutInflater;

    //String[] msglist ={"msg1","msg2","msg3","msg4","msg5","msg6","msg7"};
    ArrayList<String> msglist=new ArrayList<String>();
    //msglist.add();
    //int[] txtcounty={10,5,1,10,4,12,5,0};

    public CustomizedListViewnew(Context context, ArrayList<String> msg){
        this.context=context;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //int len=msglist.length;
        //msglist.add(msg);

        //msglist = (ArrayList<String>)msg.clone();
        for(int i=0;i<msg.size();i++)
        {
         msglist.add(msg.get(i));
        }
    }

    @Override
    public int getCount() {
        return msglist.size();
    }

    @Override
    public Object getItem(int i) {
        return msglist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        view=layoutInflater.inflate(R.layout.customized_list_view_new,null);
        final TextView msgtext=(TextView)view.findViewById(R.id.msgtext);
        //final TextView txtcount=(TextView)view.findViewById(R.id.txtcount);

        msgtext.setText(msglist.get(i));

        return view;
    }
}
