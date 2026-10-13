
	package podcasts.com;

	import java.util.List;


	/*
	 * Recommendation strategy that selects the highest rated podcast
	 */

	public class HighestRatedPodcastStrategy implements RecommendationStrategy{

		
		/*
		 * Finds and returns the highest rated podcast
		 * @param podcasts collection of available podcasts
		 * @return podcast with the highest rating 
		 */
		@Override
		public Podcast recommendPodcast(List<Podcast> podcasts) {
			Podcast highestRatedPod = podcasts.get(0);
			
			for (Podcast podcast : podcasts) {
				if (podcast.getRating() > highestRatedPod.getRating()) {
					highestRatedPod =podcast;
				}
			}
			return highestRatedPod;
		}
		

	}



