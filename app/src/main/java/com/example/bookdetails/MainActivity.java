package com.example.bookdetails;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBookButtonClick(View view) {
        int buttonId = view.getId();
        Intent intent = new Intent(MainActivity.this, BookDetailsActivity.class);

        switch (buttonId) {
            case R.id.book1Button:
                intent.putExtra("bookTitle", "Book 1");
                intent.putExtra("bookAuthor", "Author 1");
                break;
            case R.id.book2Button:
                intent.putExtra("bookTitle", "Book 2");
                intent.putExtra("bookAuthor", "Author 2");
                break;
            case R.id.book3Button:Button:
                intent.putExtra("bookTitle", "Book 3");
                intent.putExtra("bookAuthor", "Author 3");
                break;
            case R.id.book4Button:Button:
                intent.putExtra("bookTitle", "Book 4");
                intent.putExtra("bookAuthor", "Author 4");
                break;
        }

        startActivity(intent);
    }
}
