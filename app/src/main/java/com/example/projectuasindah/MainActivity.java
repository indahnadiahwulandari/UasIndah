package com.example.projectuasindah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SkinRoutine extends AppCompatActivity implements View.OnClickListener{
    private Button btn_back;
    TextView bella;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin_routine);

        bella=(TextView)findViewById (R.id.routine);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/White Star free.otf");
        bella.setTypeface(customfont);

        btn_back = findViewById(R.id.btn_back);
        btn_back.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_back:
                finish();
        }
    }
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bella3=(TextView)findViewById (R.id.skin);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/White Star free.otf");
        Bella3.setTypeface(customfont);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("bellafebri") && passwordKey.equals("123")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(MainActivity.this, Utama.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }
            }
        });
    }
}
