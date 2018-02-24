package com.example.amrihanif.amrihanif_1202150075_modul3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText user, pass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText)findViewById(R.id.user);
        pass = (EditText)findViewById(R.id.pass);
        login = (Button) findViewById(R.id.btLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = user.getText().toString();
                String passwordKey = pass.getText().toString();

                if (usernameKey.equals("ead") && passwordKey.equals("mobile")){
                    Toast.makeText(getApplicationContext(),"Login sukses",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("admin", usernameKey);
                    LoginActivity.this.startActivity(intent);
                } else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setMessage("Username atau password Anda salah !").setNegativeButton("Retry...", null).create().show();
                }
            }
        });
    }
}
