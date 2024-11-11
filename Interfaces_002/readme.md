# Interface Stack entwerfen
## Lernziel
 [Musterlösung](solution/)


Ein Interface entwerfen und dieses dann implementieren.

## Aufgabe

Gehen Sie in das Paket [pr2.interfaces.stack](../sources/src/main/java/pr2/interfaces/stack/).

Entwerfen Sie bitte ein Interface `Stack`, das die grundlegenden Operationen eines Stacks definiert:

  * `push` -- schiebt ein neues Objekt auf den Stack
  * `pop` -- holt das obere Element vom Stack und gibt es zurück
  * `peek` -- gibt das obere Element zurück, lässt es aber auf dem Stack liegen
  * `size` -- gibt die Anzahl der Elemente auf dem Stack zurück

Der Stack soll beliebige Objekte verwalten können.

Implementieren Sie das Interface mit einer Klasse `StackImpl` und schreiben Sie JUnit-Tests, um Ihre Implementierung zu testen.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->