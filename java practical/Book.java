public class Book {
    String bookName;
    Integer ISBN;
    String  author;
    String publisher;

    public Book(String bookName, Integer ISBN, String author,String publisher){
        this.bookName = bookName;
        this.ISBN= ISBN;
        this.author = author;
        this.publisher = publisher;
    }

    public void setBooknmae(String bookName){
        this.bookName = bookName;
    }
    public String getBookName(){
        return bookName;
    }

    public void setISBN(Integer ISBN){
        this.ISBN = ISBN;
    }

    public Integer getISBN(){
        return ISBN;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return publisher;
    }

    public String getBookInfo(){
        return "the author is "+author+" the ISBN number of this book is "+ ISBN +"the name of publisher is "+publisher;
    }
}
