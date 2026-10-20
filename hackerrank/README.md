# HackerRank

Practice on HackerRank, laid out the way a HackerRank test is built. A test there has two kinds of
sections, and each kind gets its own folder.

## How the two kinds work

**Coding.** A problem statement and a function stub in the language I pick. Some test cases are
visible and the rest are hidden; Run Code checks the visible ones and Submit runs them all. Each
section has its own timer, and time left over does not carry into the next one.

**Code repo.** A working project opens in a browser IDE with a file tree, a terminal and a preview
of the running app. A README describes how the app should behave, some files (the tests among them)
are locked, and scripts run the test suite. The task is to fix what the README describes and leave
everything else alone.

## Layout

```
hackerrank/
  coding/
    <problem-slug>/        HackerRank names problems by slug, not number
      Solution.java        my code, unchanged from the editor
      Solution.kt          the Kotlin port, when I write one
      README.md            notes, same template as the LeetCode ones
  code-repo/
    <task-slug>/
      README.md            the task in my own words, what I changed and why, how I checked it
      Solution.diff        my changes against the starting project
```

The same split as the rest of this repo applies: my code goes in under my name alone, and the notes
are drafted with Claude from my submissions and my answers.

Problem statements and starter projects belong to HackerRank and to the companies that set the
tests, so they are linked or described in my own words, never copied. Company assessments stay out
of this repo.

Nothing here yet.
