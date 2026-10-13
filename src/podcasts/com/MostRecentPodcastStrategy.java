package podcasts.com;

import java.util.List;

/*
 * Recommendation strategy that selects the most recently released podcast
 */

public class MostRecentPodcastStrategy implements RecommendationStrategy{
	
	/*
	 * Finds and returns a podcast that was most recently released 
	 * @param podcast list of available podcasts
	 * @return recommended podcast
	 */
	@Override
	public Podcast recommendPodcast(List<Podcast> podcasts){
		Podcast mostRecentPodcast  = podcasts.get(0);
		
		for (Podcast podcast : podcasts) {
			if (podcast.getReleaseYear() > mostRecentPodcast.getReleaseYear()) {
				mostRecentPodcast = podcast;
			}
		}
		return mostRecentPodcast;
	}
	
}

