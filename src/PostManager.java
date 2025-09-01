import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class PostManager {

    public int calculateEngagement(int... interactions) {
        int totalEngagement = 0;
        if (interactions.length == 0) {
            return 0;
        }
        for (int interaction : interactions) {
            totalEngagement += interaction;
        }
        return totalEngagement;
    }

    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        if (engagementScore >= 500) return "Popular";
        if (engagementScore >= 100) return "Good";
        if (engagementScore >= 50) return "Low";
        return "Poor";
    }

    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }

    public ArrayList<String> manageHashtags(String[] hashtags) {
        ArrayList<String> uniqueHashtags = new ArrayList<>();
        for (String hashtag : hashtags) {
            if (!uniqueHashtags.contains(hashtag)) {
                uniqueHashtags.add(hashtag);
            }
        }
        return uniqueHashtags;
    }

    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trendingPosts = new LinkedList<>();
        for (String post : posts) {
            if (postEngagement.get(post) != null && postEngagement.get(post) > 500) {
                trendingPosts.add(post);
            }
        }
        return trendingPosts;
    }

    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> uniqueAuthors = new HashSet<>();
        for (String author : authors) {
            uniqueAuthors.add(author);
        }
        return uniqueAuthors;
    }
}
