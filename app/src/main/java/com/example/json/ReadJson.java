package com.example.json;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadJson {
    public static SinhVien readJSONFile(Context context) throws IOException, JSONException {

        // Read content of company.json
        String jsonText = readText(context, R.raw.info);


        JSONObject jsonRoot = new JSONObject(jsonText);


        int id= jsonRoot.getInt("id");
        String name = jsonRoot.getString("name");

        JSONObject jsonAddress = jsonRoot.getJSONObject("address");
        String street = jsonAddress.getString("street");
        String city = jsonAddress.getString("city");
        Address address= new Address(street, city);

        SinhVien sinhVien = new SinhVien();
        sinhVien.setId(id);
        sinhVien.setName(name);
        sinhVien.setAdress(address);

        return sinhVien;
    }
    private static String readText(Context context, int resId) throws IOException {
        InputStream is = context.getResources().openRawResource(resId);
        BufferedReader br= new BufferedReader(new InputStreamReader(is));
        StringBuilder sb= new StringBuilder();
        String s= null;
        while((  s = br.readLine())!=null) {
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }

}
