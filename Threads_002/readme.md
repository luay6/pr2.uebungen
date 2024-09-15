# Thread per interrupt beenden
## Lernziel



Threads kontrolliert beenden.

## Aufgabe

Gehen Sie in das Paket [pr2.threads.interrupt](../sources/src/main/java/pr2/threads/interrupt/).

Schreiben Sie ein Java-Programm `ThreadsBeenden`, das einen Thread startet, der alle 100 Millisekunden eine Ausgabe erzeugt. Nachdem dieser Thread gestartet wurde, soll der Main-Thread zwei Sekunden warten und dann den anderen Thread sauber von außen beenden. Verwenden Sie zum Beenden des Threads die `interrupt`-Methode und denken Sie daran, die `InterruptedException` bei der `sleep`-Methode richtig zu behandeln.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->