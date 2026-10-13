package podcasts.com;


	import java.util.ArrayList;
	import java.util.List;


	/**
	 * Strategy pattern 
	 * The recommendation algorithm can be changed without modifying PodcastRecommender.
	 * Different strategies implements the same RecommendationStrategy interface and can be 
	 * supplied to the recommender through dependency injection
	 */

	public class Client {
		
		public static void main(String[] args) {
			PodcastLibrary library = new PodcastLibrary();
			
			
			library.addPodcast(new Podcast("Dark Government", 9.4f , 90, 2000));
			library.addPodcast(new Podcast("Movies Acts", 4.5f , 70, 2019));
			library.addPodcast(new Podcast("Religius Chaos", 7.7f , 80, 2013));
			library.addPodcast(new Podcast("Zombies", 7.5f , 65, 2024));
			library.addPodcast(new Podcast("Crime does not Pay Good", 9.7f , 90, 2014));
			library.addPodcast(new Podcast("Dark society", 8.6f , 60, 2025));
			library.addPodcast(new Podcast("The Untouchables ", 6.0f , 50, 2010));
			library.addPodcast(new Podcast("Abroad Illusion", 9.5f , 75, 1999));
			library.addPodcast(new Podcast("The Secret", 5.5f , 60, 2001));
			library.addPodcast(new Podcast("History Today", 8.0f , 95, 1998));
			
			
			//print podcasts in the library using enhanced for loop
			for (Podcast podcast : library) {
				System.out.println(podcast);	
				System.out.println();
			}
			
		/*
		 * Polymorphism:
		 * The variable type is RecommendationStrategy 
		 * The concrete object is the HighestRatedPodcastStrategy
		 */
			RecommendationStrategy strategy = new HighestRatedPodcastStrategy();
			
			
		/*
		 * Dependency injection: The recommendation strategy is supplied from outside the recommender, 
		 * allowing behavior to be changed without modifying the class
		 */
			PodcastRecommender recommender = new PodcastRecommender(strategy);
			
			Podcast recommendedPodcast = recommender.recommendPodcast(library.getPodcasts());
			
			System.out.println();
			System.out.println("The highest rated Podcast is : ");
			
			System.out.println(recommendedPodcast);
			
			
			System.out.println();
			System.out.println("The longest podcast is : ");
			PodcastRecommender recommender2 = new PodcastRecommender(new LongestPodcastStrategy());

			System.out.println(recommender2.recommendPodcast(library.getPodcasts()));
			
			
			System.out.println();
			System.out.println("The longest podcast is : ");	
			
		}
		
		
		
	}


