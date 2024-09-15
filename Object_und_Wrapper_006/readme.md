# Optimierung bei Integer
## Lernziel



Wrapper-Klassen und deren Optimierungen verstehen.

## Aufgabe

Gehen Sie in das Paket [pr2.object.wrapper_boxsearch](../sources/src/main/java/pr2/object/wrapper_boxsearch/).

Bei den Wrapper-Typen (z.B. `Integer`) wird eine interne Optimierung durchgeführt, die dazu führt, dass bei Werten unterhalb einer bestimmten Schranke, beim Autoboxing immer wieder dasselbe Objekt verwendet wird, anstatt ein neues Wrapper-Objekt zu erzeugten.

Schreiben Sie bitte ein Programm in der Klasse `BoxSearcher`, das für `Integer` diese Schranke sucht, indem es die Werte von `0` bis `200` auf diese Eigenschaft hin untersucht und für jeden Integer-Wert ausgibt, ob der Mechanismus bei ihm greift oder nicht.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->