# wait und notify benutzen
## Lernziel



Thread-Koordination über Condition-Variablen.

## Aufgabe

Gehen Sie in das Paket
[pr2.threads.notifier](../sources/src/main/java/pr2/threads/notifier/).

Schreiben Sie eine Klasse `Notifier`, die ein einziges `String`-Attribut enthält. Sie soll weiterhin zwei Methoden haben:

  * `setString(String string)` -- Diese Methode setzt den String auf einen neuen Wert, aber nur, wenn der String `null` ist. Ist der String bereits gesetzt, wartet die Methode darauf, dass ein anderer Thread den String über die `getString()`-Methode liest und wieder zurücksetzt.
  * `getString()` -- Liest den String aus, gibt das Ergebnis zurück und setzt das Attribut wieder zurück auf `null`. Wenn kein String vorhanden ist (d.h. wenn das Attribut bereits `null` ist), wartet die Methode, bis ein anderer Thread mit `setString(String string)` einen String abspeichert.

Schreinben Sie eine Klasse `Main` mit einer `main`-Methode. Starten Sie zwei Threads, die Strings in einer `Notifier`-Instanz abspeichern und drei Threads, die Strings auslesen. Lassen Sie die Threads nach jeder Operation für 200 Millisekunden schlafen.

Verwenden Sie bitte `wait` und `notify` bzw. `notifyAll`, um die Threads entsprechend zu koordinieren.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->