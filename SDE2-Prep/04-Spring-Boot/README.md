# 04 — Spring Boot (Deep Dive for Interviews)

> You use Spring Boot daily. This covers **internals and why** — what interviewers ask beyond CRUD.
> Target: 4-5 days.

---

## Topics Checklist

### A. Spring Core
- [ ] IoC (Inversion of Control) and DI (Dependency Injection) — explain to a 5-year-old
- [ ] ApplicationContext vs BeanFactory
- [ ] Bean lifecycle: instantiation → populate → BeanPostProcessor → init → destroy
- [ ] Bean scopes: singleton, prototype, request, session
- [ ] `@Component` vs `@Service` vs `@Repository` vs `@Controller` — real differences
- [ ] `@Autowired` — constructor vs field vs setter injection (why constructor is preferred)
- [ ] `@Qualifier`, `@Primary`, `@Conditional`
- [ ] Circular dependency — how Spring resolves it, when it can't
- [ ] Profiles and conditional bean loading

### B. Spring Boot Auto-Configuration
- [ ] How auto-configuration works (`spring.factories` / `AutoConfiguration.imports`)
- [ ] `@SpringBootApplication` = `@Configuration` + `@EnableAutoConfiguration` + `@ComponentScan`
- [ ] `@ConditionalOnClass`, `@ConditionalOnProperty`, `@ConditionalOnMissingBean`
- [ ] Customizing auto-configuration (excluding, overriding)
- [ ] `application.properties` vs `application.yml` vs environment variables precedence

### C. Spring MVC / REST
- [ ] DispatcherServlet flow (request lifecycle)
- [ ] `@RestController` vs `@Controller`
- [ ] `@RequestMapping`, `@GetMapping`, `@PostMapping` etc.
- [ ] `@PathVariable`, `@RequestParam`, `@RequestBody`, `@RequestHeader`
- [ ] Request/Response serialization (Jackson ObjectMapper)
- [ ] Exception handling: `@ExceptionHandler`, `@ControllerAdvice`, `@ResponseStatus`
- [ ] Validation: `@Valid`, `@Validated`, custom validators
- [ ] Content negotiation
- [ ] CORS configuration

### D. Spring Data JPA / Hibernate
- [ ] JPA vs Hibernate vs Spring Data JPA relationship
- [ ] Entity lifecycle states: transient, managed, detached, removed
- [ ] `@Entity`, `@Table`, `@Id`, `@GeneratedValue` strategies
- [ ] Relationships: `@OneToMany`, `@ManyToOne`, `@ManyToMany` — FetchType, cascade
- [ ] N+1 problem: detection and fix (`@EntityGraph`, JOIN FETCH)
- [ ] Query methods, `@Query` (JPQL + native)
- [ ] Pagination and sorting
- [ ] `@Transactional`: propagation types, isolation levels, rollback rules
- [ ] Optimistic vs Pessimistic locking (`@Version`)
- [ ] First-level cache (session) vs second-level cache
- [ ] Dirty checking and flush modes

### E. Spring Security Basics
- [ ] Authentication vs Authorization
- [ ] SecurityFilterChain flow
- [ ] JWT authentication flow in Spring Boot
- [ ] `@PreAuthorize`, `@Secured`, role-based access
- [ ] Password encoding (BCrypt)
- [ ] CSRF, CORS in security context

### F. Spring AOP
- [ ] What is AOP? (cross-cutting concerns)
- [ ] `@Aspect`, `@Before`, `@After`, `@Around`
- [ ] Pointcut expressions
- [ ] Real-world uses: logging, transaction management, security

### G. Testing
- [ ] `@SpringBootTest` vs `@WebMvcTest` vs `@DataJpaTest`
- [ ] MockMvc for controller testing
- [ ] `@MockBean` vs `@Mock`
- [ ] Testcontainers for integration tests
- [ ] Test slicing strategy

### H. Actuator & Production Features
- [ ] Health checks, metrics endpoints
- [ ] Custom health indicators
- [ ] Graceful shutdown
- [ ] Externalized configuration (Config Server basics)

---

## Interview Questions (Top 20)
1. How does Spring Boot auto-configuration work internally?
2. Explain the bean lifecycle in Spring.
3. What happens when a Spring Boot application starts?
4. How does `@Transactional` work? What's the proxy mechanism?
5. Explain N+1 problem and how to fix it.
6. Constructor injection vs field injection — why?
7. How does Spring handle circular dependencies?
8. Explain `@ControllerAdvice` and global exception handling.
9. What are the different bean scopes?
10. How does Spring Security filter chain work?
11. Explain optimistic vs pessimistic locking.
12. What's the difference between JPA and Hibernate?
13. How do you handle database migrations in production?
14. Explain transaction propagation types with examples.
15. How do you implement pagination in Spring Data?
16. What is the DispatcherServlet and how does request routing work?
17. How do you test a REST controller?
18. Explain the difference between `@Component` and `@Bean`.
19. How do you implement caching in Spring Boot?
20. What's the difference between `application.properties` precedence order?

---

## Start Here
Tell me: **"Start Spring Boot"** and we'll begin with IoC/DI internals + Bean lifecycle.
