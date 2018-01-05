package c4q.com.books;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by D on 1/3/18.
 */

public class BookAdapter extends RecyclerView.Adapter<BookHolder> {

    List<BooksModel> bookList;

    public BookAdapter(List<BooksModel> bookList){
        this.bookList = bookList;
    }

    @Override
    public BookHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View childView= LayoutInflater.from(parent.getContext()).inflate(R.layout.bookslayout,parent,false);
        return new BookHolder(childView);
    }

    @Override
    public void onBindViewHolder(BookHolder holder, int position){
        BooksModel model =bookList.get(position);
        holder.onBind(model);
    }

    public int getItemCount(){
        return bookList.size();
    }
}
