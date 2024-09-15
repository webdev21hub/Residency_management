package com.example.residency_management;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {
TextView tvlogin;
FirebaseAuth auth;
EditText mail,pass;
Button registerbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        registerbtn=findViewById(R.id.registerbtn);
        mail=findViewById(R.id.edemail);
        pass=findViewById(R.id.edpassword);
        tvlogin=findViewById(R.id.tvlogin);
        auth= FirebaseAuth.getInstance();
        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lintent=new Intent(register.this,MainActivity.class);
                startActivity(lintent);
            }
        });
        registerbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String smail=mail.getText().toString();
               String spass=pass.getText().toString();
                register(smail,spass);
            }
        });
    }
    private void register(String strmail,String strpass)
    {
        auth.createUserWithEmailAndPassword(strmail,strpass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(),"Registered Successfully",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Registration Failed",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}