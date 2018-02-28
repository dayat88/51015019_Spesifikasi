package com.mylibary.acer.spesifikasi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText editText1, editText2;
    CheckBox checkBox1;
    String text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

            editText2 = (EditText) findViewById(R.id.password);
            checkBox1 = (CheckBox) findViewById(R.id.checkBox);

            checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    if (!isChecked){
                        editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    }else {
                        editText2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                    }
                }
            });
        }

    public void login (View view) {
        editText1 = (EditText) findViewById(R.id.username);
        editText2 = (EditText) findViewById(R.id.password);
        text1 = editText1.getText().toString();
        text2 = editText2.getText().toString();

        if ((text1.contains("user"))&&((text2.contains("12345"))))
        {
            Toast.makeText(this,"Berhasil", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(login.this,MainActivity.class);
            startActivity(intent);
        }

        else if ((text1.matches("")||text2.matches("")))
        {
            Toast.makeText(this,"Isi Username dan Password", Toast.LENGTH_SHORT).show();
        }

        else {
            Toast.makeText(this,"User Tidak Ada", Toast.LENGTH_SHORT).show();
        }
    }
}