package com.example.listviewexample1;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Declaration
    ListView lview;
    ArrayAdapter arp;
    private String[] users = {"Gad", "Pascal", "Boscizo", "Normand", "Peter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lview = (ListView)findViewById(R.id.userlist);
        arp = new ArrayAdapter(this, android.R.layout.simple_list_item_1, users);
        lview.setAdapter(arp);
    }
}