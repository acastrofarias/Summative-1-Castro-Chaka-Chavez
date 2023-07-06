package com.company.Summative1CCC.models;

public class Quote {

    public Quote(){}
    public Quote(int id, String author,String quote ){
        this.id=id;
        this.author=author;
        this.quote=quote;
    }

    private int id;
    private String author;
    private String quote;

    public int getId(){
      return id;
    }
    public void setID(int id){
      this.id = id;
    }
    public String getAuthor(){
    return author;
    }
    public void setAuthor(String author){
    this.author = author;
    }
    public String getQuote(){
    return quote;
    }
    public void setQuote(String quote ){
    this.quote = quote;
    }
}
