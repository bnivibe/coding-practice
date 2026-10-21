# 0020. Valid Parentheses

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/valid-parentheses/
- **Topic:** Stack · **Difficulty:** Easy
- **Date:** 2026-10-21
- **Result:** Accepted (Java, 4 ms, 42.5 MB) · submissions: Accepted
- **Retry:** no

## Approach

Push every opening bracket onto a stack. A closing bracket must match the most recent unclosed opener, which is the top of the stack: if the stack is empty, or the popped opener's pair is not this character, the string is invalid. At the end the stack must be empty, or some opener was never closed. A map from each opener to its closer keeps the pairs in one place.

## Complexity

- Time: O(n)
- Space: O(n) in the worst case, when every character is an opener

## What I missed

- I read an explanation before writing this one, then wrote the code myself. It passed on the first submission.

## Next

- **Study:** `ArrayDeque` as the stack in Java. The Java docs recommend the `Deque` interface over the legacy `Stack` class, which synchronizes every call.
- **Practice:** [155. Min Stack](https://leetcode.com/problems/min-stack/)

## Links

- None saved

<!-- leetcode-sync: java=2178142339@1792600750 -->
