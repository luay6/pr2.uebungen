# Race-Condition finden und beheben
## Lernziel
 [Musterlösung](solution/)


In einem gegebenen Programm Race-Conditions finden und durch den Einsatz von kritischen Abschnitten beheben.

## Aufgabe

Gehen Sie in das Paket [pr2.threads.race_condition](../sources/src/main/java/pr2/threads/race_condition/).

In dieser Aufgabe haben Sie ein defektes Programm vor sich, das aufgrund von Race-Conditions nicht richtig funktionieren kann.

Schauen Sie sich den Quelltext des Programms genau an und versuchen Sie die Funktionsweise zu verstehen. Lassen Sie das Programm laufen und betrachten Sie die Fehlermeldungen und Ausgaben. Mit großer Wahrscheinlichkeit wird das Programm abstürzen. Wenn nicht, starten Sie es mehrmals, bis ein Fehler auftritt.

Versuchen Sie die Ursache des Fehlers zu verstehen und überlegen Sie sich, wo genau die Race-Condition vorliegt. Wahrscheinlich wird der erste Fehler aus der Klasse `ArrayList` stammen. Dies ist aber nicht die einzige Race-Condition im Programm, es gibt noch eine zweite.

Beheben Sie die Race-Condition durch die Verwendung von kritischen Abschnitten und lassen Sie das Programm danach erneut mehrfach laufen. Wenn bei keinem der Durchläufe ein Fehler auftritt, gilt die Aufgabe als gelöst.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->