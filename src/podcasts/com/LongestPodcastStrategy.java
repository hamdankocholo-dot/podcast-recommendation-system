package podcasts.com;

import java.util.List;

/*
 * Recommendation strategy that selects the podcast with the longest duration
 */

public class LongestPodcastStrategy implements RecommendationStrategy{

	/*
	 * Finds and returns the longest podcast in the collection
	 * @param podcasts collection of available podcasts
	 * @return longest podcast
	 */
	@Override
	public Podcast recommendPodcast(List<Podcast> podcasts) {
		Podcast longestPodcast = podcasts.get(0);
		
		for (Podcast podcast : podcasts) {
			if (podcast.getDuration() > longestPodcast.getDuration()) {
				longestPodcast = podcast;
			}
		}
		return longestPodcast;
	}

}

