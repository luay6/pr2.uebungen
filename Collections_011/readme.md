# Wörterbuchprogramm
## Lernziel
 [Musterlösung](solution/)


Interface `Map` und seine Implementierungen einsetzen.

## Aufgabe

Gehen Sie in das Paket [pr2.collections.woerterbuch](../sources/src/main/java/pr2/collections/woerterbuch/).

Schreiben Sie ein einfaches Wörterbuchprogramm, dem man auf der Kommandozeile eine beliebige Anzahl von Wörtern übergeben kann und das dann die entsprechende Übersetzung ausgibt. Die Wörter des Wörterbuchs sollen fest im Programm einprogrammiert sein. Es reicht, wenn Sie einige wenige Wörter vorsehen.

Berücksichtigen Sie bitte den Fall, dass der Benutzer kein Wort auf der Kommandozeile angibt bzw. dass ein Wort nicht im Wörterbuch vorhanden ist.

```console
> java Woerterbuch
Bitte mindestens ein Wort angeben!
```

```console
>java Woerterbuch gehen schlafen tanzen hopsen
gehen => go
schlafen => sleep
tanzen => dance
hopsen => <unbekanntes Wort>
```


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->