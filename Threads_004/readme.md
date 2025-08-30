# Parallele Ausgaben erzeugen
## Lernziel



Erste Schritte mit Threads.

## Aufgabe

Gehen Sie in das Paket [pr2.threads.paralleldrucker](../sources/src/main/java/pr2/threads/paralleldrucker/).

Schreiben Sie ein Java-Programm `Paralleldrucker`, das zwei Threads startet, die beide in einer Endlosschleife einen Text auf der Konsole ausgeben, zum Beispiel "Thread 1 speaking". Parallel dazu soll der Main-Thread ebenfalls eine wiederkehrende Ausgabe erzeugen, z.B. "Hier spricht der Main-Thread". Verwenden Sie bitte für die Erzeugung der Threads anonyme innere Klassen, die `Runnable` implementieren.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->