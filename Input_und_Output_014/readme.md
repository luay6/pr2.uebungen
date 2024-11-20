# Rot13-Verschlüsselung
## Lernziel
 [Musterlösung](solution/)


Funktionsweise und Einsatz von Filtern.

## Aufgabe

Gehen Sie in das Paket [pr2.io.rot13](../sources/src/main/java/pr2/io/rot13/).

Schreiben Sie eine Klasse `Rot13Reader`, die als Filter-Reader implementiert ist und jedes eingelesene Zeichen durch ein Zeichen ersetzt, dessen numerischer Wert um 13 höher ist (d.h. um 13 Schritte im Alphabet verschoben ist).

Schreiben Sie eine Klasse `Rot13`, die einen Dateinamen von der Kommandozeile nimmt und diese Text-Datei mithilfe von `Rot13Reader` liest und auf der Konsole ausgibt.

```console
> cat /tmp/test
DIES IST EIN TEXT, DER GLEICH ROT13 VERSCHLUESSELT WIRD.

> java Rot13 /tmp/test
QVR`-V`a-RV[-aRea9-QR_-TYRVPU-_\a>@-cR_`PUYbR``RYa-dV_Q;
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