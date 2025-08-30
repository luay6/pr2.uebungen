# StringTransmogrifier
## Lernziel



Funktionale Interfaces entwerfen und verwenden.

## Aufgabe

Gehen Sie in das Paket [pr2.lambda.mogrifier_1](../sources/src/main/java/pr2/lambda/mogrifier_1/).

Schreiben Sie ein funktionales Interface namens `StringFunction`. Die Methode des Interfaces nimmt eine String und gibt einen String zurück.

Schreiben Sie eine Klasse `StringTransmogrifier`, die eine statische Methode `transmogrify` hat, der man ein String-Array und eine `StringFunction` übergibt. Die Methode wendet die Funktion auf jedes Element des Arrays an und gibt ein neues Array mit dem Ergebnis zurück.

Schreiben Sie eine Klasse `StringTransmogrifierTest`, die ein String-Array erzeugt und dann mithilfe der Klasse `StringTransmogrifier` die Elemente verändert. Nehmen Sie folgende Änderungen am Array vor, indem Sie entsprechende Lambda-Ausdrücke oder Methodenreferenzen übergeben:

  * Umwandeln aller Buchstaben in Kleinbuchstaben.
  * Umwandeln aller Buchstaben in Großbuchstaben.
  * Ersetzen jedes Buchstaben durch den im Alphabet folgenden.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->