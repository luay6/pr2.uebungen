# Handle-or-Declare-Regel anwenden
## Lernziel
 [Musterlösung](solution/)


In einem vorhandenen Programm die Ausnahmen korrekt weiter deklarieren und an den richtigen Stellen fangen.

## Aufgabe

Gehen Sie in das Paket [pr2.exceptions.handle_or_declare](../sources/src/main/java/pr2/exceptions/handle_or_declare/).

Entfernen Sie auskommentierten Zeilen in der Klasse `Buchstabenzaehler`. Das Programm wird nicht korrekt kompilieren, weil die Ausnahmen nicht richtig deklariert und behandelt wurden.

Korrigieren Sie diesen Fehler und sorgen Sie dafür, dass die Ausnahmen an den Stellen behandelt werden, an denen Sie behandelt werden sollten, d.h. dort wo die Verursachung liegt. Bei der `StatistikException` handelt es sich um eine Inkonsistenz im Programm. Überlegen Sie, wo diese behandelt werden sollte und wann sie auftreten kann.

Sie müssen die Ausnahmen sinnvoll behandeln. Sie einfach an der `main`-Methode
zu deklarieren ist keine valide Lösung dieser Aufgabe.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->