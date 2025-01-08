Microservice are small, loosly coupled applications or services, that can fail independently from each other

If a ms fails, only a single function or process in the system should become unavailable, while the rest of the system remains unaffected.

DRY principle ?
Principles :
    1. Each ms should be responsilbe for a single function or process
    2. ms should not share code or data
    3. Independence and autonomy are more important than code re-usability
    4. MS are not allowed to communicate directly with each other. They should make use of event/message bus to communicate with one another.

Benefits:
    1. **Imporve modularity** by making it easier to understand, develop and test the system.
    2. **Reduce complexity** by having a smaller code-base per ms.
    3. Allow you to update functionality with no or minimal effect on the rest of the system.
    4. Greatly reduces the chance of breaking something in an unrelated part of the system.
    5. Allow for a more controlled collaboration in a team of developer that are working on the same system at the same time.
    6. Enable **continuous delivery** and development of large, complex applications by applying the principle of "divide and concur".
    7. Services can be deployed independently without having to wait for the entire system to be published.
    8. It creates an architecture that is **highly scalable**.
    9. Allow for deployment to **multiple cloud** and on-premise infra-structure enviornment.
    10 Take advantage of emerging technologies(framework, programming language etc.) while evolving an existing system.

Anti-Pattern
    1. Everything should be micro except database
    2. Microservice will magically solve poor development practices.( bad development habits are can be easily transferred in monolithic)
    3. Since ms focus on resolving a single system function or process, there is no need for coordination between development teams.
    4. Making the technologies behind the ms your key focus
Building Blocks:
    1. Deployment- Viewpoint of a typical ms architecture
    2. MS as Restful APIs.
    3. Event-driven communication between ms using an event bus.
    4. Securing MS
MS Architecture:
client 
container
API Gateway -- Allow client to talk to ms
Authentication service

