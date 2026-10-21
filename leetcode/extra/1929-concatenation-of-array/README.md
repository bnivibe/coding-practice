# 1929. Concatenation of Array

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/concatenation-of-array/
- **Topic:** Array, Simulation (outside Top Interview 150) · **Difficulty:** Easy
- **Date:** 2026-10-21
- **Result:** Accepted (Java, 1 ms, 46.8 MB) · submissions: Accepted
- **Retry:** no

## Approach

Make an array twice as long as the input. In one pass, write each value twice: at index `i` and at index `i + n`.

## Complexity

- Time: O(n)
- Space: O(n) for the output array, O(1) extra

## What I missed

Nothing on this one: accepted on the first submission.

## Next

- **Study:** `System.arraycopy` for copying a whole block of an array in one call.
- **Practice:** [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/), which also writes into an array by index

## Links

- None saved

<!-- leetcode-sync: java=2178189454@1792603470 -->
