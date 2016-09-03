package com.pritesh.stock.UI;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.pritesh.stock.R;
import com.pritesh.stock.utils.Constants;

import java.util.HashMap;
import java.util.Map;

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
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Please Enter Your Name",Toast.LENGTH_SHORT).show();
        }

    }
    public void reset(View view){
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                dataSnapshot.child(Constants.GAME_ID).child(Constants.PLAYERS).getRef().setValue(null);
                Map<String,Object> change=new HashMap<String, Object>();
                change.put(Constants.HUL,"200000");
                change.put(Constants.ITC,"200000");
                change.put(Constants.TISCO,"200000");
                change.put(Constants.MARUTI,"200000");
                change.put(Constants.SBI,"200000");
                change.put(Constants.REL,"200000");


                dataSnapshot.child(Constants.GAME_ID).child(Constants.STOCKS).getRef().updateChildren(change);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

}
