# Fileattribute lesen
## Lernziel
 [Musterlösung](solution/)


Methoden der Klassen `Path` und `Files` nutzen und verstehen.

## Aufgabe

Gehen Sie in das Paket [pr2.io.filetest](../sources/src/main/java/pr2/io/filetest/).

Schreiben Sie eine Klasse `FileInfo`, der man auf der Konsole einen Datei- oder Verzeichnisnamen übergeben kann. Sie soll dann einige grundlegende Informationen über die Datei ausgeben (siehe Beispiel).

```console
> java FileTest /Users/thomas/Documents/../Documents/
/Users/thomas/Documents existiert
/Users/thomas/Documents ist 408 Bytes groß
/Users/thomas/Documents ist ein Verzeichnis
/Users/thomas/Documents darf gelesen werden
/Users/thomas/Documents darf geschrieben werden

> java FileTest /Users/thomas/Documents/../Documents/Uebungsklausur.pages
/Users/thomas/Documents/Uebungsklausur.pages existiert
/Users/thomas/Documents/Uebungsklausur.pages ist 258920 Bytes groß
/Users/thomas/Documents/Uebungsklausur.pages ist ein normale Datei
/Users/thomas/Documents/Uebungsklausur.pages darf gelesen werden
/Users/thomas/Documents/Uebungsklausur.pages darf geschrieben werden
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