package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }
    //making connecction to read json
    public class Json extends AsyncTask<String, String, String>{

        @Override
        protected String doInBackground(String... strings) {

            try {
                HttpURLConnection connect;
                StringBuffer convert;
                URL web= new URL(https://swapi.dev/api/people/?format=json);
                connect= (HttpURLConnection) web.openConnection();
                BufferedReader read;
                connect.connect();
                //store data
                InputStream data = connect.getInputStream();
                //to read data
                 read = new BufferedReader(new InputStreamReader(data));
                 convert = new StringBuffer();
                String hold="";
                //loop
                while ((hold= read.readLine())!=null);{convert.append(hold);}

                String collection= convert.toString();
                JSONObject parent = new JSONObject(collection);
                JSONArray array= parent.getJSONArray("films");

            }catch (MalformedURLException e){e.printStackTrace();}
            catch (IOException e){e.printStackTrace();}
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }
    }
}

