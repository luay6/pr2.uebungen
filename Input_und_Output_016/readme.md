# Serialisierung
## Lernziel
 [Musterlösung](solution/)


Serialisierung einsetzen können, um Objekte zu persistieren und wieder zu laden.

## Aufgabe

Gehen Sie in das Paket [pr2.io.serialisierung](../sources/src/main/java/pr2/io/serialisierung/).

In dieser Aufgabe finden Sie bereits eine fertig implementierte Klasse `Board` vor, die ein Schachbrett repräsentiert. Allerdings wird dieses nicht für Schach benutzt, sondern für ein Spiel, bei dem man nur schwarze und weiße Steine auf das Brett stellen kann (z.B. Dame). Die Farbe der Steine wird durch die Enumeration `Color` dargestellt.

Was bei dem Schachbrett allerdings noch fehlt, ist eine Möglichkeit den Spielstand zu speichern und später wieder einzulesen.

Schauen Sie sich die Klassen `Board` und `Color` genau an und versuchen Sie diese zu verstehen. Sie können auch testweise ein Brett anlegen und mit Daten befüllen. (Wie dies geht, sehen Sie im JUnit-Test). Die `toString()`-Methode liefert eine anschauliche Darstellung des Spielfeldes.

Implementieren Sie nun die Methoden `writeToFile` und `loadFromFile` unter Zuhilfenahme von Serialisierung. D.h. anders als in der Aufgabe zu `DataOutputStream`, sollen Sie hier kein eigenes Datenformat implementieren. Verwenden Sie stattdessen einen `ObjectOutputStream` bzw. `ObjectInputStream`.

Lassen Sie den JUnit-Test laufen, um zu sehen, ob die Daten korrekt verarbeitet werden. Die Test-Datei für den Unit-Test ist [testdata.dat](../sources/src/main/resources/pr2/io/serialisierung/testdata.dat)


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->