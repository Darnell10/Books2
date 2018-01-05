package c4q.com.books;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by D on 1/3/18.
 */

public interface BookService {
    @GET("tamingtext/book/master/apache-solr/example/exampledocs/books.json")
    Call<List<BooksModel>> getBook();
}
