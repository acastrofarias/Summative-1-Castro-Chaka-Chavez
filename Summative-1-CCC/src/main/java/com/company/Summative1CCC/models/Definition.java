package com.company.Summative1CCC.models;

public class Definition {
    public int id;

    public String word;

    public String definition;

    public Definition(){};
    public Definition(String word, String definition, int id){
        this.word = word;
        this.definition = definition;
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getWord(){
        return word;
    }

    public void setWord(String word){
        this.word = word;
    }

    public String getDefinition(){
        return definition;
    }

    public void setDefinition(String definition){
        this.definition = definition;
    }
}
