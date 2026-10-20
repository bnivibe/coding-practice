# 0001. Two Sum

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/two-sum/
- **Topic:** Hashmap · **Difficulty:** Easy
- **Date:** 2026-10-20
- **Result:** Accepted (Java, 3 ms, 46.7 MB) · submissions: Wrong Answer, Accepted, Accepted, Accepted
- **Retry:** no

## Approach

Walk the array once. For each number, look up its complement (`target - nums[i]`) in a `HashMap` of value to index. If it is there, the pair is found; otherwise store the current number. The pair shows up when its second element is reached, so one pass is enough.

## Complexity

- Time: O(n)
- Space: O(n) for the map

## What I missed

- First submission: Wrong Answer on `[-1,-2,-3,-4,-5]` with target -8 (expected `[2,4]`, got `[0,0]`). It subtracted numbers from the target only while the remainder stayed at zero or above, which never happens with a negative target, and it was not limited to two numbers. In my words: I had not thought about the negative case, so it failed the tests; I thought about it for a while and then read a solution write-up.
- Then three accepted versions within three minutes: every pair with nested loops (39 ms), a `HashMap` filled first and searched in a second pass (5 ms), and a single pass that checks the complement before storing each number (3 ms). Why I changed each time: (from submission history)

## Next

- **Study:** The complement lookup with a `HashMap`, and why one pass is enough.
- **Practice:** [167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

## Links

- Solution write-up: read one after my first Wrong Answer (link not saved).

<!-- leetcode-sync: java=2177222961@1792512422 -->
