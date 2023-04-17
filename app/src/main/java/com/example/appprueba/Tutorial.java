package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class Tutorial extends AppCompatActivity {
    private VideoView vv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        vv1=findViewById(R.id.vv1); //obtengo la referencia

        vv1.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video1));

        MediaController mc=new MediaController(this); //este metodo es para controlar la anchura de video, pausarlo y retroceder
        vv1.setMediaController(mc); //este metodo es para controlar la anchura de video, pausarlo y retroceder
        mc.setAnchorView(vv1);  //este metodo es para controlar la anchura de video, pausarlo y retroceder
        vv1.start(); //inicio el video
    }
}