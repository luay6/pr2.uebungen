# Timer und TimerTask verwenden
## Lernziel



Klassen aus `java.util.concurrent` verwenden.

## Aufgabe

Gehen Sie in das Paket [pr2.threads.timer](../sources/src/main/java/pr2/threads/timer/).

Schreiben Sie eine Klasse `FakultaetTimer`, die in der Lage ist, die Fakultäten für alle Zahlen zwischen 0 und 20 zu berechnen. Der Berechnung dient eine Methode `calculate` die ein `long`-Array mit den Ergebnissen zurückgibt. Verwenden Sie zur Implementierung der Berechnung die Klasse `Timer` und `TimerTask`, wobei Sie für jede zu berechnende Zahl einen eigenen `TimerTask` verwenden sollen.

Schreiben Sie eine `main`-Methode in der Klasse `Main`, welche die Klasse `FakultaetTimer` verwendet, um die Fakultäten von 0 bis 20 zu berechnen. Danach soll sie das Ergebnis der Berechnung ausgeben.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->