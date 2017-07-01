M

        题目蛋疼，目前只接受一种结果。

        BackTracking+DFS:
        Recursive helper里每次flip一个 自己/左边/右边.Flip过后还要恢复原样.遍历所有.

        曾用法（未仔细验证）：
        基本想法就是从一个点开始往一个方向走，每次flip一个bit,碰壁的时候就回头走。

        ```
/*

The gray code is a binary numeral system where two successive values differ in only one bit.

Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.

For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

00 - 0
01 - 1
11 - 3
10 - 2
Note:
For a given n, a gray code sequence is not uniquely defined.

For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.

Hide Company Tags Amazon
Hide Tags Backtracking

*/


//Another solution, 02.10.2016 using DFS
//generate order, output the numerical value of each binary code. Integer.parseInt("10101", 2).
//Start with n-bit char[] of 0's. Flip one bit at a time.
//Recursive helper. char[], index. Flip or not flip. DFS

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> rst = new ArrayList<Integer>();
        if (n < 0) {
            return rst;
        } else if (n == 0) {
            rst.add(0);
            return rst;
        }
        char[] list = new char[n];
        for (int i = 0; i < n; i++) {
            list[i] = '0';
        }
        helper(rst, list, n - 1);

        return rst;
    }

    public void helper(List<Integer> rst, char[] list, int index) {

        rst.add(Integer.parseInt(new String(list), 2));

        //self
        list[index] = list[index] == '0' ? '1' : '0';
        int num = Integer.parseInt(new String(list), 2);
        if (!rst.contains(num)) {
            helper(rst, list, index);
        }
        list[index] = list[index] == '0' ? '1' : '0';

        //left
        if (index - 1 >= 0) {
            list[index - 1] = list[index - 1] == '0' ? '1' : '0';
            num = Integer.parseInt(new String(list), 2);
            if (!rst.contains(num)) {
                helper(rst, list, index - 1);
            }
            list[index - 1] = list[index - 1] == '0' ? '1' : '0';
        }

        //right
        if (index + 1 < list.length) {
            list[index + 1] = list[index + 1] == '0' ? '1' : '0';
            num = Integer.parseInt(new String(list), 2);
            if (!rst.contains(num)) {
                helper(rst, list, index + 1);
            }
            list[index + 1] = list[index + 1] == '0' ? '1' : '0';
        }
    }
}


/*

Leetcode tags shows backtracking. That should be different approach than what I hvae below:

*/

/*

TRY: My code works for this run-through, however does not fit the OJ yet

0 	0 	0	[start, noting happend, flip index 0]

0 	0 <-1	[move to flip left adjacent]

0 <-1 	1	[move to flip left adjacent]

1->	1	1	[move to flip right adjacent]

1	0->	1	[move to flip right adjacent]

1	0 <-0	[move to flip left adjacent]

1 <-1	0	[move to flip left adjacent]

0	1	0	[done]

Conclusion: hit the wall and flip the other direction.

Every flip, add integer to list 

Convert the char[] to string, then Integer.parse(str, 2) to integer

Simulate the steps:

For example, when n = 3, step = n - 1. It takes 2 steps from right side to reach left side, it hits the wall and turn around.

Now:

1. Initialize char[] and add '000'

2. do for loop on 1 ~ 2^n -2. last step '010' is stepped into, but no further action, so take 2^3 - 1 = 7 steps.

*/
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> rst = new ArrayList<Integer>();
        if (n < 0) {
            return rst;
        }
        char[] bits = new char[n];
        for (int i = 0; i < bits.length; i++) {
            bits[i] = '0';
        }
        String str = new String(bits);
        if (n == 0) {
            str = "0";
        }
        rst.add(Integer.parseInt(str, 2));
        int step = n - 1;
        boolean LR = true;//L: true; R: false
        int steps = (int) Math.pow(2, n) - 1;
        for (int i = 0; i < steps; i++) {
            bits[step] = bits[step] == '0' ? '1' : '0';
            str = new String(bits);
            rst.add(Integer.parseInt(str, 2));
            if (LR) {
                step--;
            } else {
                step++;
            }
            if (step == (n - 1) || step == 0) {//Turn around
                LR = !LR;
            }
        }

        return rst;
    }
}


```