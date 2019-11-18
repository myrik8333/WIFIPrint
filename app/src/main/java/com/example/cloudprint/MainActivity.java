package com.example.cloudprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button1);
        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //интент на класс с  гугл сервисами
                Intent printIntent = new Intent(MainActivity.this, PrintDialogActivity.class);
                //сюда крч  ссылку на документ
                Uri docUri;
                //формат ссылки
                docUri = Uri.parse("/storage/3532-3531/Download/lecture4a.pdf");
                //тип MIME рекомендуется application/pdf
                printIntent.setDataAndType(docUri, "application/pdf");
                // название
                printIntent.putExtra("title","lecture4a");

                startActivity(printIntent);
            }
        };
        button.setOnClickListener(oclBtn);
    }


}
