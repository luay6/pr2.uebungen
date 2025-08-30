# Konsolen Input/Output
## Lernziel



Daten von der Konsole lesen und über eine Ausgabeumlenkung in eine Datei umlenken. `PrintStream` und `InputStreamReader` einsetzen.

## Aufgabe

Gehen Sie in das Paket [pr2.io.konsole](../sources/src/main/java/pr2/io/konsole/).

Lesen Sie zeilenweise mithilfe eines `BufferedReaders` von der Konsole Zeichen ein. Geben Sie diese wieder auf `System.out` aus und zeigen Sie die aktuelle Zeilennummer auf `System.err` an.

Testen Sie das Programm.

Lenken Sie nun die Ausgabe von `System.out` in die Datei `output/console.log` um (siehe Konstante `LOGFILE`). Lassen Sie das Programm erneut laufen und betrachten Sie danach die Datei mit den umgeleiteten Daten.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->