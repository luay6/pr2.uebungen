# Fakultät parallel berechnen
## Lernziel



Berechnungen parallelisieren.

## Aufgabe

Gehen Sie ins Paket [pr2.threads.fakultaet](../sources/src/main/java/pr2/threads/fakultaet/).

Schreiben Sie eine Klasse `FakultaetParallel`, die in der Lage ist, die Fakultäten für eine Reihe von Zahlen zwischen 0 und 20 zu berechnen. Der Berechnung dient eine Methode `calculate`, der die Zahl (1-20) übergeben wird, bis zu der die Reihe von Fakultäten berechnet werden soll und die dann ein `long`-Array mit den Ergebnissen zurückgibt. Verwenden Sie zur Implementierung der Berechnung zwei Threads, die sich die Arbeit teilen.

Schreiben Sie eine `main`-Methode in der Klasse `Main`, welche die Klasse `FakultaetParallel` verwendet, um die Fakultäten von 0 bis 20 zu berechnen. Danach soll sie das Ergebnis der Berechnung ausgeben.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->