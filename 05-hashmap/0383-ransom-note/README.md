# 0383. Ransom Note

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/ransom-note/
- **Topic:** Hashmap · **Difficulty:** Easy
- **Date:** 2026-10-20
- **Result:** Accepted (Java, 1 ms, 45.9 MB) · submissions: Wrong Answer, Wrong Answer, Wrong Answer, Accepted, Accepted
- **Retry:** no

## Approach

Count each letter of `magazine` in an array of 26, then spend one count for each letter of `ransomNote`. If a count drops below zero, the magazine is missing that letter. Comparing the lengths first returns early when the note is longer.

## Complexity

- Time: O(m + n)
- Space: O(1): 26 counters

## What I missed

Three Wrong Answers on `"aab"` / `"baa"` before the counting idea:
- `magazine.contains(ransomNote)` checks for a substring, not for letters.
- Deleting matched letters from the front of the note assumed the letters appear in the same order in the magazine.
- Deleting matches anywhere still failed: the empty check ran only at the top of the loop, so a note finished by the magazine's last letter returned false. One magazine letter could also remove two note letters.
- The counting version passed with a `HashMap` (15 ms). Two minutes later I switched to an `int[26]` array with a length check first (1 ms). Why I changed each time: (from submission history)

## Next

- **Study:** Counting with a fixed-size array instead of a `HashMap` when the keys are a small known alphabet.
- **Practice:** [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)

## Links

- Editorial: none noted (asked)

<!-- leetcode-sync: java=2177172278@1792508590 -->
