# Daten mit einem `InputStream` lesen
## Lernziel



Einen `InputStream` benutzen, um Daten aus einer Datei zu lesen.

## Aufgabe

Gehen Sie in das Paket [pr2.io.datei_lesen](../sources/src/main/java/pr2/io/datei_lesen/).

Lesen Sie die Daten aus der Datei [daten.dat](../sources/src/main/resources/pr2/io/datei_lesen/daten.dat) byteweise und geben Sie den Inhalt auf der Konsole aus. Für die Ausgabe verwenden Sie bitte die Hexadezimale Darstellung, also z.B. `0x0a` für den Wert 11.

Lassen Sie das Programm laufen und betrachten Sie die Ausgabe. Wenn Sie alles korrekt implementiert haben, sollten Sie den Text

    0xca 0xff 0xfe 0xba 0xbe 0x0 0xde 0xad 0xbe 0xef

sehen.

Denken Sie auch an eine Fehlerbehandlung für eventuelle Ausnahmen im Zusammenhang mit der Datei.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->