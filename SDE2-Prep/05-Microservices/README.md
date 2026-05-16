# 05 — Microservices Architecture

> As an SDE-2, you're expected to **design and reason about** microservices, not just use them.
> Target: 3-4 days theory + ongoing practice with System Design.

---

## Topics Checklist

### A. Fundamentals
- [ ] Monolith vs Microservices: tradeoffs (not just benefits)
- [ ] When NOT to use microservices
- [ ] Bounded Context (from Domain-Driven Design)
- [ ] Service decomposition strategies
- [ ] Conway's Law and team structure

### B. Communication Patterns
- [ ] Synchronous: REST, gRPC
- [ ] Asynchronous: Message queues (Kafka, RabbitMQ, SQS)
- [ ] Event-driven architecture
- [ ] Choreography vs Orchestration
- [ ] API Gateway pattern (routing, rate limiting, auth)
- [ ] Service mesh basics (Istio/Envoy — conceptual)

### C. Data Management
- [ ] Database per service pattern
- [ ] Shared database anti-pattern
- [ ] Saga pattern (choreography vs orchestration)
- [ ] Event sourcing basics
- [ ] CQRS (Command Query Responsibility Segregation)
- [ ] Eventual consistency — how to handle it
- [ ] Distributed transactions — why 2PC is avoided

### D. Resilience Patterns
- [ ] Circuit Breaker (Resilience4j)
- [ ] Retry with exponential backoff
- [ ] Bulkhead pattern
- [ ] Timeout pattern
- [ ] Fallback strategies
- [ ] Rate limiting / Throttling

### E. Service Discovery & Config
- [ ] Service registry (Eureka, Consul)
- [ ] Client-side vs server-side discovery
- [ ] Centralized configuration (Spring Cloud Config / AWS Parameter Store)
- [ ] Feature flags

### F. Observability
- [ ] Distributed tracing (Zipkin, Jaeger, AWS X-Ray)
- [ ] Centralized logging (ELK stack / CloudWatch)
- [ ] Metrics and alerting (Prometheus + Grafana)
- [ ] Correlation IDs
- [ ] Health checks and readiness probes

### G. Deployment Patterns
- [ ] Blue-Green deployment
- [ ] Canary deployment
- [ ] Rolling deployment
- [ ] Feature toggles
- [ ] Database migration strategies in microservices

### H. Security
- [ ] Service-to-service authentication (mTLS, JWT)
- [ ] API Gateway authentication
- [ ] OAuth 2.0 / OpenID Connect flow
- [ ] Secret management (Vault, AWS Secrets Manager)

---

## Interview Questions (Top 15)
1. How do you decompose a monolith into microservices?
2. How do microservices communicate? Compare sync vs async.
3. Explain the Saga pattern with a real example.
4. How do you handle distributed transactions?
5. What is eventual consistency and how do you deal with it?
6. Explain the Circuit Breaker pattern.
7. How do you implement service discovery?
8. How do you handle failures in a microservice chain?
9. Database per service — what are the challenges?
10. How do you ensure data consistency across services?
11. Explain API Gateway and its responsibilities.
12. How do you implement distributed tracing?
13. How do you version APIs in a microservice architecture?
14. What's the difference between choreography and orchestration?
15. How would you migrate a monolith to microservices at your company?

---

## Start Here
Tell me: **"Start Microservices"** and we begin with architecture patterns + real-world scenarios.
