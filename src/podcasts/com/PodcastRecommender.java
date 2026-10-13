package podcasts.com;

import java.util.List;

/*
 * Recommends podcast strategy using the Strategy Pattern
 * The recommendation algorithm can be changed at run time by supplying 
 * a different strategy objects
 */

public class PodcastRecommender {
	private RecommendationStrategy aStrategy;
	

	
/*
 * Creates a recommender with the selected strategy 
 * @param aStrategy recommendation strategy to use
 */
public PodcastRecommender(RecommendationStrategy aStrategy) {
		this.aStrategy = aStrategy;
	}


/*
 * Recommends a podcast using the current strategy 
 * @param podcast list of available podcasts
 * @return recommended podcast
 */	
public Podcast recommendPodcast(List<Podcast>podcasts ) {
	return aStrategy.recommendPodcast(podcasts);
}
	
	
	

}
