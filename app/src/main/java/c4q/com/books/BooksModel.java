package c4q.com.books;

import java.util.ArrayList;

/**
 * Created by D on 1/3/18.
 */

public class BooksModel {


    private String id;
    private ArrayList<String> cat;
    private String name;
    private String author;
    private String series;
    private String genre;
    private Boolean inStock;
    private double price;
    private int pages;


    public BooksModel(String id,ArrayList<String> cat,String name,String author,String series,String genre,Boolean inStock,double price,int pages){
        this.id =id;
        this.cat=cat;
        this.name=name;
        this.author=author;
        this.series=series;
        this.genre=genre;
        this.inStock=inStock;
        this.price=price;
        this.pages=pages;

    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<String> getCat() {
        return cat;
    }

    public void setCat(ArrayList<String> cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

}

