# 0009. Palindrome Number

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/palindrome-number/
- **Topic:** Math · **Difficulty:** Easy
- **Date:** 2026-10-20
- **Result:** Accepted (Java, 17 ms, 45.4 MB) · submissions: Wrong Answer, Wrong Answer, Accepted
- **Retry:** no

## Approach

Turn the number into a string and compare characters from both ends toward the middle; any mismatch means it is not a palindrome. Negative numbers are rejected first because of the minus sign.

## Complexity

- Time: O(d) for d digits
- Space: O(d) for the string

## What I missed

- First submission: Wrong Answer on `0`. The guard was `x <= 0`, but 0 is a palindrome.
- Second submission: Wrong Answer on `11`. For an even number of digits the loop ends with `front > rear`, and the check after the loop only accepted `front == rear`.
- Third submission added a `front + 1 == rear` check and passed. Why I changed each time: (from submission history)
- Afterwards I read an explanation of reversing half of the number instead of building a string. I am coming back to that one.

## Next

- **Study:** Reversing the second half of the number with `% 10` and `/ 10`, so no string is needed (O(1) space).
- **Practice:** This problem again with the half-reversal; then [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

## Links

- None saved

<!-- leetcode-sync: java=2177305451@1792517827 -->
