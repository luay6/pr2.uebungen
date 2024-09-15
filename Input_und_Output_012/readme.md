# `RandomAccessFile`
## Lernziel



`RandomAccessFile` sowohl zum Lesen, als auch zum Schreiben von Daten einsetzen. Verstehen, dass man sich wahlfrei durch die Datei bewegen kann.

## Aufgabe

Gehen Sie in das Paket [pr2.io.random_access](../sources/src/main/java/pr2/io/random_access/).

Bei dieser Aufgabe werden Sie ein Verfahren anwenden, das bei sehr großen Datenmengen zum Einsatz kommt: das Sortieren der Daten direkt auf der Festplatte, ohne sie vollständig in den Hauptspeicher zu laden.

Implementieren Sie einen [Bubblesort](https://de.wikipedia.org/wiki/Bubblesort) mithilfe von `RandomAccessFile` direkt auf einer Datei. Bubblesort ist ein ausgesprochen ineffizienter Algorithmus (O(n*n)), er ist aber sehr einfach zu implementieren. Da die zu sortierende Datei klein ist, können wir hier mit den Nachteilen von Bubblesort leben.

Implementieren Sie die bereits vorhandene Methode `sortFile` der Klasse `FileSort`. Öffnen Sie zuerst die Datei mithilfe von `RandomAccessFile` im Modus `"rw"`. Wandern Sie nun - entsprechend dem Bubblesort-Algorithmus - über die Daten und sortieren Sie die Bytes der Datei. Halten Sie nie mehr als zwei `byte` und die Position als `long` im Speicher. Weitere Variablen können auch noch nötig sein, um den Algorithmus zu implementieren.

Testen Sie Ihre Implementierung mit den JUnit-Tests. Die Testdatei für den Unit-Test ist [data.dat](../sources/src/main/resources/pr2/io/random_access/data.dat)


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->