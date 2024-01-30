package finalproject;



public class Book {

	public String title;

	public String author;

	public int isbn;

	public Book(String title, String author, int isbn)

	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;

	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getISBN() {
		return isbn;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setISBN(int isbn)

	{
		this.isbn = isbn;
	}

	public String toString()

	{
		return "The details of the book are: " + title + ", " + author + ", " + isbn + ", ";
	}

}
