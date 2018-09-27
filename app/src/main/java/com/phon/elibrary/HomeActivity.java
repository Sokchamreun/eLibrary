package com.phon.elibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        HomeAdapter homeAdapter = new HomeAdapter();

        Book book1 = new Book();
        book1.setTitle("Java Programming");
        book1.setAuthor("Mr. A");
        book1.setSize("2MB");

        Book book2 = new Book();
        book2.setTitle("VB.Net");
        book2.setAuthor("Mr. B");
        book2.setSize("2MB");

        Book book3 = new Book();
        book3.setTitle("PHP");
        book3.setAuthor("Mr. C");
        book3.setSize("2MB");

        Book[] book = new Book[3];
        book[0] = book1;
        book[1] = book2;
        book[2] = book3;

        homeAdapter.setData(book);
        recyclerView.setAdapter(homeAdapter);



    }
}
