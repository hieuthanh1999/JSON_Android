package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView txtview;
    Button btnshow;
    String json = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Gson gson = new Gson();

//        ArrayList<SinhVien> sinhViens = new ArrayList<>();
//        sinhViens.add(new SinhVien("HieuThanh", 21, "HaNoi"));
//        sinhViens.add(new SinhVien("VienTran", 21, "ThaiBinh"));
//        sinhViens.add(new SinhVien("NamAnh", 21, "HaNoi"));
////        SinhVien sinhVien = new SinhVien("Thanh", 21, "HaNoi");
////
//        String json = gson.toJson(sinhViens);

        txtview = (TextView) findViewById(R.id.viewshow);
        btnshow = (Button) findViewById(R.id.btnshow);


//        xuly();


        btnshow.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              run(view);

          }
      });



    }

        public void run(View v)  {
            try {

                SinhVien sinhVien= ReadJson.readJSONFile(this);

                txtview.setText(sinhVien.toString());
            } catch(Exception e)  {
                txtview.setText(e.getMessage());
                e.printStackTrace();
            }
        }








}
