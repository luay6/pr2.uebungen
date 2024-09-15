# synchronized verwenden
## Lernziel



Schlüsselwort `synchronized` verwenden.

## Aufgabe

Gehen Sie in das Paket [pr2.threads.synchronize](../sources/src/main/java/pr2/threads/synchronize/).

Schreiben Sie eine Klasse `Synchronizer`, die ein einziges `int`-Attribut und zusätzlich noch eine Methode `addAndPrint` enthält. Bei jedem Aufruf der Methode soll das Attribut um eins hochgezählt werden. Starten Sie zwei Threads, die diese Method konkurrierend aufrufen und sorgen Sie durch korrekte Synchronisation bei der `addAndPrint` dafür, dass keine Zahl zweimal ausgegeben wird und die Folge der Zahlen wirklich ohne Lücken ist.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->