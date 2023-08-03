package com.example.bookdetails;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class BookDetailsActivity extends AppCompatActivity {

    private TextView bookTitleTextView;
    private TextView bookAuthorTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);
        bookTitleTextView = findViewById(R.id.bookTitleTextView);
        bookAuthorTextView = findViewById(R.id.bookAuthorTextView);
        String bookTitle = getIntent().getStringExtra("bookTitle");
        String bookAuthor = getIntent().getStringExtra("bookAuthor");
        bookTitleTextView.setText(bookTitle);
        bookAuthorTextView.setText(bookAuthor);
    }
}

