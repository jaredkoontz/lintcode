// Time:  O(n)
// Space: O(1)

// Tri-Partition solution.
class Solution{
public:
    /**
     * @param nums: A list of integer which is 0, 1 or 2
     * @return: nothing
     */
    void sortColors(vector<int> &nums) {
        const int target = 1;
        for (int i = 0, j = 0, n = nums.size() - 1; j <= n;) {
            if (nums[j] < target) {
                swap(nums[i++], nums[j++]);
            } else if (nums[j] > target) {
                swap(nums[j], nums[n--]);
            } else {
                ++j;
            }
        }
    }
};
