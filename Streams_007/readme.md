# Map und Reduce auf Streams
## Lernziel
 [Musterlösung](solution/)


Die Daten in einem Stream durch Map- und Reduce verdichten.

## Aufgabe

Gehen Sie in das Paket [pr2.streams.reduce_critics](../sources/src/main/java/pr2/streams/reduce_critics/).

In dieser (und den folgenden Aufgaben) werden Sie Daten aus der Spieldatenbank von [Metacritic](http://www.metacritic.com) analysieren. Hierbei wurden die 994 Spiele mit der besten Bewertung ausgewählt. Für jedes Spiel sind angegeben:

  * Name des Spiels
  * Metacritic-Score (0-100)
  * Benutzerbewertung (0-100). Normalerweise werden die Benutzerbewertungen bei Metacritic on 0-10 mit einer Nachkommastelle angegeben. Für die einfachere Bearbeitung ist dies für Sie aber bereits in den Bereich 0-100 umgerechnet worden.
  * Erscheinungsjahr des Spieles

Die Verwaltung der Daten wurde Ihnen bereits abgenommen und wird von der Klasse `GameDatabase` durchgeführt. Ein einzelnes Spiel wird durch Objekte des Typs `ComputerGame` repräsentiert.

Schauen Sie sich die Klassen `ComputerGame` und `GameDatabase` an und versuchen Sie deren Funktionsweise zu verstehen.

Erweitern Sie nun die `main`-Methode von `MapReduceGames` so, dass Sie bestimmte Auswertungen auf den Spielen durchführen können. Folgende Informationen sollen Sie auswerten:

  1. Das [Quadratische Mittel](https://de.wikipedia.org/wiki/Quadratisches_Mittel) des Unterschiedes zwischen Metascore und Userscore.
  3. Das [Arithmetische Mittel](https://de.wikipedia.org/wiki/Arithmetisches_Mittel) des Unterschiedes zwischen Metascore und Userscore.

Lassen Sie Ihr Programm laufen und überprüfen Sie, ob die richtigen Informationen ausgegeben werden.

Die Datei mit den Spielen finden Sie unter [games.txt](../sources/src/main/resources/pr2/streams/reduce_critics/games.txt).


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->