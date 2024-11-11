# Assignment: Stein, Papier, Schere, Echse, Spock
## Lernziel
 [Musterlösung](solution/)


Mit Enumerationen arbeiten.

## Aufgabe

Gehen Sie in das Paket [pr2.enums.schnick](../sources/src/main/java/pr2/enums/schnick).

![Regeln für Schnick-Schnack-Schnuck](img/schnick.png)

Schreiben Sie ein einfaches Spiel (Klasse `SchnickSchnackSchnuck`), bei dem Sie gegen den Computer Schnick-Schnack-Schnuck spielen (auch Rock, Paper, Scissors genannt) mit folgenden Eigenschaften:

  * Das Spiel geht über drei Runden.
  * Es fragt den Spieler nach seiner Auswahl (r, p, s).
  * Der Computer zieht zufällig eine der drei Möglichkeiten.
  * Nach jeder Runde sagt das Spiel, wer welche Möglichkeit gewählt hat und wer die Runde gewonnen hat.
  * Ein Sieg bringt einen Punkt, ein Unentschieden 0 Punkte.
  * Die Punkte jeder Runde werden addiert.
  * Am Ende wird der Gesamtpunktestand ausgegeben.

Eine beispielhafte Session mit dem Programm sieht dann wie folgt aus:

```console
Runde 1: Dein Zug ([r]rock, [p]aper, [s]cissors)? r
Der Computer hat gewonnen - Du: ROCK, Computer: PAPER - [0:1]

Runde 2: Dein Zug ([r]rock, [p]aper, [s]cissors)? p
Unentschieden - Du: PAPER, Computer: PAPER - [0:1]

Runde 3: Dein Zug ([r]rock, [p]aper, [s]cissors)? s
Du hast gewonnen: Du: SCISSORS, Computer: PAPER - [1:1]### Abgabe
Ergebnis - Du 1 Punkt(e), Computer 1 Punkt(e)
```

Repräsentieren Sie die Züge mithilfe einer Enumeration `Move`. Diese soll auch die Tasten beinhalten, welche man für die einzelnen Züge (`r`, `p`, `s`) drücken muss.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->