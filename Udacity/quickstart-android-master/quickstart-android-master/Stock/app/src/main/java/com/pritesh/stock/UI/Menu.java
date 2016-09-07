package com.pritesh.stock.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.pritesh.stock.Model.Stocks;
import com.pritesh.stock.R;
import com.pritesh.stock.utils.Constants;

public class Menu extends AppCompatActivity {
    TextView start;
    EditText name;
    DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        start= (TextView) findViewById(R.id.start);
        name=(EditText) findViewById(R.id.name);
        ref= FirebaseDatabase.getInstance().getReference();
    }
    public void start(View view){
        if(!name.getText().toString().isEmpty()) {
            Intent startGame = new Intent(this, Main.class);
            startGame.setFlags(1);
            startGame.putExtra("NAME",name.getText().toString());
            startActivity(startGame);
            finish();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Please Enter Your Name",Toast.LENGTH_SHORT).show();
        }

    }
    public void reset(View view){
        //resetting remaining stocks
        Stocks stocks=new Stocks();
        stocks.setHUL(200000);
        stocks.setITC(200000);
        stocks.setMaruti(200000);
        stocks.setRel(200000);
        stocks.setTisco(200000);
        stocks.setSBI(200000);
        ref.child(Constants.STOCKS).setValue(stocks);

        //resetting rates of the stocks
        Stocks rates=new Stocks();
        rates.setHUL(2);
        rates.setITC(2.5);
        rates.setTisco(3.5);
        rates.setMaruti(5.5);
        rates.setSBI(7.5);
        rates.setRel(8);
        ref.child(Constants.RATES).setValue(rates);
        //total players to 0
        ref.child(Constants.GAME_ID).child(Constants.TOTAL_PLAYERS).setValue(0);
    }

}
