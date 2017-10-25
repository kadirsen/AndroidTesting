package com.snehpandya.androidtesting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by sneh.pandya on 24/10/17.
 */

public class FourthActivity extends AppCompatActivity {

    private ListView mListView;
    public String[] strings = {"Alpha", "Beta", "Cupcake", "Donut", "Eclair", "Froyo",
            "Gingerbread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat",
            "Lollipop", "Marshmallow", "Nougat", "Oreo", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        mListView = (ListView) findViewById(R.id.listview);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.array_list_item, strings);

        mListView.setAdapter(adapter);
    }
}
