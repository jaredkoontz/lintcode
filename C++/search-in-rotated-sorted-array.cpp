// Time:  O(logn)
// Space: O(1)

class Solution {
    /** 
     * param A : an integer ratated sorted array
     * param target :  an integer to be searched
     * return : an integer
     */
public:
    int search(vector<int> &A, int target) {
        int left = 0, right = A.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == target) {
                return mid;
            } else if ((A[mid] >= A[left] && A[left] <= target && target < A[mid]) ||
                       (A[mid] < A[left] && !(A[mid] < target && target <= A[right]))) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
};

class Solution2 {
    /** 
     * param A : an integer ratated sorted array
     * param target :  an integer to be searched
     * return : an integer
     */
public:
    int search(vector<int> &A, int target) {
        int left = 0, right = A.size();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (A[mid] == target) {
                return mid;
            } else if ((A[left] <= A[mid] && A[left] <= target && target < A[mid]) ||
                       (A[left] > A[mid] && !(A[mid] < target && target <= A[right - 1]))) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
};
