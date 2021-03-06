---
id: subscriptions
title: Subscriptions
---
Subscriptions are supported with `graphql-java`. See their documentation first:
https:

To make a function a subscription function you just have to have the return type wrapped in an implementation of a
reactive-streams ``. As an example here is a function that uses Spring WebFlux to return a random number every
second. Since `` is an implementation of `` this is a valid method.

```kotlin



```

Then in the `` method you just have to provide a `` the same way as queries and mutations
are provided with the `` argument.

```kotlin



```

### Flow Support

`` provides support for Kotlin `` through `` that automatically converts
`` to a ``.

### Subscription Hooks

#### ``

This hook is called after a new subscription type is generated but before it is added to the schema. The other generator hooks are still called so you can add logic for the types and
validation of subscriptions the same as queries and mutations.

#### ``

This hook is called when generating the functions for each subscription. It allows for changing the rules of what classes can be used as the return type. By default, graphql-java supports ``.

To effectively use this hook, you should also override the `` hook, and if you are using `` you should override the `` bean to specify a custom subscription execution strategy.

### Server Implementation

The server that runs your GraphQL schema will have to support some method for subscriptions, like WebSockets.
`` provides a default WebSocket based implementation. See more details in the
[server documentation](../../server/server-subscriptions.md).
