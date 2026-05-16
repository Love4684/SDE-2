# 06 — Concurrency & Multithreading

> A **key differentiator** for SDE-2 candidates. Most candidates are weak here.
> Target: 4-5 days.

---

## Topics Checklist

### A. Thread Basics
- [ ] Creating threads: `Thread` class vs `Runnable` vs `Callable`
- [ ] Thread lifecycle: NEW → RUNNABLE → BLOCKED → WAITING → TIMED_WAITING → TERMINATED
- [ ] `start()` vs `run()` — what happens if you call `run()` directly?
- [ ] Daemon threads vs user threads
- [ ] Thread priority and scheduling
- [ ] `sleep()` vs `wait()` vs `yield()` vs `join()`

### B. Synchronization
- [ ] `synchronized` keyword (method-level, block-level)
- [ ] Intrinsic locks / monitor locks
- [ ] `volatile` keyword — visibility guarantee, not atomicity
- [ ] Happens-before relationship
- [ ] Reentrant locking
- [ ] Double-checked locking (and why it needs volatile)

### C. java.util.concurrent (JUC) — The Real Deal
- [ ] `ReentrantLock` vs `synchronized`
- [ ] `ReadWriteLock` — when to use
- [ ] `Condition` — `await()` / `signal()` vs `wait()` / `notify()`
- [ ] `Semaphore` — permits, fairness
- [ ] `CountDownLatch` — one-time barrier
- [ ] `CyclicBarrier` — reusable barrier
- [ ] `Phaser` — advanced barrier

### D. Concurrent Collections
- [ ] `ConcurrentHashMap` — how it works (segments → Node CAS in Java 8+)
- [ ] `CopyOnWriteArrayList` — when to use
- [ ] `BlockingQueue`: `ArrayBlockingQueue`, `LinkedBlockingQueue`, `PriorityBlockingQueue`
- [ ] `ConcurrentLinkedQueue`

### E. Executor Framework
- [ ] `ExecutorService`, `ThreadPoolExecutor`
- [ ] Core pool size, max pool size, queue capacity — how tasks flow
- [ ] `FixedThreadPool`, `CachedThreadPool`, `ScheduledThreadPool`, `SingleThreadExecutor`
- [ ] `Future` vs `CompletableFuture`
- [ ] `CompletableFuture` chaining: `thenApply`, `thenCompose`, `thenCombine`, `allOf`, `anyOf`
- [ ] Custom thread pool for `CompletableFuture`
- [ ] Virtual threads (Java 21 — conceptual awareness)

### F. Common Problems & Patterns
- [ ] Deadlock: conditions, detection, prevention
- [ ] Livelock and starvation
- [ ] Producer-Consumer pattern (using BlockingQueue)
- [ ] Reader-Writer problem
- [ ] Dining Philosophers
- [ ] Thread-safe Singleton (Bill Pugh, enum, double-checked locking)
- [ ] `ThreadLocal` — use cases, memory leak risk

### G. Atomic Operations
- [ ] `AtomicInteger`, `AtomicLong`, `AtomicReference`
- [ ] CAS (Compare-And-Swap) — how it works at CPU level
- [ ] `LongAdder` vs `AtomicLong` for high contention

---

## Coding Problems
| # | Problem | Concept | Status |
|---|---------|---------|--------|
| 1 | Print numbers 1-100 with 3 threads (round-robin) | wait/notify | ⬜ |
| 2 | Producer-Consumer with BlockingQueue | BlockingQueue | ⬜ |
| 3 | Implement thread-safe Singleton (3 ways) | Synchronization | ⬜ |
| 4 | Implement a custom thread pool | Executor concepts | ⬜ |
| 5 | Deadlock demo + fix | Lock ordering | ⬜ |
| 6 | Read-Write lock implementation | ReentrantReadWriteLock | ⬜ |
| 7 | Rate limiter using Semaphore | Semaphore | ⬜ |
| 8 | Parallel merge sort | ForkJoinPool | ⬜ |
| 9 | Async pipeline with CompletableFuture | CompletableFuture | ⬜ |
| 10 | Implement CountDownLatch from scratch | Low-level sync | ⬜ |

---

## Start Here
Tell me: **"Start Concurrency"** and we begin with Thread basics + synchronized + volatile.
