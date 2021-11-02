package com.example.monumentos;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.monumentos.databinding.ActivityScrollingBinding;

public class ScrollingActivity extends AppCompatActivity {
    Context context;
    private ActivityScrollingBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityScrollingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = binding.toolbar;
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
        toolBarLayout.setTitle(getTitle());



        FloatingActionButton fab = binding.fab;
        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                setContentView(R.layout.formulario);
                Button volver =(Button) findViewById(R.id.volver);
                volver.setOnClickListener(this::volver);


            }
            public void volver(View view) {
                setContentView(binding.getRoot());
            }
        });
        Button boton1,boton2,boton3,boton4;
        boton1=(Button) findViewById(R.id.button1);
        boton2=(Button) findViewById(R.id.button2);
        boton3=(Button) findViewById(R.id.button3);
        boton4=(Button) findViewById(R.id.button4);

        boton1.setOnClickListener(this::mostrar);
        boton2.setOnClickListener(this::preferencias);
        boton3.setOnClickListener(this::acerca);
        boton4.setOnClickListener(this::salir);
    }
    public void mostrar(View view) {
        context = getApplicationContext();
        CharSequence error = "MOSTRAR MONUMENTOS";
        int duracion = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, error, duracion);
        toast.show();
    }
    public void preferencias(View view) {
        context = getApplicationContext();
        CharSequence error = "PREFERENCIAS";
        int duracion = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, error, duracion);
        toast.show();
    }
    public void acerca(View view) {
        context = getApplicationContext();
        CharSequence error = "ACERCA DE";
        int duracion = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, error, duracion);
        toast.show();
    }
    public void salir(View view) {
       finish();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}