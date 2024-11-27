# `super` und `extends` einsetzen
## Lernziel
 [Musterlösung](solution/)


Methoden unter Verwendung von `super` und `extends` gestalten, sodass sie flexibel auch mit Sub- bzw. Supertypen umgehen können.

## Aufgabe

Gehen Sie in das Paket [pr2.generics.super_extends](../sources/src/main/java/pr2/generics/super_extends/).

In dieser Aufgabe sollen Sie die Klasse `Liste` erweitern.

Fügen Sie `Liste` zwei Methoden hinzu:

  * `fillFrom`: befüllt die Liste mit den Daten aus einer anderen (übergebene) Liste.
  * `copyInto`: kopiert die Daten der Liste in eine andere (übergebene) Liste.

Verwenden Sie für Ihre Lösung `super` und `extends` zusammen mit Wildcards (`?`).

Kommentieren Sie die Testmethode in den vorhandenen Tests ein und führen Sie diese danach aus. Versichern Sie sich, dass Ihre Implementierung korrekt funktioniert, bevor Sie die Lösung abgeben.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->