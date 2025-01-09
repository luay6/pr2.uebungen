# Map und Filter auf Streams
## Lernziel
 [Musterlösung](solution/)


Einen Stream durch Map- und Filter-Operationen analysieren und gewünschte Daten extrahieren.

## Aufgabe

Gehen Sie in das Paket [pr2.streams.map_filter](../sources/src/main/java/pr2/streams/map_filter/).

In dieser (und den folgenden Aufgaben) werden Sie Daten aus der Spieledatenbank von [Metacritic](http://www.metacritic.com) analysieren. Hierbei wurden die 994 Spiele mit der besten Bewertung ausgewählt. Für jedes Spiel sind angegeben:

  * Name des Spiels
  * Metacritic-Score (0-100)
  * Benutzerbewertung (0-100). Normalerweise werden die Benutzerbewertungen bei Metacritic on 0-10 mit einer Nachkommastelle angegeben. Für die einfachere Bearbeitung ist dies für Sie aber bereits in den Bereich 0-100 umgerechnet worden.
  * Erscheinungsjahr des Spiels

Die Verwaltung der Daten wurde Ihnen bereits abgenommen und wird von der Klasse `GameDatabase` durchgeführt. Ein einzelnes Spiel wird durch Objekte des Typs `ComputerGame` repräsentiert.

Schauen Sie sich die Klassen `ComputerGame` und `GameDatabase` an und versuchen Sie deren Funktionsweise zu verstehen.

Erweitern Sie nun die `main`-Methode von `MapFilterGames` so, dass Sie bestimmte Auswertungen auf den Spielen durchführen können. Folgende Informationen sollen Sie auswerten:

  1. Alle Spiele im Jahre 2010 mit einem Metascore >= 80 und einem Userscore >= 80.
  2. Das Spiel mit dem größten Unterschied zwischen Metascore und Userscore.
  3. Das Spiel mit dem kleinsten Unterschied zwischen Metascore und Userscore.

Lassen Sie Ihr Programm laufen und überprüfen Sie, ob die richtigen Informationen ausgegeben werden.

Die Datei mit den Spielen finden Sie unter [games.txt](../sources/src/main/resources/pr2/streams/map_filter/games.txt).


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->