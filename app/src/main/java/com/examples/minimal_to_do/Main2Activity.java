package com.examples.minimal_to_do;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main2Activity extends AppCompatActivity {
    EditText etTitle;
    //Content content;
    //String item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("");

        init();
    }

    void init() {
        etTitle = (EditText) findViewById(R.id.etTitle);
        //content=getIntent().getParcelableExtra("Content");
        //item=content.getTitle();
        //etTitle.setText(item);
    }

    public void onClick(View v) {
        Intent intent = new Intent();

        String title = etTitle.getText().toString();

        Content temp = new Content(title);

        intent.putExtra("Content", temp);
        setResult(RESULT_OK, intent);
        finish();
    }

    String getTime() {
        String time;

        long now = System.currentTimeMillis();
        // 현재시간을 date 변수에 저장한다.
        Date date = new Date(now);
        // 시간을 나타냇 포맷을 정한다 ( yyyy/MM/dd 같은 형태로 변형 가능 )
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        // nowDate 변수에 값을 저장한다.
        time = sdf.format(date);


        return time;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.input_menu, menu);


        return true;
    }
}
