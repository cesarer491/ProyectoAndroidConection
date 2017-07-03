package com.cesar491.cesar.ccciconection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txt_user;
    EditText txt_pass;
    Button btn_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_user = (EditText)findViewById(R.id.edit_user);
        txt_pass = (EditText)findViewById(R.id.edit_pass);
        btn_entrar = (Button)findViewById(R.id.btn_entrar);

        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CheckLogin(txt_user.getText().toString().toLowerCase(),txt_pass.getText().toString().toLowerCase());
            }
        });
    }

    public void CheckLogin(String user, String pass){

        Toast.makeText(this,"User= "+ user +" pass " + pass,Toast.LENGTH_SHORT).show();
    }
}
