package me.charlesqu.chatapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;//
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

//10/25/17 7:37
public class MainActivity extends AppCompatActivity   {


    EditText nameInput;
    EditText chatroomInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initiate view's
        nameInput = (EditText)findViewById(R.id.NameEdittext);
        chatroomInput = (EditText)findViewById(R.id.UsernameEdittext);
        Switch IncogButton = (Switch) findViewById(R.id.IncogButton);
        IncogButton.setOnCheckedChangeListener(new OnCheckedChangeListener() {//
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Switch IncogButton= (Switch) findViewById(R.id.IncogButton);
                Boolean switchState = IncogButton.isChecked();


            }
        });


        //what makes the activity look like not shit and something- it will look like your activity main
    }

    public void enterChat(View view){


        
        String name = nameInput.getText().toString();
        String chatRoomName = chatroomInput.getText().toString();
        if(!name.equals("") && !chatRoomName.equals("")) {
            Intent intent = new Intent(this, ChatActivity.class); // the sec intent is in this line is the name of this new intent; this is a context, which is transported from this to chatactivity
            intent.putExtra("userName",name); //putExtra is when you want to transport a thing, and "userName" is the name of this subject, the subject is nam
            intent.putExtra("chatroomName", chatRoomName);
            /* intent.putExtra("boolean",) */
            startActivity(intent); // executed the intent you setup, which means makes this thing happen




        }else{
            Toast.makeText(this, "Incomplete information!", Toast.LENGTH_SHORT).show();

        }










    }


}
