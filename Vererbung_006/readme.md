# Polymorphie einsetzen
## Lernziel



Durch Polymorphie Subklassen wie Basisklassen behandeln können.

## Aufgabe

Im Paket [pr2.vererbung.polymorphie](../sources/src/main/java/pr2/vererbung/polymorphie/) finden Sie Klassen, welche Tiere in einem Zoo repräsentieren.

In dieser Aufgabe geht es darum, einen Zoo zu simulieren. In dem Zoo gibt es _Affen_, _Gorillas_ und _Giraffen_. Die Tiere sind oft hungrig und müssen deshalb gefüttert werden. Hierzu dient die Klasse `Futterstelle`, die für die verschiedenen Tierarten entsprechende Fütterungsmethoden hat.


### UML-Diagramm

Sehen Sie sich die Klassen für die verschiedenen Tiere, die `Futterstelle` und `ZooSimulation` genau an und zeichnen Sie danach ein UML-Diagramm der Klassen und ihrer Beziehungen.


### Futterstelle

Schreiben Sie die Klasse `Futterstelle` so um, dass sie Polymorphie nutzt, um alle Tiere mit nur einer einzigen Methode zu füttern.

Schreiben Sie danach die Klasse `ZooSimulation` so um, dass Sie anstatt von drei Variablen `charlie`, `buck` und `debbie` ein einziges Array `tiere` verwendet.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->