# 1672. Richest Customer Wealth

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/richest-customer-wealth/
- **Topic:** Array, Matrix (outside Top Interview 150) · **Difficulty:** Easy
- **Date:** 2026-10-17
- **Result:** Accepted (Java, 0 ms, 43.8 MB) · submissions: Accepted, Accepted
- **Retry:** no

## Approach

Sum each customer's balances with a for-each loop and keep the largest sum with `Math.max`.

## Complexity

- Time: O(m * n) for m customers and n banks
- Space: O(1)

## What I missed

- My first accepted version turned each row into running sums in place and read the last column. It passed in 1 ms but changed the input array.
- Six minutes later I rewrote it to sum each row into a local variable without touching the input, which ran in 0 ms. Why I changed it: (from submission history)

## Next

- **Study:** When it is fine to modify an input array and when the caller may still need it.
- **Practice:** [1572. Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)

## Links

- Editorial: none noted (asked)

<!-- leetcode-sync: java=2174960775@1792286842 -->
