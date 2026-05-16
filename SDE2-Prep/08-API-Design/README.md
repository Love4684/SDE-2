# 08 — API Design

> SDE-2 candidates are expected to design clean, production-grade APIs.
> Target: 2-3 days.

---

## Topics Checklist

### A. REST API Best Practices
- [ ] Resource naming conventions (`/users/{id}/orders`, not `/getUserOrders`)
- [ ] HTTP methods: GET, POST, PUT, PATCH, DELETE — correct usage
- [ ] PUT vs PATCH — idempotency
- [ ] Status codes: 200, 201, 204, 400, 401, 403, 404, 409, 422, 429, 500, 503
- [ ] Idempotency — which methods are idempotent and why it matters
- [ ] Statelessness in REST

### B. Request/Response Design
- [ ] Request DTOs vs Entity objects (never expose entities directly)
- [ ] Response envelope pattern: `{ "data": ..., "error": ..., "meta": ... }`
- [ ] Pagination: offset-based vs cursor-based
- [ ] Filtering, sorting, field selection (`?fields=name,email&sort=-created`)
- [ ] HATEOAS — what it is (don't over-implement)

### C. Versioning
- [ ] URI versioning (`/v1/users`)
- [ ] Header versioning (`Accept: application/vnd.api.v1+json`)
- [ ] Query parameter versioning
- [ ] Which to use and tradeoffs

### D. Error Handling
- [ ] Consistent error response format
- [ ] Error codes (machine-readable) + messages (human-readable)
- [ ] Validation errors: field-level detail
- [ ] Don't leak stack traces or internal details

### E. Security
- [ ] Authentication: API Key, OAuth 2.0, JWT Bearer tokens
- [ ] Authorization: Role-based, Scope-based
- [ ] Rate limiting (429 Too Many Requests)
- [ ] Input validation and sanitization
- [ ] CORS policy
- [ ] HTTPS only

### F. API Documentation
- [ ] OpenAPI / Swagger basics
- [ ] Springdoc integration
- [ ] Contract-first vs code-first approach

### G. Advanced Topics
- [ ] GraphQL vs REST — when to use each
- [ ] gRPC — when to use (internal service communication)
- [ ] Webhook design
- [ ] Long-running operations (202 Accepted + polling / callbacks)
- [ ] Bulk operations API design
- [ ] API Gateway patterns

---

## Design Exercise
| # | Exercise | Focus | Status |
|---|----------|-------|--------|
| 1 | Design an API for a URL shortener | Resource design, POST/GET | ⬜ |
| 2 | Design an API for an e-commerce order system | CRUD + state transitions | ⬜ |
| 3 | Design a paginated search API | Pagination + filtering | ⬜ |
| 4 | Design a file upload API | Multipart, progress, async | ⬜ |
| 5 | Design a notification preferences API | Nested resources, PATCH | ⬜ |

---

## Start Here
Tell me: **"Start API Design"** and we design APIs for real-world systems.
