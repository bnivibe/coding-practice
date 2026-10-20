# 0412. Fizz Buzz

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/fizz-buzz/
- **Topic:** Math, String, Simulation (outside Top Interview 150) · **Difficulty:** Easy
- **Date:** 2026-10-17
- **Result:** Accepted (Java, 3 ms, 47.2 MB) · submissions: Accepted
- **Retry:** no

## Approach

For each number, append "Fizz" when it divides by 3 and "Buzz" when it divides by 5. If nothing was appended, add the number itself. Building the string this way covers multiples of 15 without a separate branch.

## Complexity

- Time: O(n)
- Space: O(n) for the output list

## What I missed

Accepted on the first submission, in 3 ms, which LeetCode ranked slower than most Java submissions. Creating a new `StringBuilder` for every number is one possible cost.

## Next

- **Study:** What string building costs in Java: `StringBuilder` per item versus constant strings.
- **Practice:** The same loop with constant strings ("FizzBuzz", "Fizz", "Buzz"), then compare the runtime.

## Links

- Editorial: none noted

<!-- leetcode-sync: java=2174965208@1792287953 -->
