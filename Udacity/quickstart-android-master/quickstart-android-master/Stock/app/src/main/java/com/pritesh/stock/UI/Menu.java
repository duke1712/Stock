package com.pritesh.stock.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.pritesh.stock.R;

public class Menu extends AppCompatActivity {
    TextView start;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        start= (TextView) findViewById(R.id.start);
        name=(EditText) findViewById(R.id.name);
    }
    public void start(View view){
        if(name.getText().toString()!=null) {
            Intent startGame = new Intent(this, Main.class);
            startGame.setFlags(1);
            startGame.putExtra("NAME",name.getText().toString());
            startActivity(startGame);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Please Enter Your Name",Toast.LENGTH_SHORT).show();
        }

    }
}
