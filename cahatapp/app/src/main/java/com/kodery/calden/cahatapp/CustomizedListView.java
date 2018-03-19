package com.kodery.calden.cahatapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by calden on 18/3/18.
 */

public class CustomizedListView extends BaseAdapter{

    Context context;
    LayoutInflater layoutInflater;

    String[] empname ={"Calden","Roshan","Kyle","Pratik","Shadrak","Chaitanya","Sarah","Shree"};
    int[] txtcounty={10,5,1,10,4,12,5,0};

    public CustomizedListView(Context context){
        this.context=context;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return empname.length;
    }

    @Override
    public Object getItem(int i) {
        return empname[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {

        view=layoutInflater.inflate(R.layout.customized_list_view,null);
        final TextView txtname=(TextView)view.findViewById(R.id.txtname);
        final TextView txtcount=(TextView)view.findViewById(R.id.txtcount);

        txtname.setText(empname[i]);
        txtcount.setText(""+txtcounty[i]);

        view.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Toast.makeText(context,txtname.getText()+"'s ChatRoom",Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent();
                    intent.setClass(context,homepage.class);
                    context.startActivity(intent);
            }
        });

        return view;
    }
}
