package hipster.model;

public class Hipster 
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That is way too mainstream.";
		hipsterPhrases[1] = "Insert witty comment here.... or not.";
		hipsterPhrases[2] = "You're not a hipster.";
		hipsterPhrases[3] = "I was hipster before hipsters were a thing.";
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		
		firstBook = new Book();
		firstBook.setAuthor("Brandon Sanderson");
		firstBook.setTitle("The Way of Kings");
		firstBook.setSubject("Medieval");
		firstBook.setPageCount(1200);
		firstBook.setPrice(6.15);
		
		secondBook = new Book();
		secondBook.setAuthor("Brandon Sanderson");
		secondBook.setTitle("Words of Radiance");
		secondBook.setSubject("Medieval");
		secondBook.setPageCount(1100);
		secondBook.setPrice(6.97);
		
		thirdBook = new Book();
		thirdBook.setAuthor("J. R. R. Tolken");
		thirdBook.setTitle("Lord of the Rings");
		thirdBook.setSubject("Medieval");
		thirdBook.setPageCount(1700);
		thirdBook.setPrice(35.96);	
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
	}
	
	
	public Book [] getHipsterBooks() 
	{
		return hipsterBooks;
	}

	public void setHipsterBooks(Book [] hipsterBooks) 
	{
		this.hipsterBooks = hipsterBooks;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String[] getHipsterPhrases() 
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases) 
	{
		this.hipsterPhrases = hipsterPhrases;
	}

	
	
	
}
