# Daten mit `DataOutputStream` und `DataInputStream` verarbeiten
## Lernziel



Ein eigenes Format für die Daten einer Klasse definieren und diese Dann in einer Datei speichern und aus dieser wieder laden.

## Aufgabe

Gehen Sie in das Paket [pr2.io.data_output](../sources/src/main/java/pr2/io/data_output/).

In dieser Aufgabe finden Sie bereits eine fertig implementierte Klasse `Board` vor, die ein Schachbrett repräsentiert. Allerdings wird dieses nicht für Schach benutzt, sondern für ein Spiel, bei dem man nur schwarze und weiße Steine auf das Brett stellen kann (z.B. Dame). Die Farbe der Steine wird durch die Enumeration `Color` dargestellt.

Was bei dem Schachbrett allerdings noch fehlt, ist eine Möglichkeit den Spielstand zu speichern und später wieder einzulesen.

Schauen Sie sich die Klassen `Board` und `Color` genau an und versuchen Sie diese zu verstehen. Sie können auch testweise ein Brett anlegen und mit Daten befüllen. (Wie dies geht, sehen Sie im JUnit-Test). Die `toString()`-Methode liefert eine anschauliche Darstellung des Spielfeldes.

Implementieren Sie nun die Methoden `writeToFile` und `loadFromFile` unter Zuhilfenahme von `DateOutputStream` und `DataInputStream`. Hierzu müssen Sie noch das Datenformat für die Speicherung festlegen. Dieses ist wie folgt definiert:

  1. Als erstes der String "Schachbrett" im UTF8-Format, um das Datenformat zu kennzeichnen.
  2. Die Koordinaten der ersten Figur im Format x-Pos, y-Pos (beide als `byte`) und Farbe entsprechend `Color.ordinal()` (als `int`)
  3. Wiederholung von Schritt 2. bis alle Figuren gespeichert sind.
  4. Werte `0xff`, `0xff`, `-1`, um das Dateiende zu kennzeichnen

Lassen Sie den JUnit-Test laufen, um zu sehen, ob die Daten korrekt verarbeitet werden.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->