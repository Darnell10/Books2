package c4q.com.books;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class BooksMainActivity extends AppCompatActivity {

    public static final String TAG = "BOOKS LIST";

    List<BooksModel> books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books_main);


        //Retrofit set up
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        BookService bookService = retrofit.create(BookService.class);


        //Call using the BookService class
        //On response lets the app know to post recyclerview
        Call<List<BooksModel>> book = bookService.getBook();
        book.enqueue(new Callback<List<BooksModel>>() {
            @Override
            public void onResponse(Call<List<BooksModel>> call, Response<List<BooksModel>> response) {
                books=response.body();
                // Have the recycler view setup here so that the on response can get it
                //Only paint dynamic views when we have the data ready to populate them
                // (i.e, a Retrofit body loaded as a list for a RecyclerView Adapter)
                RecyclerView bookRecyclerView = (RecyclerView) findViewById(R.id.books_recyclerview);
                BookAdapter bookAdapter = new BookAdapter(books);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
                bookRecyclerView.setAdapter(bookAdapter);
                bookRecyclerView.setLayoutManager(linearLayoutManager);



            }

            //tells app trow anything not responded to.
            @Override
            public void onFailure(Call<List<BooksModel>> call, Throwable t) {

            }
        });


    }
}