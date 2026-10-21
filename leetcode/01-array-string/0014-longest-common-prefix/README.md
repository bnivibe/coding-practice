# 0014. Longest Common Prefix

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/longest-common-prefix/
- **Topic:** Array / String · **Difficulty:** Easy
- **Date:** 2026-10-21
- **Result:** Accepted (Java, 0 ms, 43.1 MB) · submissions: Runtime Error, Runtime Error, Wrong Answer, Runtime Error, Wrong Answer, Accepted, Accepted
- **Retry:** no

## Approach

Start with the whole first string as the candidate prefix. For each string, while it does not start with the candidate, drop the last character of the candidate; if the candidate becomes empty, there is no common prefix. Whatever survives every string is the answer.

An earlier accepted version compared the strings column by column, up to the length of the shortest one, and stopped at the first mismatch (1 ms).

## Complexity

- Time: about O(S), S = all characters in all strings. `indexOf(prefix) != 0` keeps searching the rest of the string when the start does not match, so `startsWith(prefix)` is the cheaper check.
- Space: O(m), m = length of the first string, for the prefix (each `substring` makes a new string)

## What I missed

- First submission: Runtime Error on `[""]`. The loop condition was `index++ < minLen`, which compares the old value and then increments, so the body ran one step past the end and called `charAt` out of range.
- Second submission added an `isBlank()` guard for an empty first string. Runtime Error on `["a"]`, the same off-by-one.
- Third submission returned `""` whenever the first string had length 1 or less. Wrong Answer on `["a"]` (expected `"a"`).
- Fourth submission returned `strs[0]` in that case instead. Runtime Error on `["ab", "a"]`, the same off-by-one again.
- Fifth submission guarded on `strs.length == 1` and switched to `++index`, which fixed the loop. Wrong Answer on `["ab", "a"]`: when no mismatch was found, the method returned `""` instead of the prefix it had built.
- Sixth submission returned `sb.toString()` at the end and passed (1 ms).
- Seventh submission rewrote it as the shrinking prefix above and passed (0 ms). Why I changed each time: (from submission history)

## Next

- **Study:** `i++` and `++i` in a loop condition: post-increment compares the old value, so the body runs once more than it looks.
- **Practice:** [28. Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/), which is `indexOf` written by hand

## Links

- None saved

<!-- leetcode-sync: java=2178094793@1792597758 -->
