# Klasse per Reflection analysieren
## Lernziel



Reflection einsetzen, um Klassen zu untersuchen.

## Aufgabe

Gehen Sie in das Paket [pr2.reflection.analyzer](../sources/src/main/java/pr2/reflection/analyzer/).

Schreiben Sie eine Klasse `Analyzer`, der man auf der Kommandozeile den Namen einer Klasse übergeben kann. Diese Klasse wird dann von `Analyzer` geladen und alle öffentlichen Methoden und Attribute der angegebenen Klasse werden auf der Konsole ausgegeben.

```console
> java Analyzer java.awt.Point
public int java.awt.Point.x
public int java.awt.Point.y
public boolean java.awt.Point.equals(java.lang.Object)
public java.lang.String java.awt.Point.toString()
public java.awt.Point java.awt.Point.getLocation(
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