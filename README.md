# coding-practice

Daily coding practice, one folder per platform. Right now that is LeetCode: the [Top Interview 150](https://leetcode.com/studyplan/top-interview-150/) study plan plus a few warm-ups, solved in Java first, then rewritten in Kotlin. Other platforms get their own folder: [`hackerrank/`](hackerrank/) is laid out and waiting for its first problem.

I'm a backend engineer with 7+ years of production Java. I keep this up so I can still solve problems by hand, alongside the AI-assisted way I work day to day.

<!-- leetcode-stats:start -->
## LeetCode stats

Profile: **[leetcode.com/u/d1nuvtObP6](https://leetcode.com/u/d1nuvtObP6/)** (updated 2026-10-20)

| | Easy | Medium | Hard | Total |
|---|---|---|---|---|
| Solved | 7 / 972 | 0 / 2,131 | 0 / 984 | 7 / 4,087 |

- Acceptance rate: 70.6% (12 of 17 submissions accepted)
- Active days in 2026: 2 · longest streak: 1 day
- Languages: Java 7
<!-- leetcode-stats:end -->

## How each problem is done

1. **Solve without AI.** Timer on (Easy 20 min, Medium 40 min), thinking out loud the way I would in an interview. If time runs out, I stop, note where I got stuck, and try again the following week.
2. **Review an AI solution.** I ask Claude for its own solution and read it without running it: where it is weak, how it differs from mine, and what breaks first if the input grows 10x.
3. **Port to Kotlin.** Same solution, rewritten in idiomatic Kotlin.
4. **Write it down.** Each problem folder has notes: approach, complexity, what I missed, and what to study or practice next.

The solutions are my own code, written in each platform's editor and copied here unchanged. The notes are drafted with Claude from my submission history and my answers; the commit history shows which is which.

Problem statements and editorials belong to the platforms, so each folder links to the problem instead of copying it.

## Layout

```
leetcode/
  01-array-string/           Top Interview 150, one folder per topic
    0088-merge-sorted-array/
      Solution.java
      Solution.kt
      README.md              notes, see TEMPLATE.md
  02-two-pointers/
  ...
  extra/                     LeetCode problems outside the 150 (warm-ups and others)
    0876-middle-of-the-linked-list/
hackerrank/
  coding/                    algorithm problems, one folder per problem slug
  code-repo/                 "fix the app" tasks in a full project
```

## Progress

### LeetCode: Top Interview 150

| # | Topic | Solved |
|---|---|---|
| 01 | Array / String | 0 / 24 |
| 02 | Two Pointers | 0 / 5 |
| 03 | Sliding Window | 0 / 4 |
| 04 | Matrix | 0 / 5 |
| 05 | Hashmap | 2 / 9 |
| 06 | Intervals | 0 / 4 |
| 07 | Stack | 0 / 5 |
| 08 | Linked List | 0 / 11 |
| 09 | Binary Tree General | 0 / 14 |
| 10 | Binary Tree BFS | 0 / 4 |
| 11 | Binary Search Tree | 0 / 3 |
| 12 | Graph General | 0 / 6 |
| 13 | Graph BFS | 0 / 3 |
| 14 | Trie | 0 / 3 |
| 15 | Backtracking | 0 / 7 |
| 16 | Divide & Conquer | 0 / 4 |
| 17 | Kadane's Algorithm | 0 / 2 |
| 18 | Binary Search | 0 / 7 |
| 19 | Heap | 0 / 4 |
| 20 | Bit Manipulation | 0 / 6 |
| 21 | Math | 0 / 6 |
| 22 | 1D DP | 0 / 5 |
| 23 | Multidimensional DP | 0 / 9 |
| | **Total** | **2 / 150** |
| | Other problems (outside the 150, in `leetcode/extra/`) | 5 |

### HackerRank

Nothing yet. See [`hackerrank/`](hackerrank/) for the layout.

Started October 2026.
