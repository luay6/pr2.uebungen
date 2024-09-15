# Ausnahmen testen
## Lernziel



Bei einer gegebenen Klasse Testfälle mit JUnit schreiben, die auf das Werfen von Ausnahmen testen.

## Aufgabe

Gehen Sie in das Paket [pr2.exceptions.ausnahmen_testen](../sources/src/main/java/pr2/exceptions/ausnahmen_testen/).

Sie finden in der Aufgabe eine einfache Implementierung einer [Caesar-Verschlüsselung](https://de.wikipedia.org/wiki/Caesar-Verschlüsselung) in der Klasse `CrypterCaesar`. Außerdem finden Sie noch einen JUnit-Test in dem entsprechenden Paket `test`.

Im JUnit-Test `CaesarTest` fehlen aber noch die Tests für die Ausnahmen. Diese werden geworfen, wenn die übergebenen Schlüssel bzw. die Klar- und Cypher-Texte nicht den Vorgaben entsprechen. Lesen Sie daher sorgfältig die JavaDoc der Klasse `CrypterCaesar` und fügen Sie dann entsprechende Testfälle in  `CaesarTest` hinzu, die auf das korrekte Werfen der Ausnahmen testen.

Lassen Sie Ihre Unit-Tests laufen und testen Sie, ob die Ausnahmen entsprechend der Vorgaben aus der JavaDoc geworfen werden.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->