# ecommerce
Microservices Breakdown
Service	Description
API Gateway	Entry point. Routes requests, applies filters (JWT auth, rate limiting).
Discovery Server	Eureka service registry.
Config Server	Centralized config for all services.
Auth Service	Handles login/signup, issues JWT tokens.
User Service	Manages customer profiles.
Product Service	Manages products, inventory.
Cart Service	Stores temporary carts per user.
Order Service	Creates orders, interacts with Payment & Inventory async.
Payment Service	Listens to Kafka for OrderPlaced → processes payments.
Shipping Service	Ships confirmed orders, sends Kafka OrderShipped.
Notification Service	Sends email/SMS on various Kafka events (OrderConfirmed, Shipped).
