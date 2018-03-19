package com.kodery.kyle.maybefinal;

/**
 * Created by kyle on 18/3/18.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

public class AndroidMaterialSpinner extends AppCompatActivity {


    String[] SPINNERLIST = {"Department of Pinoys", "Department of Peruvians", "Deparment of Pros", "Some department"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_material_design_spinner);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, SPINNERLIST);
        MaterialBetterSpinner materialDesignSpinner = (MaterialBetterSpinner)
                findViewById(R.id.android_material_design_spinner);
        materialDesignSpinner.setAdapter(arrayAdapter);
    }
}
