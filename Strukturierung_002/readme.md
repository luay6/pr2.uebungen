# Vorhandene Bibliotheken als JAR einbinden
## Lernziel
 [Musterlösung](solution/)


Eine vorhandene Bibliothek in einem Projekt verwenden und hierzu ein JAR einbinden.

## Aufgabe

Im Paket [pr2.strukturierung.jars_einbinden](../sources/src/main/java/pr2/strukturierung/jars_einbinden/) finden Sie eine Klasse `PieChart`, deren Rumpf auskommentiert ist.

In dieser Aufgabe werden Sie die Bibliothek [JFreeChart](http://www.jfree.org/jfreechart/) für die Darstellung von Grafiken verwenden. Hierzu müssen die JARs der Bibliothek in das Projekt eingebunden werden.

Die beiden JAR-Dateien `jcommon-1.0.23.jar` und `jfreechart-1.0.19.jar` liegen bereits im `lib`-Ordner des Projektes, sind aber noch nicht in das Projekt eingebunden.

Binden Sie die Bibliotheken über den entsprechenden Dialog in Eclipse ein: `Properties` -> `Java Build Path` -> `Libraries` -> `Add JARs`...

Kommentieren Sie die auskommentierten Passagen in der Klasse `PieChart` wieder ein und starten Sie das Programm. Experimentieren Sie ein wenig mit Werten, die dargestellt werden.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->