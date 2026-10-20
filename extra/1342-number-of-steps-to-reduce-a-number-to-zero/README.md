# 1342. Number of Steps to Reduce a Number to Zero

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
- **Topic:** Math, Bit Manipulation (outside Top Interview 150) · **Difficulty:** Easy
- **Date:** 2026-10-19
- **Result:** Accepted (Java, 0 ms, 41.6 MB) · submissions: Accepted
- **Retry:** no

## Approach

Simulate the rule: halve the number when it is even, subtract one when it is odd, and count the steps until it reaches zero.

## Complexity

- Time: O(log n): every two steps at least halve the number
- Space: O(1)

## What I missed

Nothing on this one: accepted on the first submission.

## Next

- **Study:** The same answer from bits: for a positive number, steps = (bit length - 1) + (number of 1 bits).
- **Practice:** [191. Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/)

## Links

- Editorial: none noted

<!-- leetcode-sync: java=2176673151@1792460842 -->
