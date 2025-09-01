public static void main(String[] args) {
        PostManager postManager = new PostManager();

        String postTitle = "Java Programming Tips";
        int engagementScore = postManager.calculateEngagement(150, 75, 25);

        String category = postManager.getCategoryRating(engagementScore);

        System.out.println("≡ Social Media Post Manager ≡");
        postManager.displayPostStats(postTitle, engagementScore, category);

        String[] hashtags = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = postManager.manageHashtags(hashtags);
        System.out.println("Unique Hashtags: " + uniqueHashtags);

        ArrayList<String> posts = new ArrayList<>();
        posts.add("Advanced Java Tutorial");
        posts.add("Spring Boot Guide");

        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Advanced Java Tutorial", 1200);
        postEngagement.put("Spring Boot Guide", 450);

        LinkedList<String> trendingPosts = postManager.findTrendingPosts(posts, postEngagement);
        System.out.println("Trending Posts: " + trendingPosts);

        HashSet<String> uniqueAuthors = postManager.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
