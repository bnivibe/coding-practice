# 1480. Running Sum of 1d Array

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/running-sum-of-1d-array/
- **Topic:** Array, Prefix Sum (outside Top Interview 150) · **Difficulty:** Easy
- **Date:** 2026-10-17
- **Result:** Accepted (Java, 0 ms, 44.1 MB) · submissions: Accepted
- **Retry:** no

## Approach

Each output value is the previous output plus the current input, so one pass from left to right fills a new array.

## Complexity

- Time: O(n)
- Space: O(n) for the output array, O(1) extra

## What I missed

Nothing on this one: accepted on the first submission.

## Next

- **Study:** Prefix sums as a way to answer range-sum questions in O(1) after one pass.
- **Practice:** [303. Range Sum Query - Immutable](https://leetcode.com/problems/range-sum-query-immutable/)

## Links

- None saved

<!-- leetcode-sync: java=2174954128@1792285057 -->
