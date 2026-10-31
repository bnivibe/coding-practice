# 0001. Two Sum

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/two-sum/
- **Topic:** Hashmap · **Difficulty:** Easy
- **Date:** 2026-10-20
- **Result:** Accepted (Java, 3 ms, 46.7 MB) · submissions: Wrong Answer, Accepted, Accepted, Accepted
- **Retry:** yes (2026-10-30), in Kotlin: accepted on the first submission (8 ms, 54.7 MB). Before it I read an explanation of a Kotlin version, then wrote my own two-pass version.

## Approach

Walk the array once. For each number, look up its complement (`target - nums[i]`) in a `HashMap` of value to index. If it is there, the pair is found; otherwise store the current number. The pair shows up when its second element is reached, so one pass is enough.

## Complexity

- Time: O(n)
- Space: O(n) for the map

## What I missed

- First submission: Wrong Answer on `[-1,-2,-3,-4,-5]` with target -8 (expected `[2,4]`, got `[0,0]`). It subtracted numbers from the target only while the remainder stayed at zero or above, which never happens with a negative target, and it was not limited to two numbers. In my words: I had not thought about the negative case, so it failed the tests; I thought about it for a while and then read an explanation.
- Then three accepted versions within three minutes: every pair with nested loops (39 ms), a `HashMap` filled first and searched in a second pass (5 ms), and a single pass that checks the complement before storing each number (3 ms). Why: I wrote what I learned from the explanation into code, improving it as I went.

## Next

- **Study:** The complement lookup with a `HashMap`, and why one pass is enough.
- **Practice:** [167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

## Kotlin notes

- The Kotlin retry is the two-pass version: the first `forEachIndexed` stores number to index, the second looks up `map[target - num]` once with `?.let`. Storing the later index for a repeated number is what makes `[3, 3]` work.
- `return` inside the `forEachIndexed` lambda returns from `twoSum` itself, because `forEachIndexed` is inline. `return@forEachIndexed` only ends the current element, like `continue`; I used it to skip the element pairing with itself.
- Simpler next time: `?.let { if (it != index) return intArrayOf(index, it) }` needs no label, and the one-pass order (look up first, store after) needs no same-index check at all.

## Links

- None saved

<!-- leetcode-sync: java=2177222961@1792512422 kotlin=2185896288@1793416990 -->
