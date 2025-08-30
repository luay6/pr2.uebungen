# Generische Queue
## Lernziel



Einen komplexeren generischen Typ entwickeln.

## Aufgabe

Gehen Sie in das Paket [pr2.generics.queue](../sources/src/main/java/pr2/generics/queue/).

Schreiben Sie eine generische Klasse `Queue`, die eine einfache Warteschlange (Queue) realisiert. Über die Methode `offer` können Objekte hinzugefügt werden, über `poll` wieder ausgelesen. Über Probleme des Over- und Underflows brauchen Sie sich hier keine Gedanken zu machen.

Erweitern Sie die Klasse `Queue` um eine Methode `addAll`, der man eine andere `Queue` übergibt und die dann alle Elemente der übergebenen Queue in die aktuelle übernimmt.

Erweitern Sie die Klasse `Queue` aus der vorhergehenden Aufgabe um eine Methode `copyInto`, der man eine andere `Queue` übergibt und die dann alle Elemente der aktuellen Queue in die übergebenen kopiert.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->