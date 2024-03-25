/* URL : https://leetcode.com/problems/design-twitter/description/ */
import java.util.*;
class Twitter {
    class Tweet {
        int userId;
        int tweetId;
        Tweet next;
        public Tweet(int a, int b) {
            Tweet.userId = a;
            Tweet.tweetId = b;
            Tweet.next = null;
        }
    }
    class TweetBox {
        private Tweet head;
        int size;
        public TweetBox() {
            this.size = 0;
            this.head = null;
        }
        public void addTweet(Tweet tweet) {
            if(head == null) {
                head = tweet;
            } else {
                tweet.next = head;
                head = tweet;
            }
            size++;
        }
        public List<Integer> getTweet(List<Integer> feedList, int userId) {
            if(size == 0) {
                return feedList;
            }
            List<Integer> following = new ArrayList<>();
            following.add(userId);
            if(followingList.containsKey(userId)) {
                following.addAll(followingList.get(userId));
            }
            Tweet temp = head;
            while(temp != null && feedList.size() < 10) {
                if(following.contains(temp.userId) && feedList.size() < 10) {
                    feedList.add(temp.tweetId);
                }
                temp = temp.next;
            }
            return feedList;
        }
    }
    TweetBox tweetBox;
    Map<Integer, List<Integer>> followingList;
    public Twitter() {
        tweetBox = new TweetBox();
        followingList = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        Tweet tweet = new Tweet(userId, tweetId);
        tweetBox.addTweet(tweet);
    }
    
    public List<Integer> getNewsFeed(int userId) {
        return tweetBox.getTweet(new ArrayList<>(), userId);
    }
    
    public void follow(int followerId, int followeeId) {
        int userFollowing = followerId;
        int userBeingFollowed = followeeId;
        List<Integer> following;
        if(!followingList.containsKey(userFollowing)) {
            following = new ArrayList<>();
        } else {
            following = followingList.get(userFollowing);
        }
        if(!following.contains(userBeingFollowed)) {
            following.add(userBeingFollowed);
        }
        followingList.put(followerId, following);
    }
    
    public void unfollow(int followerId, int followeeId) {
        int userFollowing = followerId;
        int userBeingFollowed = followeeId;
        List<Integer> following;
        if(followingList.containsKey(userFollowing)) {
            following = followingList.get(userFollowing);
            if(following.contains(userBeingFollowed)) {
                for (int i = 0; i < following.size(); i++) {
                    if(following.get(i) == userBeingFollowed) {
                        following.remove(i);
                    }
                }
                followingList.put(followerId, following);
            }
        }
    }
}
