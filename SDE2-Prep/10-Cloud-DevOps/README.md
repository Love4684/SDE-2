# 10 — Cloud & DevOps Basics

> SDE-2 should know enough AWS/DevOps to **deploy and operate** their services.
> Target: 2-3 days (you already use AWS at work).

---

## Topics Checklist

### A. AWS Core Services (You Already Use)
- [ ] **EC2** — Instance types, Auto Scaling Groups, AMIs
- [ ] **S3** — Storage classes, lifecycle policies, pre-signed URLs
- [ ] **Lambda** — Cold starts, execution limits, event triggers
- [ ] **RDS** — Multi-AZ, read replicas, backup/restore
- [ ] **ElastiCache** — Redis vs Memcached
- [ ] **SQS** — Standard vs FIFO, visibility timeout, DLQ
- [ ] **SNS** — Pub/sub, fan-out with SQS
- [ ] **CloudWatch** — Logs, Metrics, Alarms
- [ ] **IAM** — Roles, policies, least privilege

### B. AWS Concepts for System Design
- [ ] VPC basics (subnets, security groups, NACLs)
- [ ] Load Balancers: ALB vs NLB
- [ ] Route 53 (DNS, routing policies)
- [ ] CloudFront (CDN)
- [ ] DynamoDB basics (partition key, sort key, GSI, LSI)
- [ ] Secrets Manager / Parameter Store

### C. Containers & Orchestration
- [ ] Docker: images, containers, Dockerfile, layers
- [ ] Docker Compose for local development
- [ ] Kubernetes basics: Pods, Deployments, Services, ConfigMaps
- [ ] ECS/EKS — conceptual awareness
- [ ] Container vs VM — when to use which

### D. CI/CD
- [ ] Pipeline stages: Build → Test → Deploy
- [ ] Jenkins pipeline basics (you use this)
- [ ] GitHub Actions workflow structure
- [ ] Blue-Green vs Canary vs Rolling deployments
- [ ] Infrastructure as Code concept (Terraform/CloudFormation — awareness)

### E. Monitoring & Logging
- [ ] Structured logging (JSON logs)
- [ ] Log aggregation (ELK / CloudWatch Logs)
- [ ] Metrics: latency percentiles (P50, P95, P99)
- [ ] Alerting strategy (don't alert on everything)
- [ ] Distributed tracing (X-Ray / Jaeger)

### F. Reliability
- [ ] SLA vs SLO vs SLI
- [ ] Circuit breakers in production
- [ ] Graceful degradation
- [ ] Chaos engineering basics (concept)
- [ ] Runbook / incident response basics

---

## Interview Questions (Top 10)
1. How does your application deployment pipeline work?
2. How do you handle a production incident?
3. Explain the difference between SQS and SNS. When would you use each?
4. How do you monitor your application in production?
5. What's the difference between horizontal and vertical scaling?
6. How do you handle secrets/credentials in your application?
7. Explain Docker layers and how to optimize a Dockerfile.
8. How do read replicas work? When would you add one?
9. What is a dead letter queue and when do you use it?
10. How do you handle database migrations without downtime?

---

## Start Here
Tell me: **"Start Cloud DevOps"** and we review key AWS services + deployment concepts.
