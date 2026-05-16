# 09 — System Design (HLD + LLD)

> **CRITICAL for SDE-2.** Expect 1 HLD round + 1 LLD/Machine Coding round.
> Target: Ongoing — start Week 5, practice through Week 12.

---

## Part 1: Low-Level Design (LLD) / Machine Coding

### Approach Framework
1. **Clarify requirements** (functional + non-functional)
2. **Identify core entities / classes**
3. **Define relationships** (has-a, is-a)
4. **Write interfaces first**
5. **Apply SOLID principles**
6. **Implement core logic**
7. **Add design patterns where natural**

### SOLID Principles
- [ ] **S** — Single Responsibility Principle
- [ ] **O** — Open/Closed Principle
- [ ] **L** — Liskov Substitution Principle
- [ ] **I** — Interface Segregation Principle
- [ ] **D** — Dependency Inversion Principle

### LLD Problems (Practice These)
| # | Problem | Key Concepts | Status |
|---|---------|-------------|--------|
| 1 | Parking Lot | Strategy, Factory, Enum | ⬜ |
| 2 | Elevator System | State, Strategy, Observer | ⬜ |
| 3 | LRU Cache | HashMap + Doubly Linked List | ⬜ |
| 4 | Snake and Ladder Game | Board, Dice, Player entities | ⬜ |
| 5 | Splitwise (Expense Sharing) | Graph-based debt simplification | ⬜ |
| 6 | BookMyShow (Movie Booking) | Concurrency, Seat locking | ⬜ |
| 7 | Tic-Tac-Toe | Board, Player, Strategy | ⬜ |
| 8 | Library Management | CRUD + State (borrow/return) | ⬜ |
| 9 | Vending Machine | State pattern | ⬜ |
| 10 | Rate Limiter | Token bucket, Sliding window | ⬜ |
| 11 | Task Scheduler (Cron) | Priority Queue, Threading | ⬜ |
| 12 | In-Memory Key-Value Store | HashMap + TTL + Eviction | ⬜ |

---

## Part 2: High-Level Design (HLD)

### Approach Framework
1. **Requirements** — Functional + Non-Functional (scale, latency, availability)
2. **Capacity Estimation** — QPS, storage, bandwidth (back-of-envelope)
3. **API Design** — Key endpoints
4. **Database Schema** — SQL vs NoSQL choice, key tables
5. **High-Level Architecture** — Draw the boxes and arrows
6. **Deep Dive** — Pick 2-3 components to go deep on
7. **Scalability** — Caching, sharding, replication, CDN
8. **Trade-offs** — Consistency vs Availability, SQL vs NoSQL

### Core Concepts to Know
- [ ] Load Balancing (L4 vs L7, algorithms)
- [ ] Caching (Redis/Memcached, cache-aside, write-through, write-back, eviction)
- [ ] CDN (Content Delivery Network)
- [ ] Database: SQL vs NoSQL, sharding, replication (master-slave, master-master)
- [ ] Message Queues (Kafka, RabbitMQ, SQS)
- [ ] Consistent Hashing
- [ ] CAP Theorem
- [ ] Rate Limiting algorithms
- [ ] Bloom Filters
- [ ] URL shortening math (base62 encoding)
- [ ] WebSockets vs Long Polling vs SSE

### HLD Problems (Practice These)
| # | Problem | Key Focus | Status |
|---|---------|----------|--------|
| 1 | URL Shortener (TinyURL) | Hashing, Base62, DB choice | ⬜ |
| 2 | Twitter/Feed System | Fan-out, Timeline, Caching | ⬜ |
| 3 | Chat System (WhatsApp) | WebSocket, Message queue, Presence | ⬜ |
| 4 | Notification System | Push/Pull, Priority, Templating | ⬜ |
| 5 | Rate Limiter | Token bucket, Distributed counting | ⬜ |
| 6 | Instagram/Photo Sharing | CDN, Object storage, Feed | ⬜ |
| 7 | Uber/Ride Sharing | Geo-spatial, Matching, Real-time | ⬜ |
| 8 | YouTube/Video Streaming | Transcoding, CDN, Chunked upload | ⬜ |
| 9 | Distributed Cache (Redis) | Consistent hashing, Eviction, Replication | ⬜ |
| 10 | Search Autocomplete | Trie, Ranking, Caching | ⬜ |
| 11 | E-commerce (Amazon) | Inventory, Payment, Order lifecycle | ⬜ |
| 12 | Pastebin | Storage, Expiry, Key generation | ⬜ |

---

## Back-of-Envelope Numbers to Memorize
| Metric | Value |
|--------|-------|
| 1 day | 86,400 seconds (~100K) |
| 1 month | ~2.5M seconds |
| 1 char (ASCII) | 1 byte |
| 1 char (UTF-8 avg) | 2-3 bytes |
| Image (compressed) | 200 KB – 1 MB |
| Video (1 min, 720p) | ~50 MB |
| SSD random read | ~100 μs |
| Memory random read | ~100 ns |
| Network round trip (same DC) | ~500 μs |
| Network round trip (cross-continent) | ~150 ms |
| Disk sequential read | ~500 MB/s |
| 1 server handles | ~10K-100K concurrent connections |

---

## Start Here
Tell me: **"Start System Design"** and we pick a problem (LLD or HLD) to work through together.
