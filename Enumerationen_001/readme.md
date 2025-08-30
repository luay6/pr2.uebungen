# Eigene Enumeration schreiben und verwenden
## Lernziel



Eine einfache Enumeration (ohne abstrakte Methoden) erstellen und in einem kleinen Programm einsetzen.

## Aufgabe

Gehen Sie in das Paket [pr2.enums.eigene](../sources/src/main/java/pr2/enums/eigene/).

In Rollenspielen verwendet man oft Würfel mit einer unterschiedlichen Anzahl von Seiten. Üblich sind 4-, 6-, 8-, 10-, und 12-seitige Würfel. Das vorliegende Programm erlaubt es unterschiedliche Würfel zu simulieren.

Betrachten Sie das vorliegende Projekt. Darin gibt es eine Klasse `Wuerfel`, die einen Würfel in einem Rollenspiel simulieren kann und einen dazugehörigen Test in `WuerfelTest`. Welche Art von Würfel man haben möchte, setzt man über den Konstruktorparameter von `Wuerfel` und die entsprechenden Konstanten (z.B. `D6`). Lassen Sie die Unit-Test laufen. Wahrscheinlich wird einer fehlschlagen. Korrigieren Sie den Fehler, damit alle Tests grün sind.

Das Problem mit der vorliegenden Klasse ist, dass man auch Würfel mit einer anderen Augenzahl (insbesondere ungerade) erzeugen kann. Um dies zu verhindern, sollen Sie das Programm auf die Verwendung von Enumerationen umstellen.

Schreiben Sie eine Enumeration `WuerfelTyp`, die über die Konstanten `D4`, `D6`,`D8`, `D10` und `D12` die möglichen Würfelarten vorgibt. Ändern Sie den Konstruktorparameter von `Wuerfel` so, dass er anstatt eines `int` einen `WuerfelTyp` nimmt. Damit das Programm erweiterbar bleibt, speichern Sie die Anzahl der Seiten, die zu den jeweiligen Typen gehören in der Enumeration und nicht in der Klasse `Wuerfel`. Geben Sie der Enumeration außerdem eine Methode mit, welche den erwarteten Durchschnittswert für eine große Anzahl von Würfen zurückgibt (Methodenname `average`).

Ändern Sie die Tests so, dass sie mit der Enumeration arbeiten. Codieren Sie die Enum-Werte (`D4`...`D12`) nicht hart im Test, sondern verwenden Sie die Methode `values()`, um die Tests möglichst generisch zu gestalten.

Fügen Sie nun einen weiteren Würfeltyp `D20` ein und testen Sie diesen. Wenn Sie alles richtig gemacht haben, müssen Sie hierfür nur die Enumeration `WuerfelTyp` ändern, alle anderen Klassen bleiben unverändert.


<!--
## Abgabe (optional)

__Sie müssen keine Lösung für diese Aufgabe einreichen.__

Sie können Ihre Lösung aber auf die Konformität mit den Programmierstandards testen. Hierzu gehen Sie wie folgt vor:

  1. Öffnen Sie eine Kommandozeile (Terminal).
  2. Gehen Sie in Ihr Working Directory.
  3. Wechseln Sie mit `cd` in das Verzeichnis `sources`.
  4. Bauen Sie das Projekt mit dem Kommando `mvn`.
-->