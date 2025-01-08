Vedios 4

When migrate from monolhic to microservice  
-- Strangler -- Help move small traffic to new microservice through controller

-- SAGA (Sequence of Local Transaction) -- maintened Transactional property
    Why it is needed : bcoz of microservice arch, if eack of them has specific table and want to committed the trans in sequence
    Choreograpghy
    Orchscrator 

-- CQRS (Command Query Request Seggregation)-- help in query
    When we want to query in different table of different ms.
    command : when we want to alter the data
    Query : when you want to read that data
    1) Usually, data is more queried than altered, So it allows us to scale up command and query independently of each other.
    This is a great advantage for example in systems where the reads outnumbers the writes.
    2) Seperating commands and queries allows us to **optimize each for high performance.**
    index tends to slow down the DB writes, so index on read is a problem
    3) Executing command and query operation on the same model could cause **data contention.**
    Data contention refer to multiple processes or instances competing for access to the same index or data block at the same time.
    4) Sepration provides the ability to manage command and query **security and permission differently**.

1) Why Each microservice has its own DB
   1) If there are more request for one service then unnecessary up scaling the DB for other
   2) We can not delete coloumn in table easliy becasuse the dependency on the table from the other services.
   Advantage:
   1) I can join the data esaily by query join
   2) Easy to maintain Transcational Property (ACID)