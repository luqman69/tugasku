package com.example.user.datadiri;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nomerKu(View view){
        Uri uri = Uri.parse("tel:081225410447");
        Intent it = new Intent (Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void petaKu (View view){
        Uri uri = Uri.parse("geo:-7.029144, 110.471765");
        Intent it = new Intent (android.content.Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void mailKu (View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"luqmankhoiruddin999@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Email dari Aplikasi Android Studio");

        try {
            startActivity(Intent.createChooser(intent, "Kirim Email Bos?"));
        } catch (android.content.ActivityNotFoundException ex) {

        }
    }
}
