package com.example.dialogactivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Button btnAlert;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlert = (Button) findViewById(R.id.btnAlert);
        btnAlert.setOnClickListener(view -> openAlertDialouge());
    }

    private void openAlertDialouge() {

        AlertDialog.Builder  builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert");
        builder.setMessage("Dialog Box is Ready !");
        builder.setPositiveButton("Yes", (dialogInterface, i) -> Toast.makeText(this, "Positive button clicked", Toast.LENGTH_SHORT).show());

        builder.setNegativeButton("No", (dialogInterface, i) -> Toast.makeText(this, "negative button clicked", Toast.LENGTH_SHORT).show());

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}