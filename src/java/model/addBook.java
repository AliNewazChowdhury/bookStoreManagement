/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ishmam
 */
public class addBook {

    private int id;
    private String title;
    private String subject;
    private String publisher;
    private String language;
    private int num_of_page;
    private int total_books;
    private String image;
    public addBook(int id,String title, String subject, String publisher, String language, int num_of_page, int total_books,String image) {
        this.id=id;
        this.title = title;
        this.subject = subject;
        this.publisher = publisher;
        this.language = language;
        this.num_of_page = num_of_page;
        this.total_books = total_books;
        this.image=image;
    }
    
    public addBook(String title, String subject, String publisher, String language, int num_of_page, int total_books,String image) {
        
        this.title = title;
        this.subject = subject;
        this.publisher = publisher;
        this.language = language;
        this.num_of_page = num_of_page;
        this.total_books = total_books;
        this.image=image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNum_of_page() {
        return num_of_page;
    }

    public void setNum_of_page(int num_of_page) {
        this.num_of_page = num_of_page;
    }

    public int getTotal_books() {
        return total_books;
    }

    public void setTotal_books(int total_books) {
        this.total_books = total_books;
    }

}
