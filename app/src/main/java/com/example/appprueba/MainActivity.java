package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button siguiente;  //ingresamos Button y el nombre de la variable que tendra el boton, que es siguiente

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        siguiente=(Button)findViewById(R.id.btn1); //esta linea encuentra el boton por el id, que es btn1
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity(Tutorial.class);
            }
        });



        //siguiente.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Intent i = new Intent(packageContext: MainActivity.this, Historia.class);
        //        startActivity(i);
        //    }

        //});


    }

    private void openActivity(Class<Tutorial> tutorialClass) {
    }
}