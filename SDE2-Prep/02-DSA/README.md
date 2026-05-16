# 02 — Data Structures & Algorithms

> This is the **highest priority** topic. SDE-2 interviews typically have 2-3 DSA rounds.
> You need to solve Medium problems confidently and attempt Hard problems.
> Target: Continuous practice throughout the 12 weeks.

---

## Approach
- Every problem: **Brute Force → Optimized → Code → Dry Run → Complexity Analysis**
- Language: Java (use your production language)
- Each subtopic folder will have: concept notes + 10-15 curated problems + solutions

---

## Topics Checklist (Order of Study)

### Week 1–2: Fundamentals
- [ ] **Arrays** — Two pointer, sliding window, prefix sum, Kadane's
- [ ] **Strings** — Palindrome, anagram, substring problems, KMP basics
- [ ] **Hashing** — HashMap/HashSet patterns, frequency counting, two-sum family
- [ ] **Sorting** — Merge sort, quicksort, counting sort (know internals)
- [ ] **Binary Search** — On sorted arrays, on answer space, rotated arrays

### Week 3: Linear Data Structures
- [ ] **Linked Lists** — Reverse, cycle detection, merge, LRU cache
- [ ] **Stacks** — Monotonic stack, next greater element, valid parentheses
- [ ] **Queues** — BFS usage, sliding window maximum, circular queue

### Week 3–4: Trees & Heaps
- [ ] **Binary Trees** — Traversals (inorder, pre, post, level), diameter, height, LCA
- [ ] **BST** — Insert, delete, validate, inorder successor, floor/ceil
- [ ] **Heaps / Priority Queue** — Top K problems, merge K sorted, median stream

### Week 4: Graphs
- [ ] **Graph Basics** — BFS, DFS, adjacency list/matrix
- [ ] **Shortest Path** — Dijkstra, Bellman-Ford
- [ ] **Topological Sort** — Kahn's algorithm, course schedule
- [ ] **Union Find** — Connected components, cycle detection
- [ ] **Advanced** — Minimum spanning tree (Prim/Kruskal), bipartite check

### Week 5+: Advanced Patterns
- [ ] **Dynamic Programming** — 1D, 2D, knapsack, LCS, LIS, partition problems
- [ ] **Greedy** — Interval scheduling, activity selection, Huffman
- [ ] **Backtracking** — N-Queens, Sudoku, permutations, combinations
- [ ] **Tries** — Autocomplete, word search, prefix matching
- [ ] **Bit Manipulation** — XOR tricks, single number, power of 2

---

## Curated Problem List (150 Problems)

### Arrays (15 problems)
| # | Problem | Difficulty | Pattern | Status |
|---|---------|-----------|---------|--------|
| 1 | Two Sum | Easy | HashMap | ⬜ |
| 2 | Best Time to Buy and Sell Stock | Easy | Kadane's variant | ⬜ |
| 3 | Contains Duplicate | Easy | HashSet | ⬜ |
| 4 | Maximum Subarray (Kadane's) | Medium | DP/Greedy | ⬜ |
| 5 | Product of Array Except Self | Medium | Prefix/Suffix | ⬜ |
| 6 | 3Sum | Medium | Two Pointer | ⬜ |
| 7 | Container With Most Water | Medium | Two Pointer | ⬜ |
| 8 | Merge Intervals | Medium | Sorting | ⬜ |
| 9 | Next Permutation | Medium | Pattern | ⬜ |
| 10 | Subarray Sum Equals K | Medium | Prefix Sum + Map | ⬜ |
| 11 | Rotate Array | Medium | Reversal | ⬜ |
| 12 | Spiral Matrix | Medium | Simulation | ⬜ |
| 13 | Set Matrix Zeroes | Medium | In-place | ⬜ |
| 14 | Trapping Rain Water | Hard | Two Pointer/Stack | ⬜ |
| 15 | First Missing Positive | Hard | Cyclic Sort | ⬜ |

### Strings (10 problems)
| # | Problem | Difficulty | Pattern | Status |
|---|---------|-----------|---------|--------|
| 1 | Valid Anagram | Easy | Frequency Count | ⬜ |
| 2 | Valid Palindrome | Easy | Two Pointer | ⬜ |
| 3 | Longest Substring Without Repeating | Medium | Sliding Window | ⬜ |
| 4 | Longest Palindromic Substring | Medium | Expand Around Center | ⬜ |
| 5 | Group Anagrams | Medium | HashMap + Sort | ⬜ |
| 6 | String to Integer (atoi) | Medium | Parsing | ⬜ |
| 7 | Longest Common Prefix | Easy | Vertical Scan | ⬜ |
| 8 | Decode Ways | Medium | DP | ⬜ |
| 9 | Minimum Window Substring | Hard | Sliding Window | ⬜ |
| 10 | Edit Distance | Hard | DP | ⬜ |

### Binary Search (8 problems)
| # | Problem | Difficulty | Pattern | Status |
|---|---------|-----------|---------|--------|
| 1 | Binary Search | Easy | Standard | ⬜ |
| 2 | Search in Rotated Sorted Array | Medium | Modified BS | ⬜ |
| 3 | Find Minimum in Rotated Sorted Array | Medium | Modified BS | ⬜ |
| 4 | Search a 2D Matrix | Medium | BS on matrix | ⬜ |
| 5 | Koko Eating Bananas | Medium | BS on Answer | ⬜ |
| 6 | Find Peak Element | Medium | BS | ⬜ |
| 7 | Median of Two Sorted Arrays | Hard | BS | ⬜ |
| 8 | Aggressive Cows / Book Allocation | Medium | BS on Answer | ⬜ |

### Linked List (8 problems)
| # | Problem | Difficulty | Pattern | Status |
|---|---------|-----------|---------|--------|
| 1 | Reverse Linked List | Easy | Iterative + Recursive | ⬜ |
| 2 | Linked List Cycle | Easy | Fast/Slow Pointer | ⬜ |
| 3 | Merge Two Sorted Lists | Easy | Pointer Manipulation | ⬜ |
| 4 | Remove Nth Node From End | Medium | Two Pointer | ⬜ |
| 5 | Add Two Numbers | Medium | Carry + Traversal | ⬜ |
| 6 | Copy List with Random Pointer | Medium | HashMap / Interweaving | ⬜ |
| 7 | LRU Cache | Medium | HashMap + DLL | ⬜ |
| 8 | Merge K Sorted Lists | Hard | Heap + Divide & Conquer | ⬜ |

### Stack & Queue (8 problems)
| # | Problem | Difficulty | Pattern | Status |
|---|---------|-----------|---------|--------|
| 1 | Valid Parentheses | Easy | Stack | ⬜ |
| 2 | Min Stack | Medium | Auxiliary Stack | ⬜ |
| 3 | Next Greater Element | Medium | Monotonic Stack | ⬜ |
| 4 | Daily Temperatures | Medium | Monotonic Stack | ⬜ |
| 5 | Largest Rectangle in Histogram | Hard | Monotonic Stack | ⬜ |
| 6 | Implement Queue using Stacks | Easy | Two Stacks | ⬜ |
| 7 | Sliding Window Maximum | Hard | Deque | ⬜ |
| 8 | Evaluate Reverse Polish Notation | Medium | Stack | ⬜ |

### Trees (15 problems)
| # | Problem | Difficulty | Pattern | Status |
|---|---------|-----------|---------|--------|
| 1 | Maximum Depth of Binary Tree | Easy | DFS | ⬜ |
| 2 | Invert Binary Tree | Easy | DFS | ⬜ |
| 3 | Same Tree | Easy | DFS | ⬜ |
| 4 | Binary Tree Level Order Traversal | Medium | BFS | ⬜ |
| 5 | Validate BST | Medium | Inorder / Range | ⬜ |
| 6 | Lowest Common Ancestor | Medium | DFS | ⬜ |
| 7 | Binary Tree Zigzag Level Order | Medium | BFS + Flag | ⬜ |
| 8 | Construct BT from Preorder & Inorder | Medium | Recursion + Map | ⬜ |
| 9 | Diameter of Binary Tree | Easy | DFS | ⬜ |
| 10 | Balanced Binary Tree | Easy | DFS | ⬜ |
| 11 | Kth Smallest in BST | Medium | Inorder | ⬜ |
| 12 | Binary Tree Right Side View | Medium | BFS/DFS | ⬜ |
| 13 | Serialize and Deserialize BT | Hard | BFS/DFS | ⬜ |
| 14 | Path Sum III | Medium | Prefix Sum + DFS | ⬜ |
| 15 | Binary Tree Maximum Path Sum | Hard | DFS | ⬜ |

### Heaps (6 problems)
| # | Problem | Difficulty | Pattern | Status |
|---|---------|-----------|---------|--------|
| 1 | Kth Largest Element | Medium | QuickSelect / Heap | ⬜ |
| 2 | Top K Frequent Elements | Medium | Bucket Sort / Heap | ⬜ |
| 3 | Find Median from Data Stream | Hard | Two Heaps | ⬜ |
| 4 | Merge K Sorted Lists | Hard | Min Heap | ⬜ |
| 5 | Task Scheduler | Medium | Greedy + Heap | ⬜ |
| 6 | Reorganize String | Medium | Greedy + Heap | ⬜ |

### Graphs (12 problems)
| # | Problem | Difficulty | Pattern | Status |
|---|---------|-----------|---------|--------|
| 1 | Number of Islands | Medium | BFS/DFS | ⬜ |
| 2 | Clone Graph | Medium | BFS + HashMap | ⬜ |
| 3 | Course Schedule (I & II) | Medium | Topological Sort | ⬜ |
| 4 | Rotting Oranges | Medium | Multi-source BFS | ⬜ |
| 5 | Word Ladder | Hard | BFS | ⬜ |
| 6 | Number of Connected Components | Medium | Union Find / DFS | ⬜ |
| 7 | Graph Valid Tree | Medium | Union Find | ⬜ |
| 8 | Pacific Atlantic Water Flow | Medium | DFS from borders | ⬜ |
| 9 | Cheapest Flights Within K Stops | Medium | Bellman-Ford / BFS | ⬜ |
| 10 | Network Delay Time | Medium | Dijkstra | ⬜ |
| 11 | Surrounded Regions | Medium | DFS from border | ⬜ |
| 12 | Alien Dictionary | Hard | Topological Sort | ⬜ |

### Dynamic Programming (15 problems)
| # | Problem | Difficulty | Pattern | Status |
|---|---------|-----------|---------|--------|
| 1 | Climbing Stairs | Easy | 1D DP | ⬜ |
| 2 | House Robber (I & II) | Medium | 1D DP | ⬜ |
| 3 | Coin Change | Medium | Unbounded Knapsack | ⬜ |
| 4 | Longest Increasing Subsequence | Medium | 1D DP + BS | ⬜ |
| 5 | Longest Common Subsequence | Medium | 2D DP | ⬜ |
| 6 | Word Break | Medium | 1D DP + Set | ⬜ |
| 7 | 0/1 Knapsack | Medium | 2D DP | ⬜ |
| 8 | Partition Equal Subset Sum | Medium | 0/1 Knapsack | ⬜ |
| 9 | Unique Paths | Medium | 2D DP | ⬜ |
| 10 | Minimum Path Sum | Medium | 2D DP | ⬜ |
| 11 | Decode Ways | Medium | 1D DP | ⬜ |
| 12 | Maximum Product Subarray | Medium | DP | ⬜ |
| 13 | Palindrome Partitioning | Medium | Backtracking + DP | ⬜ |
| 14 | Regular Expression Matching | Hard | 2D DP | ⬜ |
| 15 | Burst Balloons | Hard | Interval DP | ⬜ |

### Backtracking (6 problems)
| # | Problem | Difficulty | Pattern | Status |
|---|---------|-----------|---------|--------|
| 1 | Subsets (I & II) | Medium | Backtracking | ⬜ |
| 2 | Permutations | Medium | Backtracking | ⬜ |
| 3 | Combination Sum (I & II) | Medium | Backtracking | ⬜ |
| 4 | N-Queens | Hard | Backtracking | ⬜ |
| 5 | Word Search | Medium | DFS + Backtracking | ⬜ |
| 6 | Generate Parentheses | Medium | Backtracking | ⬜ |

### Tries (3 problems)
| # | Problem | Difficulty | Pattern | Status |
|---|---------|-----------|---------|--------|
| 1 | Implement Trie | Medium | Trie | ⬜ |
| 2 | Word Search II | Hard | Trie + DFS | ⬜ |
| 3 | Design Add and Search Words | Medium | Trie + DFS | ⬜ |

---

## Subtopic Folders
Solutions and notes will be organized in subfolders:
```
02-DSA/
├── arrays/
├── strings/
├── binary-search/
├── linked-list/
├── stack-queue/
├── trees/
├── heaps/
├── graphs/
├── dynamic-programming/
├── backtracking/
└── tries/
```

## Start Here
Tell me: **"Start DSA"** and we begin with Arrays — Two Sum pattern, then build up.
