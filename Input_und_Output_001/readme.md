# `BufferedReader` zum zeilenweisen Lesen einsetzen
## Lernziel
 [Musterlösung](solution/)


Daten Zeilenweise mit einem `BufferedReader` verwenden und dabei das Decorator Pattern einsetzen.

## Aufgabe

Gehen Sie in das Paket [pr2.io.buffered_reader](../sources/src/main/java/pr2/io/buffered_reader/).

Lesen Sie die Datei [kafka.txt](../sources/src/main/resources/pr2/io/buffered_reader/kafka.txt) zeilenweise ein und geben Sie die Zeilen mit einer fortlaufenden Zeilennummer wieder aus. Verwenden Sie hierzu einen `BufferedReader`.

Eine beispielhafte Ausgabe sieht wie folgt aus:

```console
1: Verhaftung - Gespräch mit Frau Grubach - Dann Fräulein Bürstner
2:
3: Jemand mußte Josef K. verleumdet haben, denn ohne daß er etwas Böses
4: getan hätte, wurde er eines Morgens verhaftet. Die Köchin der Frau
5: Grubach, seiner Zimmervermieterin, die ihm jeden Tag gegen acht Uhr früh
6: das Frühstück brachte, kam diesmal nicht. Das war noch niemals
```

Lassen Sie das Programm laufen und überprüfen Sie, ob die Ausgabe korrekt ist. Die Beispieldatei hat 232 Zeilen.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->