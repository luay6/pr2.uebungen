# Datei zerhacken
## Lernziel



Daten byteweise aus einem Stream lesen.

## Aufgabe

Gehen Sie in das Paket [pr2.io.scrambler](../sources/src/main/java/pr2/io/scrambler/).

Schreiben Sie eine Klasse `Scrambler`, die einen Dateinamen von der Kommandozeile entgegennimmt, die Datei einliest und dann wieder auf der Konsole ausgibt. Allerdings soll bei der Ausgabe nur jedes zweite Byte berücksichtigt werden.

```console
> java Scrambler ../src/Scrambler.java
motjv.oFlIpttem
motjv.oFlNtonEcpin
motjv.oIEcpin
pbi ls cabe
  pbi ttcvi anSrn[ rs hosIEcpin{    i ag.egh! ){      Sse.r.rnl(
  Bteen ae nee";      Sse.xt1;    }
    ienuSra i;
    r
      i  e ienuSra(rs0)
```


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->