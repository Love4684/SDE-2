# 07 — Design Patterns

> SDE-2 interviews test if you can apply patterns in real code, not just name them.
> Focus on the **10 patterns that actually come up** in interviews.
> Target: 3 days.

---

## Topics Checklist

### A. Creational Patterns
- [ ] **Singleton** — lazy, eager, Bill Pugh, enum; thread-safety; when to avoid
- [ ] **Factory Method** — decouple object creation; `PaymentProcessorFactory`
- [ ] **Abstract Factory** — family of related objects; `UIComponentFactory`
- [ ] **Builder** — complex object construction; Lombok `@Builder`; real use in Spring

### B. Structural Patterns
- [ ] **Adapter** — make incompatible interfaces work together; `InputStreamReader`
- [ ] **Decorator** — add behavior dynamically; `BufferedReader(new FileReader(...))`
- [ ] **Proxy** — control access; Spring AOP proxies, lazy loading in JPA
- [ ] **Facade** — simplified interface to complex subsystem

### C. Behavioral Patterns
- [ ] **Strategy** — swap algorithms at runtime; `Comparator`, payment processing
- [ ] **Observer** — event-driven; Spring `ApplicationEvent`, Kafka consumers
- [ ] **Template Method** — define skeleton, let subclasses fill in; `JdbcTemplate`
- [ ] **Chain of Responsibility** — Spring Security filters, servlet filters

### D. Patterns in Spring / Real Code
| Pattern | Where in Spring/Java |
|---------|---------------------|
| Singleton | Default bean scope |
| Factory | `BeanFactory`, `FactoryBean` |
| Proxy | `@Transactional`, AOP |
| Template Method | `JdbcTemplate`, `RestTemplate` |
| Observer | `ApplicationEventPublisher` |
| Strategy | Multiple `@Service` implementations |
| Decorator | `BufferedInputStream`, `HttpServletRequestWrapper` |
| Builder | `UriComponentsBuilder`, Lombok |
| Chain of Responsibility | Security filter chain |
| Adapter | `HandlerAdapter` in MVC |

---

## Coding Exercises
| # | Exercise | Pattern | Status |
|---|----------|---------|--------|
| 1 | Design a notification system (Email/SMS/Push) | Strategy | ⬜ |
| 2 | Build a logger with multiple outputs | Observer | ⬜ |
| 3 | Pizza ordering system | Builder + Decorator | ⬜ |
| 4 | Payment processor (UPI/Card/Wallet) | Factory + Strategy | ⬜ |
| 5 | Implement a caching proxy | Proxy | ⬜ |
| 6 | Request validation chain | Chain of Responsibility | ⬜ |
| 7 | File reader with compression support | Adapter + Decorator | ⬜ |

---

## Start Here
Tell me: **"Start Design Patterns"** and we code each pattern with real-world examples.
