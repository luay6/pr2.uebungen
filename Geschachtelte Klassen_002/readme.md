# Innere Klasse Beobachter
## Lernziel



Zugriff von inneren Klassen auf die umgebende Klasse.

## Aufgabe

Gehen Sie in das Paket: [pr2.lambda.observer](../sources/src/main/java/pr2/lambda/observer/).

Dort finden Sie das Interface `Beobachter`.

Schreiben Sie eine Klasse `Datenhalter`, die eine einziges, privates Attribut vom Typ `int` enthält. Setzen Sie das Attribut im Konstruktor, erzeugen Sie aber keinen Getter.

Implementieren Sie das Interface `Beobachter` als nicht-statische, private innere Klasse in `Datenhalter` und erlauben Sie über den Beobachter Zugriff auf das Attribut, indem Sie ein entsprechendes Objekt vom Typ `Beobachter` zurückgeben. Testen Sie Ihre Implementierung mit einem JUnit-Test.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->