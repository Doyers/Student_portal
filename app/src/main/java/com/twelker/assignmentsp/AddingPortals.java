package com.twelker.assignmentsp;

import android.content.Intent;
import android.os.Debug;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddingPortals extends AppCompatActivity {

    private Button AddPortal;
    private TextInputEditText URL, Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_portals);

        AddPortal = findViewById(R.id.button);
        URL = findViewById(R.id.URLInput);
        Title = findViewById(R.id.TitleInput);

        AddPortal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(URL.getText().toString() != null && Title.getText().toString() != null){
                    Intent Overview = new Intent(AddingPortals.this , MainActivity.class);
                    startActivity(Overview);
                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Fill both text boxes", Toast.LENGTH_SHORT); toast.show();
                }
            }
        });
    }
}
