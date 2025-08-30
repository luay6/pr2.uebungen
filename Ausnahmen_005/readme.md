# Ausnahmen mit `try` und `catch` behandeln.
## Lernziel



Vorhandene Ausnahmen mit `try` und `catch` abfangen und behandeln.

## Aufgabe

Gehen Sie in das Paket [pr2.exceptions.try_catch](../sources/src/main/java/pr2/exceptions/try_catch/).

Betrachten Sie das sehr einfache Zahlenraten-Spiel. Lassen Sie es laufen und spielen Sie ein paar Runden. Versuchen Sie das Programm durch falsche Eingaben zum Absturz zu bringen.

Im Augenblick werden die Ausnahmen in der `main()`-Methode weiter deklariert, was schlechter Stil ist und zu bei Falscheingaben zu Programmabstürzen führt. Ändern Sie das Programm stattdessen so ab, dass die Ausnahmen korrekt behandelt werden. Entfernen Sie danach die `throws`-Deklaration aus dem Kopf der `main()`-Methode.

Lassen Sie das Programm erneut laufen und testen Sie, ob es jetzt nach Falscheingaben immer noch abstürzt.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->