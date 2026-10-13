package podcasts.com;



public class Podcast {
	//made fields private. Encapsulation
	private String pTitle; 
	private float pRating;
	private int pDuration;
	private int pReleaseYear;
	
	
	/*
	 * Creates a podcast object
	 * 
	 * @param pTitle title of the podcast
	 * @param pRating rating of the podcast
	 * @param pDuration duration of the podcast
	 * @param pReleaseYear year the podcast was released
	 * @throws IllegalArguementException if invalid values are provided
	 */
	public Podcast(String pTitle,float pRating , int pDuration, int pReleaseYear) {
		if (pTitle == null || pRating <= 0.0 || pDuration <= 0 || pReleaseYear <= 0) {
			throw new IllegalArgumentException("Invalid input!");  //input validation
		}
		this.pTitle = pTitle;
		this.pRating = pRating;
		this.pDuration = pDuration;
		this.pReleaseYear = pReleaseYear;
	}
	
	
	//getter methods for the fields
	public String getTitle() {
		return pTitle;
	}
	
	
	public float getRating() {
		return pRating;
		
	}
	
	
	
	public int getDuration() {
	return pDuration;
	}
	
	
	public int getReleaseYear() {
		return pReleaseYear;
	}
	
	/*
	 * Returns a readable representation of the podcast
	 * @return podcast details as a string
	 */
	@Override
	public String toString() {
		return pTitle + " has a rating of " + pRating +  " and takes " + pDuration + 
				" mins  and it was released in "  +  pReleaseYear;
	}

}
