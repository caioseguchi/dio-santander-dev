# Santander Dev Week
Java RESTful API - Santander:

## Class Diagrma
```
classDiagram
  class User {
    +String name
    +Account account
    +Feature[] features
    +Card card
    +News news
  }

  class Account {
    +String number
    +float agency
    +float balance
  }

  class Feature {
    +String icon
    +String description
  }

  class Card {
    +String number
    +float limit
  }

  class News {
    +String icon
    +String description
  }

  User --> Account
  User --> Feature
  User --> Card
  User --> News
```
