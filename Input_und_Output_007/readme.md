# Filesystem-Abstraktion mit `File`
## Lernziel
 [Musterlösung](solution/)


Die Klasse `Path` einsetzen, um plattformunabhängig Operationen auf dem Dateisystem durchzuführen.

## Aufgabe

Gehen Sie in das Paket [pr2.io.file](../sources/src/main/java/pr2/io/file/).

Benutzen Sie die Klasse `Path`, um die Festplatte Ihres Computers, ausgehend von dem als `root` bezeichneten Verzeichnis `../..` zu durchsuchen und die Größe der Verzeichnisse zu berechnen.

Sie können die Größe eines Verzeichnisses nur indirekt bestimme, indem Sie die Größe aller Dateien in dem Verzeichnis addieren. Das Verzeichnis direkt kann man _nicht_ mit `size()`  nach seiner Größe fragen, wohl aber normale Dateien. Deswegen müssen Sie in Ihrem Programm immer sauber unterscheiden, ob ein Verzeichnis vorliegt (das sie rekursiv durchlaufen müssen) oder eine normale Datei (deren Größe Sie abfragen).

Geben Sie die Verzeichnisse mit Ihrer Größe aus. Am Ende des Programms geben Sie noch die Gesamtgröße aller Unterverzeichnisse aus. Eine beispielhafte sähe wie folgt aus:

```console
Untersuche: /home/thomas/eclipse-workspace

465 Byte - /home/thomas/eclipse-workspace/.recommenders/snipmatch/repositories
1,4 kByte - /home/thomas/eclipse-workspace/.recommenders/snipmatch
4,6 MByte - /home/thomas/eclipse-workspace/.recommenders
57,5 MByte - /home/thomas/eclipse-workspace
103 Byte - /home/thomas/lib/.settings
5,8 MByte - /home/thomas/lib

Gesamtgröße: 80,4 MByte
```

Lassen Sie Ihr Programm laufen und überprüfen Sie, ob die Ausgaben plausibel sind. Vergleichen Sie das Ergebnis mit den Angaben des Windows-Explorers, Mac-Finders oder Linux-Dateimanagers.

Unter Linux und MacOS müssen Sie darauf achten, dass Sie symbolischen Links in Ihrem Programm nicht folgen, sonst zählen Sie möglicherweise zu viel.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->