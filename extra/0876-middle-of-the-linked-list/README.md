# 0876. Middle of the Linked List

> Solution: written by me on LeetCode. Notes: drafted with Claude from my submission history and my answers.

- **Problem:** https://leetcode.com/problems/middle-of-the-linked-list/
- **Topic:** Linked List, Two Pointers (outside Top Interview 150) · **Difficulty:** Easy
- **Date:** 2026-10-19
- **Result:** Accepted (Java, 0 ms, 42.1 MB) · submissions: Runtime Error, Accepted, Accepted
- **Retry:** no

## Approach

Move `cur` two nodes and `mid` one node per step. When `cur` runs out, `mid` has covered half of the list, so it stops on the middle node, the second middle when the length is even.

## Complexity

- Time: O(n)
- Space: O(1)

## What I missed

- First submission: Runtime Error (NullPointerException) on a 10-node list. After counting the length, I walked until a node's value equalled the target position (`curNode.val != target`). The values are not positions, so it never matched and ran off the end.
- Second submission: counted positions in a separate variable and passed.
- Third submission: replaced the counting with a fast and a slow pointer, one pass instead of two. Why I changed each time: (from submission history)

## Next

- **Study:** Fast and slow pointers on linked lists: where the slow pointer stops for odd and even lengths.
- **Practice:** [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)

## Links

- Editorial: none noted (asked)

<!-- leetcode-sync: java=2176685833@1792463297 -->
