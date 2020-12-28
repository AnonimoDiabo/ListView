package com.anonimodiabo.listviewaddcustomdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText edtInput;
    Button btnSave;
    ListView lvData;

    ArrayList<String> datalist = new ArrayList<>();
    ArrayAdapter<String> dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtInput = findViewById(R.id.edt_input);
        btnSave = findViewById(R.id.btn_save);
        lvData = findViewById(R.id.lv_data);
        dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datalist);
        lvData.setAdapter(dataAdapter);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datalist.add(edtInput.getText().toString());
                dataAdapter.notifyDataSetChanged();
                edtInput.setText("");

            }
        });


    }
}
