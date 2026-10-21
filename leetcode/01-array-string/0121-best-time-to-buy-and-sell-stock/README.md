# 0121. Best Time to Buy and Sell Stock

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
- **Topic:** Array / String · **Difficulty:** Easy
- **Date:** 2026-10-21
- **Result:** Accepted (Java, 1 ms, 93.6 MB) · submissions: Time Limit Exceeded, Accepted
- **Retry:** no

## Approach

Walk the prices once and keep the lowest price seen so far. On each day, selling today earns today's price minus that minimum; keep the largest such profit. For a fixed selling day, the best buying day is always the cheapest day before it, so one variable replaces the inner loop.

## Complexity

- Time: O(n)
- Space: O(1)

## What I missed

- First submission compared every buy and sell pair with two loops, O(n²), and hit Time Limit Exceeded on a large input (200 of 213 tests passed).
- I read an explanation and rewrote it as one pass that tracks the minimum price. It passed in 1 ms.

## Next

- **Study:** Keeping a running best (here the minimum so far) instead of rescanning; the same idea grows into Kadane's algorithm.
- **Practice:** [122. Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)

## Links

- None saved

<!-- leetcode-sync: java=2178056719@1792595044 -->
