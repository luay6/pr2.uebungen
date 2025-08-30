# Singleton-Eigenschaft von Enumerationen
## Lernziel



Die Singleton-Eigenschaft von Enumerationen verstehen.

## Aufgabe

Gehen Sie in das Paket [pr2.enums.singleton](../sources/src/main/java/pr2/enums/singleton/).

Enumerationen werden in Java durch echte Klassen und Objekte dargestellt. Eine Besonderheit ist allerdings, dass von jeder Enumerationskonstante immer genau ein Objekt existiert, es sich also um Singletons handelt. Daher darf man Java-Enumerationen sicher mit `==` vergleichen.

Schreiben Sie bitte ein kleines Java-Programm `SingletonBeweis`, das nachweist, dass es sich bei Enumerationen wirklich um Singletons handelt. Verwenden Sie dazu die bereits vorgegebene Enumeration `MyEnum`.