package com.realdynamite.nestedrecycler;

import android.os.Bundle;
import android.util.Log;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    List<Section> sectionList = new ArrayList<>();
    RecyclerView mainRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainRecyclerView = findViewById(R.id.mainRecyclerView);
        initData();
        mainRecyclerView = findViewById(R.id.mainRecyclerView);
        MainRecyclerAdapter mainRecyclerAdapter = new MainRecyclerAdapter(sectionList);
        mainRecyclerView.setAdapter(mainRecyclerAdapter);

    }
    private void initData() {

        String sectionOneName = "A";
        List<String> sectionOneItems = new ArrayList<>();
        sectionOneItems.add("Advanced Preview Scene");
        sectionOneItems.add("Asset Editor");
        sectionOneItems.add("Asset Loading Insights");
        sectionOneItems.add("Asset Management");
        List<String> sectionOneItems1 = new ArrayList<>();
        List<String>sectionOneItems2 = new ArrayList<>();

        String sectionTwoName = "C";
        List<String> sectionTwoItems = new ArrayList<>();
        sectionTwoItems.add("Cloth Painter - Fill Tool ");
        sectionTwoItems.add("Common");
        sectionTwoItems.add("Common Commands");
        sectionTwoItems.add("Common Designer Commands");
        sectionTwoItems.add("Common Viewport Commands");
        sectionTwoItems.add("Content Browser");
        sectionTwoItems.add("Curve Editor");
        sectionTwoItems.add("Curve Editor Tools");
        List<String>sectionTwoItems1 = new ArrayList<>();
        List<String> sectionTwoItems2 = new ArrayList<>();

        //how should I stracture my code so as to enable me to enter all the values in the UI


        sectionList.add(new Section(sectionOneName, sectionOneItems,sectionOneItems1,sectionOneItems2));
        sectionList.add(new Section(sectionTwoName, sectionTwoItems,sectionTwoItems1,sectionTwoItems2));


        Log.d(TAG, "initData: " + sectionList);
    }
}