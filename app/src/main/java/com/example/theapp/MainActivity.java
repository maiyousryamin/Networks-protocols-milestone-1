package com.example.theapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private TextView Info;
    private Button Login;
    int counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //typecasting the button and texts to the vaiables
        Email = (EditText)findViewById(R.id.editMail);
        Password = (EditText)findViewById(R.id.editPassword);
        Info = (TextView)findViewById(R.id.textView);
        Login = (Button)findViewById(R.id.btnLogin);
        Info.setText("no of attempts remaining : 5");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openListActivity(Email.getText().toString(),Password.getText().toString());

            }
        });


    }
    public void openListActivity(String useremail,String userpassword){
       if(useremail!= null && userpassword != null){
        Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(intent);
       }
       else{
           counter--;
           Info.setText("no of attempts remaining:" + String.valueOf(counter));
           if(counter == 0){
               Login.setEnabled(false);
           }
       }

    }


}





