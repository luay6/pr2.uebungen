# Daten mit einem `OutputStream` schreiben
## Lernziel



Einen `OutputStream` verwenden, um Daten zu schreiben.

## Aufgabe

Gehen Sie in das Paket [pr2.io.datei_schreiben](../sources/src/main/java/pr2/io/datei_schreiben/).

In dieser Aufgabe sollen Sie eine Reihe von Bytes in eine Datei schreiben. Ein JUnit-Test wird überprüfen, ob Sie dies richtig getan haben.

Öffnen Sie einen passenden `OutputStream`, um in die Datei `output/daten.dat` zu schreiben (verwenden Sie die Konstante `FILE` für den Dateinamen). Schreiben Sie nun die Byte-Folge

```console
0xca 0xff 0xfe 0xba 0xbe 0x0 0xde 0xad 0xbe 0xef
```

hinein und schließen Sie die Datei wieder.

Führen Sie den JUnit-Test aus, der überprüft, ob alle Daten korrekt in die Datei geschrieben wurden.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->