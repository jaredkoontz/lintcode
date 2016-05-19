// Time:  O(nlogf),     n is most recently number of tweets,
//                      f is the number of followings.
// Space: O(u + t + r), u is the number of users,
//                      t is the total number of tweets,
//                      r is the number of followings.

/**
 * Definition of Tweet:
 * class Tweet {
 * public:
 *     int id;
 *     int user_id;
 *     String text;
 *     static Tweet create(int user_id, string tweet_text) {
 *         // This will create a new tweet object,
 *         // and auto fill id
 *     }
 * }
 */
class MiniTwitter {
public:
    const size_t number_of_most_recent_tweets = 10;

    MiniTwitter() : time_(0) {
    }

    // @param user_id an integer
    // @param tweet a string
    // return a tweet
    Tweet postTweet(int user_id, string tweet_text) {
        const auto& tweet = Tweet::create(user_id, tweet_text);
        messages_[user_id].emplace_back(make_pair(++time_, tweet));
        return tweet;
    }

    // @param user_id an integer
    // return a list of 10 new feeds recently
    // and sort by timeline
    vector<Tweet> getNewsFeed(int user_id) {
        using RIT = deque<pair<size_t, Tweet>>::reverse_iterator;
        priority_queue<tuple<size_t, RIT, RIT>> heap;

        if (messages_[user_id].size()) {
            heap.emplace(make_tuple(messages_[user_id].rbegin()->first,
                                    messages_[user_id].rbegin(),
                                    messages_[user_id].rend()));
        }
        for (const auto& id : followings_[user_id]) {
            if (messages_[id].size()) {
                heap.emplace(make_tuple(messages_[id].rbegin()->first,
                                        messages_[id].rbegin(),
                                        messages_[id].rend()));
            }
        }
        vector<Tweet> res;
        while (!heap.empty() && res.size() < number_of_most_recent_tweets) {
            const auto& top = heap.top();
            size_t t;
            RIT begin, end;
            tie(t, begin, end) = top;
            heap.pop();

            auto next = begin + 1;
            if (next != end) {
                heap.emplace(make_tuple(next->first, next, end));
            }

            res.emplace_back(begin->second);
        }
        return res;
    }

    // @param user_id an integer
    // return a list of 10 new posts recently
    // and sort by timeline
    vector<Tweet>  getTimeline(int user_id) {
        vector<Tweet> res;
        for (auto it = messages_[user_id].rbegin();
             it != messages_[user_id].rend() &&
             res.size() < number_of_most_recent_tweets; ++it) {
            res.emplace_back(it->second);
        }
        return res;
    }

    // @param from_user_id an integer
    // @param to_user_id an integer
    // from user_id follows to_user_id
    void follow(int from_user_id, int to_user_id) {
        if (!followings_[from_user_id].count(to_user_id)) {
            followings_[from_user_id].emplace(to_user_id);
        }
    }

    // @param from_user_id an integer
    // @param to_user_id an integer
    // from user_id unfollows to_user_id
    void unfollow(int from_user_id, int to_user_id) {
        if (followings_[from_user_id].count(to_user_id)) {
            followings_[from_user_id].erase(to_user_id);
        }
    }

private:
    unordered_map<int, unordered_set<int>> followings_;
    unordered_map<int, deque<pair<size_t, Tweet>>> messages_;
    size_t time_;
};
