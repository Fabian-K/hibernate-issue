Running `mvn test` fails with `java.lang.IllegalArgumentException: org.hibernate.QueryException: could not resolve property: field of: org.example.Base [SELECT b FROM org.example.Base b where b.middle.target.field = :value]` when using
- 5.4.0.Final
- 5.4.12.Final

It works with
- 5.3.15.Final

It also works when
- renaming `Middle.key` to `Middle.id` and `MiddleId.key` to `MiddleId.id`
- not using a Composite ID for `Middle`
