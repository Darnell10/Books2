package c4q.com.books;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by D on 1/3/18.
 */

public class BookHolder extends RecyclerView.ViewHolder {

    private TextView id;
    private TextView cat;
    private TextView name;
    private TextView author;
    private TextView series;
    private TextView genre;
    private TextView inStock;
    private TextView price;
    private TextView pages;


    public BookHolder(View itemView){
        super(itemView);
        id= (TextView)itemView.findViewById(R.id.id);
        cat = (TextView)itemView.findViewById(R.id.cat);
        name=(TextView)itemView.findViewById(R.id.name);
        author=(TextView)itemView.findViewById(R.id.author);
        series=(TextView)itemView.findViewById(R.id.series);
        genre =(TextView)itemView.findViewById(R.id.genre);
        inStock =(TextView)itemView.findViewById(R.id.in_stock);
        price=(TextView)itemView.findViewById(R.id.price);
        pages=(TextView)itemView.findViewById(R.id.pages);

    }

    public void onBind(BooksModel model){

        id.setText(model.getId());
        cat.setText(model.getCat().get(0));
        cat.setText(model.getCat().get(1));
        name.setText(model.getName());
        author.setText(model.getAuthor());
        series.setText(model.getSeries());
        genre.setText(model.getGenre());
        //- Only cast between related types, not to convert values
        //- You can only put Strings in Textviews
        //used .toString() method to convert boolean, double, and its
        inStock.setText(model.getInStock().toString());
        price.setText(Double.toString(model.getPrice()));
        pages.setText(Integer.toString(model.getPages()));
    }
}

