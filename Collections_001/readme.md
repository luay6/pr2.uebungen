# Iterator schreiben
## Lernziel



Für eine gegebene Klasse einen Iterator schreiben.

## Aufgabe

Gehen Sie in das Paket [pr2.collections.iterator](../sources/src/main/java/pr2/collections/iterator/).

In dieser Aufgabe sollen Sie für eine bereits vorhandene Klasse einen Iterator schreiben. Bei dieser Klasse (`SimpleStack`) handelt es sich um einen sehr einfach (und nicht sehr sicher) programmierten Stack.

Implementieren Sie in `SimpleStack<T>` das Interface `Iterable<T>` und schreiben Sie, wie vom Interface verlangt einen Iterator für die Klasse. Sie sollten hier innere Klasse verwenden, um den Zugriff auf die privaten Attribute von `SimpleStack` zu vereinfachen.

Benutzen Sie die Tests in `SimpleStackTest`, um zu überprüfen, dass Ihre Implementierung des Iterators richtig funktioniert. Hierzu müssen Sie die entsprechenden Tests allerdings erst einkommentieren.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->