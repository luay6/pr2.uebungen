# `Map<T>` verwenden
## Lernziel
 [Musterlösung](solution/)


Das Interface `Map<T>` und seine Implementierungen verwenden, um Daten effizient zu verarbeiten.

## Aufgabe

Gehen Sie in das Paket [pr2.collections.map](../sources/src/main/java/pr2/collections/map/).

In dieser Aufgabe geht es darum, die Häufigkeit von Wörtern in einem Text zu analysieren. Ein grundlegendes Gerüst für das Programm ist auch bereits vorgegeben, damit Sie sich auf das Wesentliche konzentrieren können.

Betrachten Sie die Klasse `WordCount`. In dieser fehlen noch einige Elemente, damit das Programm korrekt funktionieren kann.

Die innere Klasse `WordFrequency` muss das Sortieren unterstützen. Implementieren Sie daher das Interface `Comparable`.

Fügen Sie in der Klasse `WordCount` an den durch TODO-Kommentare markierten Stellen Code hinzu, der mithilfe einer Map die Worthäufigkeiten bestimmt.

Die Datei mit dem Text finden Sie unter [kafka.txt](../sources/src/main/resources/pr2/collections/map/kafka.txt).

Lassen Sie das Programm laufen. Es sollte eine Ausgabe wie folgt erzeugen:

```console
er: 80
sie: 66
und: 64
die: 59
der: 51
zu: 46
es: 45
nicht: 41
das: 38
in: 35
...
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