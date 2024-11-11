# Figur und Rechteck
## Lernziel
 [Musterlösung](solution/)


Vererbung sinnvoll einsetzen.

## Aufgabe

Gehen Sie in das Paket [pr2.vererbung.geometrie1](../sources/src/main/java/pr2/vererbung/geometrie1/).

Schreiben Sie eine Klasse `Figur`, die als einziges Attribut die Fläche (`flaeche`) der Figur hat. Bieten Sie zusätzlich eine Methode `getFlaeche()` an, mit der die Fläche wieder ausgelesen werden kann. Sorgen Sie dafür, dass nur Subklassen den Konstruktor dieser Klasse aufrufen können und dass das Attribut mit der Fläche ebenfalls nur für Subklassen verfügbar ist.

Leiten Sie von der Klasse `Figur` eine Klasse `Rechteck` ab. Das Rechteck soll durch Höhe und Breite beschrieben werden und diese Werte sollen benutzt werden, um die Fläche der Figur zu setzen.

Schreiben Sie eine Klasse `Main` mit einer `main`-Methode, welche Ihre beiden gerade entwickelten Klassen nutzt.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->