package mx.edu.tesoem.isc.ctol.a7s212021prac9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DatallesActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datalles2);

        String nombre = getIntent().getExtras().get("Nombre").toString();

        getSupportActionBar().setTitle(nombre);
    }
}