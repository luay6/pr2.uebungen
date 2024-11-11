# Konstruktoren schreiben
## Lernziel
 [Musterlösung](solution/)


Für eine vorhandene Klasse Konstruktoren schreiben und Konstruktoren sich gegenseitig und auch Konstruktoren der Superklasse aufrufen lassen.

## Aufgabe

Im Paket [pr2.vererbung.konstruktoren](../sources/src/main/java/pr2/vererbung/konstruktoren/) finden Sie die Klassen, welche Charaktere in einem Spiel repräsentieren.

Sie sollen Klassen entwickeln, welche Charaktere in einem Spiel repräsentieren. Es gibt in dem Spiel zwei Rassen:

  * die _Nachtelfen_ mit der Spezialfähigkeit _Naturwiderstand_ und
  * die _Untoten_ mit der Spezialfähigkeit _Unterwasseratmung_.

Ausgehend von der Klasse `Wesen` sollen die beiden Rassen durch zwei Klassen `Untoter` und `Nachtelf` repräsentiert werden. Diese Klassen sind auch bereits vorhanden, allerdings fehlen die Konstruktoren und die Vererbung ist noch nicht deklariert.

Leiten Sie die beiden Klassen also von `Wesen` ab und schreiben Sie entsprechende Konstruktoren. Beide Klassen sollen zwei Konstruktoren haben:

  * bei einem kann man den Namen und die Stärke der Spezialfähigkeit mitgeben,
  * beim anderen nur den Namen; die Spezialfähigkeit soll dann dem Standardwert entsprechen.

### Test

Testen Sie die Funktionsweise Ihrer Konstruktoren mit dem vorgegebenen JUnit-Test. Entfernen Sie die Kommentare, um die entsprechenden Tests zu aktivieren und importieren Sie die noch fehlenden Klassen und Methoden.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->