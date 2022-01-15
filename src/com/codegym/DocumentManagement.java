package com.codegym;

public class DocumentManagement {
    public static final int SIZE = 0;
    Book[] books = new Book[SIZE];
    Magazine[] magazines = new Magazine[SIZE];
    NewsPaper[] newsPapers = new NewsPaper[SIZE];

    public DocumentManagement() {
    }

    public DocumentManagement(Book[] books, Magazine[] magazines, NewsPaper[] newsPapers) {
        this.books = books;
        this.magazines = magazines;
        this.newsPapers = newsPapers;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Magazine[] getMagazines() {
        return magazines;
    }

    public void setMagazines(Magazine[] magazines) {
        this.magazines = magazines;
    }

    public NewsPaper[] getNewsPapers() {
        return newsPapers;
    }

    public void setNewsPapers(NewsPaper[] newsPapers) {
        this.newsPapers = newsPapers;
    }

    public void addNewBook(int index, Book newBook) {
        Book[] newBooks = new Book[books.length + 1];
        for (int i = 0; i < newBooks.length; i++) {
            if (i < index) {
                newBooks[i] = books[i];
            } else if (i == index) {
                newBooks[i] = newBook;
            } else {
                newBooks[i] = books[i - 1];
            }
        }
        this.books = newBooks;
    }

    public void addNewMagazine(int index, Magazine newMagazine) {
        Magazine[] newMagazines = new Magazine[magazines.length + 1];
        for (int i = 0; i < newMagazines.length; i++) {
            if (i < index) {
                newMagazines[i] = magazines[i];
            } else if (i == index) {
                newMagazines[i] = newMagazine;
            } else {
                newMagazines[i] = magazines[i - 1];
            }
        }
        this.magazines = newMagazines;
    }

    public void addNewNewsPaper(int index, NewsPaper newsPaper) {
        NewsPaper[] newNewsPapers = new NewsPaper[newsPapers.length + 1];
        for (int i = 0; i < newNewsPapers.length; i++) {
            if (i < index) {
                newNewsPapers[i] = newsPapers[i];
            } else if (i == index) {
                newNewsPapers[i] = newsPaper;
            } else {
                newNewsPapers[i] = newsPapers[i - 1];
            }
        }
        this.newsPapers = newNewsPapers;
    }

    public void displayBooks() {
        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
    public void displayMagazines() {
        for (int i = 0; i < magazines.length; i++) {
            System.out.println((i + 1) + ". " + magazines[i]);
        }
    }
    public void displayNewsPaper() {
        for (int i = 0; i < newsPapers.length; i++) {
            System.out.println((i + 1) + ". " + newsPapers[i]);
        }
    }
    public void findDocument(int documentCode){
        for (int i = 0; i < books.length ; i++) {
            if (books[i].getDocumentCode() == documentCode){
                System.out.println(books[i]);
            }else if (magazines[i].getDocumentCode() == documentCode){
                System.out.println(magazines[i]);
            } else if (newsPapers[i].getDocumentCode()==documentCode){
                System.out.println(newsPapers[i]);
            }else{
                System.out.println("Không tìm thấy mã tài liệu: "+documentCode);
            }
        }
    }
}
