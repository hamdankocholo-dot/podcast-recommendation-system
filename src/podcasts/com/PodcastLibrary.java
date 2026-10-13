package podcasts.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



/*
 * stores and manages the a collection of podcast
 * implements Iterable so podcasts can be traversed using enhanced for loop
 */
public class PodcastLibrary implements Iterable<Podcast>{
	private List<Podcast> podcasts = new ArrayList<>(); 
	
	
	/*
	 * Returns the podcast collection which is mutable list. I plan to work on it to improve encapsulation
	 */
	public List<Podcast>getPodcasts() {
		return podcasts;
	}
	
	/*
	 * adds a podcast to the library 
	 * @param podcast podcast to add
	 */
	public void addPodcast(Podcast podcast) {
		podcasts.add(podcast);
	}
	
	
	/*
	 * Removes a podcast from the library 
	 * @param podcast  podcast to remove
	 */
	public void removePodcast(Podcast podcast) {
		podcasts.remove(podcast);
	}
	
	
	/*Retrieves a podcast at a specified index
	 * @param index position of a podcast
	 * @return podcast at the specified index
	 */
	
	public Podcast accessPodcast(int index) {
		return podcasts.get(index);
	}
	
	
	//get the podcast size 
	public int sizeOfPodcasts() {
		return podcasts.size();
	}


	@Override
	public Iterator<Podcast> iterator() {
		return podcasts.iterator();
	}

}
