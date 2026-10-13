package podcasts.com;

import java.util.List;


/*
 * strategy interface for podcast recommendations
 * Different recommendation algorithms implement this interface to provide 
 * specific behavior 
 */
public interface RecommendationStrategy {
	
	
	/*
	 * selects and returns a recommended Podcast
	 * 
	 * @param podcasts collection of available podcasts
	 * @return the recommended podcast
	 */
	Podcast recommendPodcast(List<Podcast> podcasts );

}
