# Interface: Uebersetzer
## Lernziel



Ein Interface implementieren.

## Aufgabe

Im Paket [pr2.interfaces.uebersetzer](../sources/src/main/java/pr2/interfaces/uebersetzer/) finden Sie das Interface `Uebersetzer`, das eine Methode zum Übersetzen von Strings definiert.

Implementieren Sie das Interface für die Sprachen Spanisch (`UebersetzerDeutschSpanisch`) und Englisch (`UebersetzerDeutschEnglisch`) und schreiben Sie eine Klasse `Translator`, die auf der Kommandozeile als erstes Argument die Sprache und als zweites das zu über\-setzende deutsche Wort nimmt und dann auf der Konsole die Übersetzung ausgibt. Es genügt, wenn Sie einige wenige Worte in den Klassen als Übersetzungen vorhalten.

```console
> java Translator englisch gehen
Übersetzung: deutsch -> englisch
gehen -> go

> java Translator spanisch gehen
Übersetzung: deutsch -> spanisch
gehen -> ir

> java Translator deutsch gehen
Unbekannte Sprache

> java Translator spanisch fliegen
Unbekanntes Wort: fliegen
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